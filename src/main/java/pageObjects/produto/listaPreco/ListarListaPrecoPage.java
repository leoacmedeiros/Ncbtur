package pageObjects.produto.listaPreco;

import org.openqa.selenium.By;

import core.BasePage;

public class ListarListaPrecoPage extends BasePage {

	public void novaListaDePreco() {
		clicarBotao(By.xpath("//a[@class='btn sbold green']"));
	}

	public void filtrarListaDePreco() {
		clicarBotao(By.xpath("//a[@class='btn sbold dark']"));
	}
	
	public void clonarListaDePreco() {
		clicarBotao(By.xpath("//button[@class='btn btn grey-mint btn-xs']"));
	}
	
	public void visualizarListaDePreco() {
		clicarBotao(By.xpath("//button[@class='btn btn-xs green']"));
	}

}
