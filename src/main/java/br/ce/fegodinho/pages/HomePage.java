package br.ce.fegodinho.pages;

import br.ce.fegodinho.core.BasePage;

public class HomePage extends BasePage {
	
	public String obterSaldoConta(String nome) {
		
		return obterCelula("Conta", nome, "Saldo", "tabelaSaldo").getText();		
	}

}
