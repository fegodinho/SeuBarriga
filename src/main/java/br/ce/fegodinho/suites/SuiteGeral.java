package br.ce.fegodinho.suites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.ce.fegodinho.core.DriverFactory;
import br.ce.fegodinho.pages.LoginPage;
import br.ce.fegodinho.tests.ContaTest;
import br.ce.fegodinho.tests.MovimentacaoTest;
import br.ce.fegodinho.tests.RemoverMovimentacaoContaTest;
import br.ce.fegodinho.tests.ResumoTest;
import br.ce.fegodinho.tests.SaldoTest;

@RunWith(Suite.class)
@SuiteClasses({
	ContaTest.class,
	MovimentacaoTest.class,
	RemoverMovimentacaoContaTest.class,
	SaldoTest.class,
	ResumoTest.class	
})
public class SuiteGeral {
	
	private static LoginPage page = new LoginPage();
	
	@BeforeClass
	public static void Inicializa() {
		page.acessarTelaInicial();
		page.setEmail("felipe@godinho");
		page.setSenha("123456");
		page.entrar();
	}
	
	@AfterClass
	public static void finaliza() {
		DriverFactory.killDriver();
	}

}
