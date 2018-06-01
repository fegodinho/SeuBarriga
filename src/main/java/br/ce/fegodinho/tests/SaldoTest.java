package br.ce.fegodinho.tests;

import org.junit.Assert;
import org.junit.Test;

import br.ce.fegodinho.core.BaseTest;
import br.ce.fegodinho.pages.HomePage;

public class SaldoTest extends BaseTest {
	
	private HomePage page = new HomePage();
	
	@Test
	public void testSaldoConta() {
		Assert.assertEquals("500.00", page.obterSaldoConta("Conta do Teste Alterada"));
		
	}

}
