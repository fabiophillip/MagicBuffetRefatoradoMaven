package junit;

import static org.junit.Assert.*;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Calendar;

import javax.swing.AbstractButton;
import javax.swing.JRadioButton;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import view.TelaBuscar;

public class TelaBuscarTest {

	@Before
	public void setUp() throws Exception 
	{
		java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaBuscar.getInstance().setVisible(true);
            }
        }); 
		
		TelaBuscar.getInstance().toFront();
	}
	
	@After
    public void tearDown() throws Exception 
    {
             
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                	TelaBuscar.getInstance().destruirTela();
                }
            }); 
    }

	@Test
	public void testBuscarClienteSemPreencherNada() 
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try
		{
			AbstractButton button = TelaBuscar.getInstance().getBotaoBuscar();
			JRadioButton radioButton = TelaBuscar.getInstance().getClienteRB();
			radioButton.setSelected(true);
            Point p = button.getLocationOnScreen();

            final Robot r = new Robot();
            r.delay(3000);
        
            r.mouseMove(p.x + button.getWidth() / 2, p.y + button.getHeight() / 2);
            r.mousePress(InputEvent.BUTTON1_MASK);
        
            r.delay(3000);
            r.mouseRelease(InputEvent.BUTTON1_MASK);
        
        
            r.delay(3000);
        

		}
		catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("falhou buscar cliente sem preencher nada");
		}
	}
	
	@Test
	public void testBuscarClienteQueNaoExiste() 
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try
		{
			AbstractButton button = TelaBuscar.getInstance().getBotaoBuscar();
			JRadioButton radioButton = TelaBuscar.getInstance().getClienteRB();
			radioButton.setSelected(true);
			TelaBuscar.getInstance().getCpfText().setText("00772543411");
			
            Point p = button.getLocationOnScreen();

            final Robot r = new Robot();
            r.delay(3000);
        
            r.mouseMove(p.x + button.getWidth() / 2, p.y + button.getHeight() / 2);
            r.mousePress(InputEvent.BUTTON1_MASK);
        
            r.delay(3000);
            r.mouseRelease(InputEvent.BUTTON1_MASK);
        
        
            r.delay(3000);
            
            r.keyPress(KeyEvent.VK_ENTER);
			
			r.delay(3000);
        

		}
		catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("falhou buscar cliente que nao existe");
		}
	}
	
	@Test
	public void testBuscarFestaSemPreencherNada() 
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try
		{
			AbstractButton button = TelaBuscar.getInstance().getBotaoBuscar();
			JRadioButton radioButton = TelaBuscar.getInstance().getFestaRB();
			radioButton.setSelected(true);
            Point p = button.getLocationOnScreen();

            final Robot r = new Robot();
            r.delay(3000);
        
            r.mouseMove(p.x + button.getWidth() / 2, p.y + button.getHeight() / 2);
            r.mousePress(InputEvent.BUTTON1_MASK);
        
            r.delay(3000);
            r.mouseRelease(InputEvent.BUTTON1_MASK);
        
            r.delay(3000);
            r.keyPress(KeyEvent.VK_ENTER);
			
			r.delay(3000);
        

		}
		catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("falhou buscar festa sem preencher nada");
		}
	}
	
	
	@Test
	public void testBuscarMonitorSemPreencherNada() 
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try
		{
			AbstractButton button = TelaBuscar.getInstance().getBotaoBuscar();
			JRadioButton radioButton = TelaBuscar.getInstance().getMonitorRB();
			radioButton.setSelected(true);
            Point p = button.getLocationOnScreen();

            final Robot r = new Robot();
            r.delay(3000);
        
            r.mouseMove(p.x + button.getWidth() / 2, p.y + button.getHeight() / 2);
            r.mousePress(InputEvent.BUTTON1_MASK);
        
            r.delay(3000);
            r.mouseRelease(InputEvent.BUTTON1_MASK);
        
        
            r.delay(3000);
        

		}
		catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("falhou buscar monitor sem preencher nada");
		}
	}
	
	
	@Test
	public void testBuscarMonitorQueNaoExiste() 
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try
		{
			AbstractButton button = TelaBuscar.getInstance().getBotaoBuscar();
			JRadioButton radioButton = TelaBuscar.getInstance().getMonitorRB();
			radioButton.setSelected(true);
			TelaBuscar.getInstance().getCpfText().setText("00772543411");
			
            Point p = button.getLocationOnScreen();

            final Robot r = new Robot();
            r.delay(3000);
        
            r.mouseMove(p.x + button.getWidth() / 2, p.y + button.getHeight() / 2);
            r.mousePress(InputEvent.BUTTON1_MASK);
        
            r.delay(3000);
            r.mouseRelease(InputEvent.BUTTON1_MASK);
        
        
            r.delay(3000);
            
            r.keyPress(KeyEvent.VK_ENTER);
			
			r.delay(3000);
        

		}
		catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("falhou buscar monitor que nao existe");
		}
	}

}
