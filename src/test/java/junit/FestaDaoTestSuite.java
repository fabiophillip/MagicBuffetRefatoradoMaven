package junit;

import static org.junit.Assert.*;

import java.rmi.server.UID;
import java.sql.Time;

import org.junit.Before;
import org.junit.Test;

import controler.Festa;
import entidadesDAO.FestaDAO;

public class FestaDaoTestSuite {

	private FestaDAO festaDao;
	@Before
	public void setUp() throws Exception {
		festaDao = new FestaDAO();
		//remover festas usadas no teste na insercao
		Festa novaFesta = new Festa();
		novaFesta.setDataInicio("2013/11/11");
		novaFesta.setEstiloFesta("Normal");
		novaFesta.setHoraInicio(Time.valueOf("08:40:00"));
		novaFesta.setIdFesta("12345");
		novaFesta.setLocal("Rua Maracajau");
		novaFesta.setPacote("pacote Completo");
		novaFesta.setPessoaCPF("556699999");
		novaFesta.setQuantidadeConvidados(3);
		novaFesta.setTema("Meninas Super Poderosas");
		novaFesta.setExterno(true);
		festaDao.remover(novaFesta);//se ja existia no BD
		
		Festa novaFesta2 = new Festa();
		novaFesta2.setDataInicio("2013/12/24");
		novaFesta2.setEstiloFesta("Normal");
		novaFesta2.setHoraInicio(Time.valueOf("08:40:00"));
		novaFesta2.setIdFesta("123456");
		novaFesta2.setLocal("Rua Maracajau");
		novaFesta2.setPacote("pacote Completo");
		novaFesta2.setPessoaCPF("556699999");
		novaFesta2.setQuantidadeConvidados(3);
		novaFesta2.setTema("Meninas Super Poderosas");
		novaFesta2.setExterno(true);
		festaDao.remover(novaFesta2);//se ja existia
		festaDao.criar(novaFesta2);
	}

	@Test
	public void testProcurarFestaInexistente() {
		Festa retornoPesquisaFesta = (Festa) festaDao.buscar("2013/11/11");//ele retorna um objeto festa vazio se nao tiver festa cadastrada
		assertEquals(retornoPesquisaFesta.getDataFim(), null);
		assertEquals(retornoPesquisaFesta.getDataInicio(), null);
		assertEquals(retornoPesquisaFesta.getEstiloFesta(), null);
		assertEquals(retornoPesquisaFesta.getHoraInicio(), null);
		assertEquals(retornoPesquisaFesta.getIdFesta(), null);
		assertEquals(retornoPesquisaFesta.getLocal(), null);
		assertEquals(retornoPesquisaFesta.getPacote(), null);
		assertEquals(retornoPesquisaFesta.getPessoaCPF(), null);
		assertEquals(retornoPesquisaFesta.getQuantidadeConvidados(), 0);
		assertEquals(retornoPesquisaFesta.getTema(), null);
	}
	
	
	
	@Test
	public void testCriarFestaHappyPath()
	{
		
		Festa novaFesta = new Festa();
		novaFesta.setDataInicio("2013/11/11");
		novaFesta.setEstiloFesta("Normal");
		novaFesta.setHoraInicio(Time.valueOf("08:40:00"));
		novaFesta.setIdFesta("12345");
		novaFesta.setLocal("Rua Maracajau");
		novaFesta.setPacote("pacote Completo");
		novaFesta.setPessoaCPF("556699999");
		novaFesta.setQuantidadeConvidados(3);
		novaFesta.setTema("Meninas Super Poderosas");
		novaFesta.setExterno(true);
		
		boolean criadaFesta = festaDao.criar(novaFesta);
		assertEquals(true, criadaFesta);
	}
	
	@Test
	public void testUpdateFestaHappyPath()
	{
		Festa festaAtualizar = new Festa();
		festaAtualizar.setDataInicio("2013/11/11");
		festaAtualizar.setEstiloFesta("Normal");
		festaAtualizar.setHoraInicio(Time.valueOf("08:40:00"));
		festaAtualizar.setIdFesta("12345");
		festaAtualizar.setLocal("Rua Maracajau");
		festaAtualizar.setPacote("pacote Completo");
		festaAtualizar.setPessoaCPF("556699999");
		festaAtualizar.setQuantidadeConvidados(3);
		festaAtualizar.setTema("Moranguinho");
		festaAtualizar.setExterno(true);
		
		boolean atualizadaFesta = festaDao.atualizar(festaAtualizar);
		assertEquals(true, atualizadaFesta);
	}
	
	@Test
	public void testRemoverFestaHappyPath()
	{
		Festa festaRemover = new Festa();
		festaRemover.setDataInicio("2013/12/24");
		festaRemover.setEstiloFesta("Normal");
		festaRemover.setHoraInicio(Time.valueOf("08:40:00"));
		festaRemover.setIdFesta("123456");
		festaRemover.setLocal("Rua Maracajau");
		festaRemover.setPacote("pacote Completo");
		festaRemover.setPessoaCPF("556699999");
		festaRemover.setQuantidadeConvidados(3);
		festaRemover.setTema("Meninas Super Poderosas");
		festaRemover.setExterno(true);
		//agora, tentar remover essa festa
		boolean festaRemovida = festaDao.remover(festaRemover);
		assertEquals(festaRemovida, true);
	}
	
	
	

}
