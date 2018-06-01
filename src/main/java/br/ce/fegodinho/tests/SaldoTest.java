package br.ce.fegodinho.tests;

import org.junit.Assert;
import org.junit.Test;

import br.ce.fegodinho.core.BaseTest;
import br.ce.fegodinho.core.Propriedades;
import br.ce.fegodinho.pages.HomePage;
import br.ce.fegodinho.pages.MenuPage;

public class SaldoTest extends BaseTest {
	
	private HomePage page = new HomePage();
	private MenuPage menuPage = new MenuPage();
	
	@Test
	public void testSaldoConta() {
		
		menuPage.acessarTelaPrincipal();
		
		Assert.assertEquals("500.00", page.obterSaldoConta(Propriedades.NOME_CONTA_ALTERADA));
		
	}

}
