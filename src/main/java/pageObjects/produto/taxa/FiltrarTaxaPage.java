package pageObjects.produto.taxa;

import org.openqa.selenium.By;

import core.BasePage;

public class FiltrarTaxaPage extends BasePage {

	public static final String CODIGO = "//input[@name='id']";
	public static final String NOME = "//input[@name='nome']";
	public static final String TIPO = "//select[@name='tipo']";
	public static final String SITUACAO = "//input[@name='ativo']";
	public static final String BUSCAR = "//button[@class='btn green']";

	public void setCodigo(String texto) {
		escrever(By.xpath(CODIGO), texto);
	}

	public void setNome(String texto) {
		escrever(By.xpath(NOME), texto);
	}

	public void setTipo(String texto) {
		selecionarComboPeloXPath(TIPO, texto);
	}

	public void setSituacao(String situacao) {
		if (situacao.trim().equals("Ativo")) {
			clicarCheck(By.xpath(SITUACAO));
		}
	}

	public void buscar() {
		clicarBotao(By.xpath(BUSCAR));
	}

}
