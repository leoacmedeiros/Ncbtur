package pageObjects.produto.listaPreco;

import org.openqa.selenium.By;

import core.BasePage;

public class FiltrarListaPrecoPage extends BasePage {

	public void setSituacao(String situacao) {
		if (situacao.trim().equals("Ativo")) {
			clicarCheck(By.xpath("//input[@name='ativo']"));
		}
	}

	public void buscar() {
		clicarBotao(By.xpath("//button[@class='btn green']"));
	}
}