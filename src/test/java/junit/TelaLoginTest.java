package junit;

import static org.junit.Assert.*;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import controler.Gerente;
import entidadesDAO.GerenteDAO;
import view.telaLogin;


public class TelaLoginTest {

	static telaLogin telaLogin;
	@Before
	public  void setUp() throws Exception {
		telaLogin = new telaLogin();
		view.telaLogin.main(null);
		java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                telaLogin = new telaLogin();
                telaLogin.setVisible(true);
                
            }
        });
	}

	@Test
	public void testEntrarComLoginQualquer() {
		try
		{
			//fail("Not yet implemented");
			try { Thread.sleep(3000); } catch (Exception e) {}
			JButton botaoEntrar = telaLogin.getEntrar();
			Point p = botaoEntrar.getLocationOnScreen();
			Robot r = new Robot();
	        r.mouseMove(p.x + botaoEntrar.getWidth() / 2, p.y + botaoEntrar.getHeight() / 2);
	        r.mousePress(InputEvent.BUTTON1_MASK);
	        try { Thread.sleep(3000); } catch (Exception e) {}
	        r.mouseRelease(InputEvent.BUTTON1_MASK);
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	            	 try { Thread.sleep(3000); } catch (Exception e) {}
	                
	            }
	        });
		}
		catch(AWTException exc)
		{
			exc.printStackTrace();
            fail("awt exception no teste da telaLogin clicar botao entrar");
		}

	}
	
	@Test
	public void testEntrarComLoginInexistente()
	{
		try { Thread.sleep(3000); } catch (Exception e) {}
		telaLogin.EntrarActionPerformed(null);
		try { Thread.sleep(3000); } catch (Exception e) {}
		
	}
	
	/*
	@Test
	public void testZEntrarComLoginSenhaErrada()
	{
		Gerente gerenteCriar = new Gerente("admin", "admin");
		GerenteDAO gerenteDAO = new GerenteDAO();
		gerenteDAO.remover(gerenteCriar);
		gerenteDAO.criar(gerenteCriar);
		try { Thread.sleep(3000); } catch (Exception e) {}
		telaLogin.getLoginTexto().setText("admin");
		try { Thread.sleep(3000); } catch (Exception e) {}
		telaLogin.EntrarActionPerformed(null);
		try { Thread.sleep(3000); } catch (Exception e) {}
		try {
			Robot r = new Robot();
			try { Thread.sleep(3000); } catch (Exception e) {}
			 r.mousePress(InputEvent.BUTTON1_MASK);
			 try { Thread.sleep(3000); } catch (Exception e) {}
			try { Thread.sleep(3000); } catch (Exception e) {}
			r.keyPress(KeyEvent.VK_ENTER);
			
			try { Thread.sleep(3000); } catch (Exception e) {}
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("test entrar coom login errado da view login está dando bug");
		}
		
		
		
	}*/
	
	

}

