package pageObjects.produto.gerenciarProduto;

import org.openqa.selenium.By;

import core.BasePage;

public class ListarProdutoPage extends BasePage {
	
	public static final String NOVO_PRODUTO = "//a[@class='btn sbold green']";
	public static final String FILTRO = "//a[@class='btn sbold dark']";
	public static final String EDITAR = "//button[@class='btn btn-xs blue']";
	public static final String VISUALIZAR = "//button[@class='btn btn-xs green']";
	public static final String INATIVAR = "//button[@class='btn btn-xs btn-situacao red']";

	public void novoProduto() {
		clicarBotao(By.xpath(NOVO_PRODUTO));
	}

	public void filtrarProduto() {
		clicarBotao(By.xpath(FILTRO));
	}

	public void editarProduto() {
		clicarBotao(By.xpath(EDITAR));
	}

	public void visualizarProduto() {
		clicarBotao(By.xpath(VISUALIZAR));
	}

	public void inativarProduto() {
		clicarBotao(By.xpath(INATIVAR));
	}

}
