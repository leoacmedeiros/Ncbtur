package pageObjects.produto.listaPreco;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage;

public class ClonarListaPrecoPage extends BasePage {

	public void setDataInicio(String data) {
		escrever(By.xpath("//input[@name='dataInicio']"), data);
	}

	public void salvar() {
		clicarBotao(By.xpath("//button[@class='btn btn-primary button-submit']"));
	}

	public void mensagemSucesso() {
		Assert.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
	}

}
