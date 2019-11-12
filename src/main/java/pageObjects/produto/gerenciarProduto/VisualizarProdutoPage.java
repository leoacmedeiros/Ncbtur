package pageObjects.produto.gerenciarProduto;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage;

public class VisualizarProdutoPage extends BasePage {
	
	public void verificarPagina() {
		Assert.assertEquals("Editar produto...", obterTexto(By.xpath("//span[@class='caption-helper']")));
	}

}
