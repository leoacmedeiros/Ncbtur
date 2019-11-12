package pageObjects.produto.campanha;

import org.openqa.selenium.By;

import core.BasePage;

public class FiltrarCampanhaPage extends BasePage {

	public static final String CODIGO = "//input[@name='id']";
	public static final String NOME = "//input[@name='nome']";
	public static final String BUSCAR = "//button[@class='btn green']";

	public void setCodigo(String codigo) {
		escrever(By.xpath(CODIGO), codigo);
	}

	public void setNome(String nome) {
		escrever(By.xpath(NOME), nome);
	}

	public void buscar() {
		clicarBotao(By.xpath(BUSCAR));
	}

}
