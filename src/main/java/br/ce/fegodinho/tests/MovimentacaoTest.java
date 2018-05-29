package br.ce.fegodinho.tests;

import org.junit.Assert;
import org.junit.Test;

import br.ce.fegodinho.core.BaseTest;
import br.ce.fegodinho.pages.MenuPage;
import br.ce.fegodinho.pages.MovimentacaoPage;

public class MovimentacaoTest extends BaseTest {
	
	private MenuPage menuPage = new MenuPage();
	private MovimentacaoPage movPage = new MovimentacaoPage();
	
	@Test
	public void testInserirMovimentacao() {
		menuPage.acessarTelaInserirMovimentacao();
		
		movPage.setDataMovimentacao("29/05/2018");
		movPage.setDataPagamento("29/06/2018");
		movPage.setDescricao("Movimentação do Teste");
		movPage.setInteressado("Interessado Qualquer");
		movPage.setValor("500");
		movPage.setConta("Conta do Teste Alterada");
		movPage.setStatusPago();
		movPage.salvar();
		
		Assert.assertEquals("Movimentação adicionada com sucesso!", movPage.obterMensagemSucesso());
	}

}
