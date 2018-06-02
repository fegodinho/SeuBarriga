package br.ce.fegodinho.core;


import static br.ce.fegodinho.core.DriverFactory.getDriver;
import static br.ce.fegodinho.core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.ce.fegodinho.pages.LoginPage;

public class BaseTest {
	
	@Rule
	public TestName testname = new TestName();
	
	private LoginPage page = new LoginPage();
	
	@Before
	public void Inicializa() {
		page.acessarTelaInicial();
		page.setEmail("felipe@godinho");
		page.setSenha("123456");
		page.entrar();
	}
	
	@After
	public void finalizacao() throws IOException {
		
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" + File.separator + testname.getMethodName() + ".jpg"));
		
		if (Propriedades.FECHAR_BROWSER) {
			killDriver();
		}		
	}

}
