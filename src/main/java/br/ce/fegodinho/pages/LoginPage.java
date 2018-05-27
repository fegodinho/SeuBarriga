package br.ce.fegodinho.pages;

import org.openqa.selenium.By;

import br.ce.fegodinho.core.BasePage;
import br.ce.fegodinho.core.DriverFactory;

public class LoginPage extends BasePage {
	
	public void acessarTelaInicial() {
		DriverFactory.getDriver().get("http://seubarriga.wcaquino.me/");
	}
	
	public void setEmail(String email) {
		escreve("email", email);
	}
	
	public void setSenha(String senha) {
		escreve("senha", senha);
	}
	
	public void entrar() {
		clicarBotao(By.xpath("//button[.='Entrar']"));		
	}
	
	public void logar(String email, String senha) {
		setEmail(email);
		setSenha(senha);
		entrar();
	}

}
