package junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import controler.Gerente;
import entidadesDAO.GerenteDAO;

public class GerenteDAOTest {

	private GerenteDAO gerenteDao;
	@Before
	public void setUp() throws Exception {
		gerenteDao = new GerenteDAO();
		Gerente gerenteLimparBd = new Gerente();
		gerenteLimparBd.setLogin("fulanoQualquer");
		gerenteLimparBd.setSenha("123667");
		gerenteDao.remover(gerenteLimparBd);//se ja existir esse gerente...
		
		gerenteDao = new GerenteDAO();
		Gerente gerenteParaBuscarBd = new Gerente();
		gerenteParaBuscarBd.setLogin("fulano2");
		gerenteParaBuscarBd.setSenha("127599");
		gerenteDao.remover(gerenteParaBuscarBd);//se ja existir esse gerente...
		gerenteDao.criar(gerenteParaBuscarBd);
		
		gerenteDao = new GerenteDAO();
		Gerente gerenteParaRemover = new Gerente();
		gerenteParaRemover.setLogin("fulano3");
		gerenteParaRemover.setSenha("127596808");
		gerenteDao.remover(gerenteParaRemover);//se ja existir esse gerente...
		gerenteDao.criar(gerenteParaRemover);
		
	}

	@Test
	public void testCriarUmGerenteHappyPath() 
	{
		Gerente novoGerente = new Gerente();
		novoGerente.setLogin("fulanoQualquer");
		novoGerente.setSenha("123667");
		boolean criouGerente = gerenteDao.criar(novoGerente);
		assertEquals(criouGerente, true);
	}
	
	@Test
	public void testBuscarUmGerenteHappyPath()
	{
		
		Gerente gerenteAchado = (Gerente) gerenteDao.buscar("fulano2");
		assertEquals(gerenteAchado.getLogin(), "fulano2");
		assertEquals(gerenteAchado.getSenha(), "127599");
	}
	
	@Test
	public void testRemoverUmGErenteHappyPath()
	{
		
		Gerente gerenteParaRemover = new Gerente();
		gerenteParaRemover.setLogin("fulano3");
		gerenteParaRemover.setSenha("127596808");
		boolean removeu = gerenteDao.remover(gerenteParaRemover);
		assertEquals(true, removeu);
	}
	
	

}
