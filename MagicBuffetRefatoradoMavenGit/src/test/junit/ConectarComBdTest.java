package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import conexao.ConectionFactory;

public class ConectarComBdTest {

	@Test
	public void conectarComBDtest() 
	{
		try
		{
			ConectionFactory conector = new ConectionFactory();
			conector.getConnection();
		}
		catch(Exception e)
		{
			fail("teste falhou");
		}
	}

}
