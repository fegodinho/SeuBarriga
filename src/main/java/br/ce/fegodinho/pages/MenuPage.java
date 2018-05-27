package br.ce.fegodinho.pages;

import br.ce.fegodinho.core.BasePage;

public class MenuPage extends BasePage {
	
	public void acessarTelaInserirConta() {
		clicarLink("Contas");
		clicarLink("Adicionar");
	}

}
