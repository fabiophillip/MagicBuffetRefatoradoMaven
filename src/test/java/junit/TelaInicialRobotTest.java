package junit;

import static org.junit.Assert.*;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;

import javax.swing.AbstractButton;
import javax.swing.JFrame;





import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import view.TelaInicial;

import org.junit.runner.RunWith;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TelaInicialRobotTest {
        
        
    private JFrame  frame;

        
        
        @Before
        public void setUp() throws Exception 
        {
                 
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        TelaInicial.getInstance().setVisible(true);
                    }
                }); 
        }

        @Test
        public void testClicarNoBotaoBuscar() 
        {
                
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
                    try { Thread.sleep(3000); } catch (Exception e) {}

                }
                catch (AWTException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                        fail("falhou clicar no botao buscar");
                }
        }
        
        
        @Test
        public void testClicarNoBotaoFesta() 
        {
                
                try
                {

                        try { Thread.sleep(3000); } catch (Exception e) {}

                        AbstractButton button = TelaInicial.getInstance().getFESTA();

                        Point p = button.getLocationOnScreen();

                    Robot r = new Robot();
                    r.mouseMove(p.x + button.getWidth() / 2, p.y + button.getHeight() / 2);
                    r.mousePress(InputEvent.BUTTON1_MASK);
                    try { Thread.sleep(3000); } catch (Exception e) {}
                    r.mouseRelease(InputEvent.BUTTON1_MASK);
                    try { Thread.sleep(3000); } catch (Exception e) {}

                }
                catch (AWTException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                        fail("falhou clicar no botao festa");
                }
        }
        
        @Test
        public void testClicarNoBotaoItens() 
        {
                
                try
                {

                        try { Thread.sleep(3000); } catch (Exception e) {}

                        AbstractButton button = TelaInicial.getInstance().getITENS();

                        Point p = button.getLocationOnScreen();

                    Robot r = new Robot();
                    r.mouseMove(p.x + button.getWidth() / 2, p.y + button.getHeight() / 2);
                    r.mousePress(InputEvent.BUTTON1_MASK);
                    try { Thread.sleep(3000); } catch (Exception e) {}
                    r.mouseRelease(InputEvent.BUTTON1_MASK);
                    try { Thread.sleep(3000); } catch (Exception e) {}

                }
                catch (AWTException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                        fail("falhou clicar no botao itens");
                }
        }
        
        @Test
        public void testClicarNoBotaoPacote() 
        {
                
                try
                {

                        try { Thread.sleep(3000); } catch (Exception e) {}

                        AbstractButton button = TelaInicial.getInstance().getPACOTE();

                        Point p = button.getLocationOnScreen();

                    Robot r = new Robot();
                    r.mouseMove(p.x + button.getWidth() / 2, p.y + button.getHeight() / 2);
                    r.mousePress(InputEvent.BUTTON1_MASK);
                    try { Thread.sleep(3000); } catch (Exception e) {}
                    r.mouseRelease(InputEvent.BUTTON1_MASK);
                    try { Thread.sleep(3000); } catch (Exception e) {}

                }
                catch (AWTException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                        fail("falhou clicar no botao pacote");
                }
        }
        
        @Test
        public void testClicarNoBotaoTema() 
        {
                
                try
                {

                        try { Thread.sleep(3000); } catch (Exception e) {}

                        AbstractButton button = TelaInicial.getInstance().getTEMA();

                        Point p = button.getLocationOnScreen();

                    Robot r = new Robot();
                    r.mouseMove(p.x + button.getWidth() / 2, p.y + button.getHeight() / 2);
                    r.mousePress(InputEvent.BUTTON1_MASK);
                    try { Thread.sleep(3000); } catch (Exception e) {}
                    r.mouseRelease(InputEvent.BUTTON1_MASK);
                    try { Thread.sleep(3000); } catch (Exception e) {}

                }
                catch (AWTException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                        fail("falhou clicar no botao tema");
                }
        }
        
        @Test
        public void testClicarNoUltimoBotaoCadastros() 
        {
                
                try
                {

                        try { Thread.sleep(3000); } catch (Exception e) {}

                        AbstractButton button = TelaInicial.getInstance().getCadastros();

                        Point p = button.getLocationOnScreen();

                    Robot r = new Robot();
                    r.mouseMove(p.x + button.getWidth() / 2, p.y + button.getHeight() / 2);
                    r.mousePress(InputEvent.BUTTON1_MASK);
                    try { Thread.sleep(3000); } catch (Exception e) {}
                    r.mouseRelease(InputEvent.BUTTON1_MASK);
                    try { Thread.sleep(3000); } catch (Exception e) {}

                }
                catch (AWTException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                        fail("falhou clicar no botao cadastros");
                }
        }
        
        
        @Test
        public void testExecutarMain() 
        {
                
                try
                {
                        TelaInicial.getInstance().main(null);
                }
                catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                        fail("falhou em executar main da tela inicial");
                }
        }
        
         

}
