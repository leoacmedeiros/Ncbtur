package pageObjects.produto.canalVendas;

import org.openqa.selenium.By;

import core.BasePage;

public class ListarCanalVendasPage extends BasePage {
	
	public void novoCanalVenda() {
		clicarBotao(By.xpath("//a[@class='btn sbold green']"));
	}
	
	public void filtrarCanalVenda() {
		clicarBotao(By.xpath("//a[@class='btn sbold dark']"));
	}
	
	public void visualizarCanalVenda() {
		clicarBotao(By.xpath("//button[@class='btn btn-xs green']"));
	}
}
