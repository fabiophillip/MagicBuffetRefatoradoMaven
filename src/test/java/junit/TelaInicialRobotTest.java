package junit;

import static org.junit.Assert.*;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;

import javax.swing.AbstractButton;
import javax.swing.JFrame;



import org.junit.Before;
import org.junit.Test;

import view.TelaInicial;




public class TelaInicialRobotTest {
	
	
    private JFrame  frame;

	
	
	@Before
	public void setUp() throws Exception {
		 
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                TelaInicial.getInstance().setVisible(true);
	            }
	        });
	        
	        
	}

	@Test
	public void test() {
		
		
		try
		{
			try { Thread.sleep(3000); } catch (Exception e) {}
			AbstractButton button = TelaInicial.getInstance().getBotaoBuscar();
			Point p = button.getLocationOnScreen();
		    Robot r = new Robot();
		    r.mouseMove(p.x + button.getWidth() / 2, p.y + button.getHeight() / 2);
		    r.mousePress(InputEvent.BUTTON1_MASK);
		    try { Thread.sleep(3000); } catch (Exception e) {}
		    r.mouseRelease(InputEvent.BUTTON1_MASK);
		}
	    catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("awt exception");
		}
		
		
       
	}
	
	 

}
