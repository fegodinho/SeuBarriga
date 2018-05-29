package br.ce.fegodinho.pages;

import org.openqa.selenium.By;

import br.ce.fegodinho.core.BasePage;

public class MovimentacaoPage extends BasePage {
	
	public void setDataMovimentacao(String data) {
		escreve("data_transacao", data);
	}
	
	public void setDataPagamento(String data) {
		escreve("data_pagamento", data);
	}
	
	public void setDescricao(String descricao) {
		escreve("descricao", descricao);
	}
	
	public void setInteressado(String interessado) {
		escreve("interessado", interessado);
	}
	
	public void setValor(String valor) {
		escreve("valor", valor);
	}
	
	public void setConta(String conta) {
		selecionarCombo("conta", conta);
	}
	
	public void setStatusPago() {
		clicarRadioButton("status_pago");
	}
	
	public void salvar() {
		clicarBotaoPorTexto("Salvar");		
	}
	
	public String obterMensagemSucesso() {
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));	
	}
	

}