package br.ce.fegodinho.tests;

import static br.ce.fegodinho.core.DriverFactory.getDriver;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.ce.fegodinho.core.BaseTest;
import br.ce.fegodinho.core.DriverFactory;
import br.ce.fegodinho.pages.MenuPage;
import br.ce.fegodinho.pages.ResumoPage;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//Solucao alternativa para definir a ordem de execucao dos testes na classe
//para que funcione, necessario renomear os testes de acordo
//ex. adicionando um prefixo test1, test2...

public class ResumoTest extends BaseTest {
	private MenuPage menuPage = new MenuPage();
	private ResumoPage resumoPage = new ResumoPage();
	
	@Test
	public void testExcluirMovimentacao() {
		menuPage.acessarTelaResumo();
		
		resumoPage.excluirMovimentacao();
		
		Assert.assertEquals("Movimentação removida com sucesso!", resumoPage.obterMensagemSucesso());		
	}
	
	//Possivel solução 1
	//@Test(expected=NoSuchElementException.class)
	//Passa o teste caso ocorra exececao. Não garante completamente o resultado já que
	//essa excecao poderá ser gerada por algum outro motivo desconhecido e nao o que o teste está esperando
	@Test
	public void testResumoMensal() {
		menuPage.acessarTelaResumo();
		
		Assert.assertEquals("Seu Barriga - Extrato", getDriver().getTitle());
		
		resumoPage.selecionarAno("2016");
		resumoPage.buscar();
		
		List<WebElement> elementosEncontrados =
				DriverFactory.getDriver().findElements(By.xpath("//*[@id='tabelaExtrato']/tbody/tr"));
		
		Assert.assertEquals(0, elementosEncontrados.size());
		
		//Possivel solucao 2 para verificar que a tabela está vazia
		//resolve o problema mas perde em performance já que o driver aguarda muito
		//para se certificar de que realmente nao encontrou nada
		/*try {
			DriverFactory.getDriver().findElement(By.xpath("//*[@id='tabelaExtrato']/tbody/tr"));
			Assert.fail();
		} catch (NoSuchElementException e) {
			
		}*/
	}
}
