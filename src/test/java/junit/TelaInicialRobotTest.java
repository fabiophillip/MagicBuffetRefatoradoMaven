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
	
		
       
	}

}
