package junit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

import controler.Item;
import controler.Pacote;
import entidadesDAO.ItemDAO;

public class ItemDAOTest {
	private ItemDAO itemDAO;

	@Before
	public void setUp() throws Exception {
		itemDAO = new ItemDAO();
		Item itemFestaRemoverVouCriar = new Item();
		itemFestaRemoverVouCriar.setIdItem("57297");
		itemDAO.remover(itemFestaRemoverVouCriar);//removi pq vou criar depois
		itemFestaRemoverVouCriar.setIdItem("862868662");
		itemDAO.remover(itemFestaRemoverVouCriar);
		itemFestaRemoverVouCriar.setIdItem("44680");
		itemDAO.remover(itemFestaRemoverVouCriar);
		
	}

	@Test
	public void testCriarItemQualquer() {
		Item itemFesta = new Item();
		itemFesta.setIdItem("57297");
		itemFesta.setNomeItem("party cannon");
		itemFesta.setQuantidadeTotal(3);
		itemFesta.setPrecoUnidade(new Float(30.40));
		boolean itemCriado = itemDAO.criar(itemFesta);
		assertEquals(itemCriado, true);
	}
	
	public void testCriarItemQualquerConstrutorCompleto()
	{
		Item itemFesta = new Item("44680", "the great and powerful trixie", 1,new Float(100.00));
		
		boolean itemCriado = itemDAO.criar(itemFesta);
		assertEquals(itemCriado, true);
	}
	
	@Test
	public void testRemoverItem()
	{
		Item itemFestaVouRemover = new Item();
		itemFestaVouRemover.setIdItem("862868662");
		itemFestaVouRemover.setNomeItem("cupcakes");
		itemFestaVouRemover.setQuantidadeTotal(20);
		itemFestaVouRemover.setPrecoUnidade(new Float(100.00));
		itemDAO.criar(itemFestaVouRemover);//eu vou remover esse 
		
		
		boolean removido = itemDAO.remover(itemFestaVouRemover);
		assertEquals(true, removido);
	}
	
	@Test
	public void testAtualizarItem()
	{
		Item itemFestaVouAtualizar = new Item();
		itemFestaVouAtualizar.setIdItem("862868662");
		itemFestaVouAtualizar.setNomeItem("cupcakes");
		itemFestaVouAtualizar.setQuantidadeTotal(20);
		itemFestaVouAtualizar.setPrecoUnidade(new Float(100.00));
		itemDAO.criar(itemFestaVouAtualizar);//eu vou atualizar esse 
		
		
		itemFestaVouAtualizar.setNomeItem("cupcakes da vovo");
		boolean atualizou = itemDAO.atualizar(itemFestaVouAtualizar);
		
		itemDAO.remover(itemFestaVouAtualizar);//para o reteste
		assertEquals(true, atualizou);
	}
	
	@Test
	public void testBuscarTodosOsItens()
	{
		Item itemFesta = new Item();
		itemFesta.setIdItem("862868662");
		itemFesta.setNomeItem("cupcakes");
		itemFesta.setQuantidadeTotal(20);
		itemFesta.setPrecoUnidade(new Float(100.00));
		itemDAO.criar(itemFesta);//eu vou adicionar esse para ter algo para pegar
		ArrayList<Object> itensResultadoBusca = itemDAO.buscar();
		itemDAO.remover(itemFesta);//para testex futuros
		if(itensResultadoBusca == null || itensResultadoBusca.size() == 0)
		{
			fail("buscar todos os itens de festa está dando erro");
		}
	}
	
	@Test
	public void testBuscarItensDoPacote()
	{
		Pacote pacote = new Pacote();
		pacote.setPacoteNome("pacote Basico");//por default, esse pacote tem um item
		ArrayList<Item> itensDoPacote = itemDAO.buscarItensPacote(pacote);
		if(itensDoPacote == null || itensDoPacote.size() == 0)
		{
			fail("buscar itens de pacote que tem itends por default estah dandoo erro");
		}
	}
	
	public void testBuscarItemPorNome()
	{
		Item itemBuscar = new Item();
		itemBuscar.setIdItem("862868662");
		itemBuscar.setNomeItem("cupcakes");
		itemBuscar.setQuantidadeTotal(20);
		itemBuscar.setPrecoUnidade(new Float(100.00));
		itemDAO.criar(itemBuscar);//eu vou adicionar esse para ter algo para pegar
		
		Item itemAchado = itemDAO.buscarNome("cupcakes");
		
		itemDAO.remover(itemBuscar);//para futuros testes
		if(itemAchado == null || itemAchado.getNomeItem().compareTo("cupcakes") != 0)
		{
			fail("buscar item por nome nao estah funcionando");
		}
		
	}
	
	

}
