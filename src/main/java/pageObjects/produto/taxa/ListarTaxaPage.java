package pageObjects.produto.taxa;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage;

public class ListarTaxaPage extends BasePage {

	public static final String NOVA_TAXA = "//a[@class='btn sbold green']";
	public static final String FILTRO = "//a[@class='btn sbold dark']";
	public static final String EDITAR = "//button[@class='btn btn-xs blue']";
	public static final String VISUALIZAR = "//button[@class='btn btn-xs green']";
	public static final String INATIVAR = "//button[@class='btn btn-xs btn-situacao red']";
	public static final String ATIVAR = "//button[@class='btn btn-xs btn-situacao green']";
	public static final String CONFIRMAR_INATIVAR = "//button[@class='btn btn-primary']";
	public static final String SUCESSO_INATIVAR = "//div[@class='toast-message']";

	public void novaTaxa() {
		clicarBotao(By.xpath(NOVA_TAXA));
	}

	public void filtrarTaxa() {
		clicarBotao(By.xpath(FILTRO));
	}

	public void editarTaxa() {
		clicarBotao(By.xpath(EDITAR));
	}

	public void visualizarTaxa() {
		clicarBotao(By.xpath(VISUALIZAR));
	}

	public void inativarTaxa() {
		clicarBotao(By.xpath(INATIVAR));
	}

	public void ativarTaxa() {
		clicarBotao(By.xpath(ATIVAR));
	}

	public void confirmarInativar() {
		clicarBotao(By.xpath(CONFIRMAR_INATIVAR));
	}

	public void confirmarAtivar() {
		clicarBotao(By.xpath(CONFIRMAR_INATIVAR));
	}
	
	public void mensagemSucessoInativar() {
		Assert.assertEquals("Situação atualizada com sucesso.", obterTexto(By.xpath(SUCESSO_INATIVAR)));
	}

}