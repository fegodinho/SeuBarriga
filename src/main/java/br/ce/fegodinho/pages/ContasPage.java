package br.ce.fegodinho.pages;

import org.openqa.selenium.By;

import br.ce.fegodinho.core.BasePage;

public class ContasPage extends BasePage {
	
	public void setNome(String nome) {
		escreve("nome", nome);				
	}
	
	public void salvar() {
		clicarBotao(By.xpath("//button[.='Salvar']"));
	}
	
	public String obterMensagemSucesso() {
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));	
	}

}
