package junit;

import static org.junit.Assert.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.junit.Before;
import org.junit.Test;

import view.TelaInicial;

public class TelaInicialRobotTest {

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
		/* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
		Robot robot;
		try {
			robot = new Robot();
			int posicaoXBotaoBuscar = TelaInicial.getInstance().getBotaoBuscar().getLocation().x;
			int posicaoYBotaoBuscar = TelaInicial.getInstance().getBotaoBuscar().getLocation().y;
			
			

			robot.mouseMove(posicaoXBotaoBuscar, posicaoYBotaoBuscar);
			robot.delay(3000);
			
			
			robot.mousePress(InputEvent.BUTTON1_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("awt exception");
		}
		
       
	}

}
