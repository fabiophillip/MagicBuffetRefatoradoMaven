package junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import controler.Tema;
import entidadesDAO.TemaDAO;

public class TemaDAOTest 
{
	TemaDAO temaDAO;

	@Before
	public void setUp() throws Exception 
	{
		temaDAO = new TemaDAO();
	}

	
	@Test
	public void testCriarTemaValido() 
	{
		Tema t = new Tema("mlp","my little pony");
		boolean conseguiuCriar = temaDAO.criar(t);
		assertEquals(conseguiuCriar,true);
	}
	
	
	@Test
	public void testBuscarPorTemaValido() 
	{
		String idTemaPica = "21";
		Tema t = (Tema) temaDAO.buscar(idTemaPica);
		assertEquals(t.getTnome(),"Pica-pau");
	}
	
	@Test
	public void atualizarTemaValido() 
	{
		String idTemaMoranguinho = "43";
		String novoTituloFestaMoranguinho = "berry bitty adventures";
		Tema t = new Tema(idTemaMoranguinho,novoTituloFestaMoranguinho);
		boolean conseguiuAtualizar = temaDAO.atualizar(t);
		
		assertEquals(conseguiuAtualizar,true);
	}
	
	@Test
	public void removerTemaValido() 
	{
		//criarei um tema e depois o removerei
		String idNovoTema = "llpsy";
		String novoTema = "lalaloopsy";
		Tema t = new Tema(idNovoTema,novoTema);
		boolean conseguiuCriar = temaDAO.criar(t);
		
		if(conseguiuCriar == true)
		{
			//vamos remove-lo
			boolean conseguiuRemover = temaDAO.remover(t);
			
			assertEquals(conseguiuRemover,true);
		}
		else
		{
			fail("nao conseguiu criar o tema para deletar");
		}
		
	}
	
	@Test
	public void testBuscarTodosOsTemas() 
	{
		ArrayList<Object> temas = temaDAO.buscar();
		if(temas.size() == 0)
		{
			fail("nao conseguiu pegar nem os temas criados por default");
		}
	}
	
	
	
}
