package pageObjects.produto.canalVendas;

import org.openqa.selenium.By;

import core.BasePage;

public class FiltrarCanalVendasPage extends BasePage {

	public void setCodigo(String codigo) {
		escrever(By.xpath("//input[@name='canalVendasID']"), codigo);
	}

	public void setNome(String nome) {
		escrever(By.xpath("(//input[@name='nome'])[1]"), nome);
	}

	public void setCnpj(String cnpj) {
		escrever(By.xpath("(//input[@name='nome'])[2]"), cnpj);
	}
	
	public void setTipo(String tipo) {
		selecionarComboPeloXPath("//select[@name='tipo']", tipo);
	}
	
	public void setSituacao(String situacao) {
		selecionarComboPeloXPath("//select[@name='situacao']", situacao);
	}
	
	public void buscar() {
		clicarBotao(By.xpath("//button[@class='btn green']"));
	}

}
