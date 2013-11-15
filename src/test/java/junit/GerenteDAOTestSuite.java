package junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import controler.Gerente;
import entidadesDAO.GerenteDAO;

public class GerenteDAOTestSuite {

	private GerenteDAO gerenteDao;
	@Before
	public void setUp() throws Exception {
		gerenteDao = new GerenteDAO();
		Gerente gerenteLimparBd = new Gerente();
		gerenteLimparBd.setLogin("fulanoQualquer");
		gerenteLimparBd.setSenha("123667");
		gerenteDao.remover(gerenteLimparBd);//se já existir esse gerente...
		
		gerenteDao = new GerenteDAO();
		Gerente gerenteParaBuscarBd = new Gerente();
		gerenteParaBuscarBd.setLogin("fulano2");
		gerenteParaBuscarBd.setSenha("127599");
		gerenteDao.remover(gerenteParaBuscarBd);//se já existir esse gerente...
		gerenteDao.criar(gerenteParaBuscarBd);
		
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
	
	

}
