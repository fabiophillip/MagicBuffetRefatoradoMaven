package junit;

import static org.junit.Assert.*;

import java.awt.Component;

import javax.swing.JButton;

import junit.extensions.abbot.ComponentTestFixture;

import org.junit.Before;
import org.junit.Test;

import abbot.finder.ComponentNotFoundException;
import abbot.finder.Matcher;
import abbot.finder.MultipleComponentsFoundException;
import abbot.tester.JTextComponentTester;
import view.TelaInicial;

public class TelaInicialTest  extends ComponentTestFixture
{
	/*public TelaInicialTest(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	TelaInicial telaInicial;

	@Before
	public void setUp() throws Exception 
	{
		telaInicial = TelaInicial.getInstance();
		System.out.println("setup terminou");
	}

	@Test
	public void testClicarBotaoCadastros() 
	{
		System.out.println("testClicarBotaoCadastros comecou");
		
		try {
			JButton botaoCadastros = (JButton)getFinder().find(new Matcher() {
			    public boolean matches(Component c) {
			        // Add as much information as needed to distinguish the component
			        return c instanceof JButton && ((JButton)c).getText().equals("CADASTROS");
			    }
			});
			
			System.out.println("botao cadastros achado");
			
			showFrame(botaoCadastros);
			
			System.out.println("showframe executado");
			JTextComponentTester tester = new JTextComponentTester();
			tester.actionClick(botaoCadastros);
		} catch (ComponentNotFoundException e) 
		{
			System.out.println("componente nao achado");
			fail("componente nao achado");
		} catch (MultipleComponentsFoundException e) 
		{
			System.out.println("multiplos componentes achados");
			fail("multiplos componentes achados");
		}
	}*/

}
