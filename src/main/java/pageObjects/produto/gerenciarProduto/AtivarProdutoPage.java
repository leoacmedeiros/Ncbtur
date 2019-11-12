package pageObjects.produto.gerenciarProduto;

import org.openqa.selenium.By;

import core.BasePage;

public class AtivarProdutoPage extends BasePage {

	public static final String MSG_ALERT = "//button[@class='btn btn-primary']";

	public void confirmarMensagem() {
		clicarBotao(By.xpath(MSG_ALERT));
	}
}
