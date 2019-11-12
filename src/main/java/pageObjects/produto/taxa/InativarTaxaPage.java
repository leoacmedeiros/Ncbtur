package pageObjects.produto.taxa;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage;

public class InativarTaxaPage extends BasePage {

	public static final String CONFIRMAR_INATIVAR = "//button[@class='btn btn-primary']";
	public static final String SUCESSO = "//div[@class='toast-message']";

	public void confirmarInativar() {
		clicarBotao(By.xpath(CONFIRMAR_INATIVAR));
	}

	public void mensagemSucesso() {
		Assert.assertEquals("Situação atualizada com sucesso.", obterTexto(By.xpath(SUCESSO)));
	}

}
