package br.ce.fegodinho.tests;

import static br.ce.fegodinho.core.DriverFactory.getDriver;

import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.ce.fegodinho.core.BaseTest;
import br.ce.fegodinho.core.DriverFactory;
import br.ce.fegodinho.pages.MenuPage;
import br.ce.fegodinho.pages.ResumoPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResumoTest extends BaseTest {
	private MenuPage menuPage = new MenuPage();
	private ResumoPage resumoPage = new ResumoPage();
	
	@Test
	public void test1_ExcluirMovimentacao() {
		menuPage.acessarTelaResumo();
		
		resumoPage.excluirMovimentacao();
		
		Assert.assertEquals("Movimentação removida com sucesso!", resumoPage.obterMensagemSucesso());		
	}
	
	//Possivel solução 1
	//@Test(expected=NoSuchElementException.class)
	@Test
	public void test2_ResumoMensal() {
		menuPage.acessarTelaResumo();
		
		Assert.assertEquals("Seu Barriga - Extrato", getDriver().getTitle());
		
		resumoPage.selecionarAno("2016");
		resumoPage.buscar();
		
		List<WebElement> elementosEncontrados =
				DriverFactory.getDriver().findElements(By.xpath("//*[@id='tabelaExtrato']/tbody/tr"));
		
		Assert.assertEquals(0, elementosEncontrados.size());
		
		//Possivel solucao 2 para verificar que a tabela está vazia
		/*try {
			DriverFactory.getDriver().findElement(By.xpath("//*[@id='tabelaExtrato']/tbody/tr"));
			Assert.fail();
		} catch (NoSuchElementException e) {
			
		}*/
	}
}
