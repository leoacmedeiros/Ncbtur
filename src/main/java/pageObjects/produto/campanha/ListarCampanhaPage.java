package pageObjects.produto.campanha;

import org.openqa.selenium.By;

import core.BasePage;

public class ListarCampanhaPage extends BasePage {

	public void novaCampanha() {
		clicarBotao(By.xpath("//a[@class='btn sbold green']"));
	}

	public void filtraCampanha() {
		clicarBotao(By.xpath("//a[@class='btn sbold dark']"));
	}

	public void editarCampanha() {
		clicarBotao(By.xpath("//button[@class='btn btn-xs blue']"));
	}
	
	public void visualizarCampanha() {
		clicarBotao(By.xpath("//button[@class='btn btn-xs green']"));
	}
	
	public void inativarCampanha() {
		clicarBotao(By.xpath("//button[@class='btn btn-xs btn-situacao red']"));
	}
}
