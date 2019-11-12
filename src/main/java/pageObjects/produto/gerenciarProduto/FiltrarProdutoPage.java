package pageObjects.produto.gerenciarProduto;

import org.openqa.selenium.By;

import core.BasePage;

public class FiltrarProdutoPage extends BasePage {

	public static final String CODIGO = "//input[@name='id']";
	public static final String NOME = "//input[@name='input']";
	public static final String CATEGORIA = "//select[@name='categoria']";
	public static final String SITUACAO = "//input[@name='ativo']";
	public static final String BUSCAR = "//button[@class='btn green']";

	public void setCodigo(String texto) {
		escrever(By.xpath(CODIGO), texto);
	}

	public void setNome(String texto) {
		escrever(By.xpath(NOME), texto);
		clicarBotao(By.xpath("//ul[@class='typeahead']"));
	}

	public void setCategoria(String texto) {
		selecionarComboPorXPath(CATEGORIA, texto);
	}

	public void setSituacao() {
		clicarCheck(By.xpath(SITUACAO));
	}

	public void buscar() {
		clicarBotao(By.xpath(BUSCAR));
	}

}
