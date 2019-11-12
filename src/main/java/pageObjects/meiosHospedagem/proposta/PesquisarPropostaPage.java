package pageObjects.meiosHospedagem.proposta;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import core.BasePage;
import core.DriverFactory;

public class PesquisarPropostaPage extends BasePage {

	public void clicarBotaoFiltrar() {
		clicarBotao(By.xpath("//button[contains(text(),'Filtrar')]"));
	}

	public void clicarBotaoLimpar() {
		clicarBotao(By.xpath("//button[contains(text(),'Limpar')]"));

	}

	public void pesquisarCodProposta(String propostaId) {

		JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.getDriver();
		jse.executeScript("scroll(0, -250);");

		escrever(By.name("propostaId"), propostaId);

	}

	public void achouCodigoPropostaPesquisado() {
		try {
			Assert.assertEquals("12", obterTexto(By.xpath("//tbody//tr//td[@class='data-column column-id']//div")));

			System.out.println("Código pesquisado encontrado!");
		} catch (AssertionError e) {
			System.out.println("ERRO! Código não encontrado!");

		}
	}

	public void pesquisarCodMeioHospedagem(String hotelId) {
		escrever(By.name("hotelId"), hotelId);
	}

	public void achouCodigoMeioHospPesquisado() {
		try {
			Assert.assertEquals("1314", obterTexto(By.xpath("(//tbody//tr//td)[7]//span")));

			System.out.println("Código Meio Hospedagem pesquisado encontrado!");
		} catch (AssertionError e) {
			System.out.println("ERRO! Código Meio Hospedagem não encontrado!");

		}
	}
	
	public void pesquisarNomeMeioHospedagem(String nomeFantasia) {
		
		JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.getDriver();
		jse.executeScript("scroll(0, -250);");

		escrever(By.name("nomeFantasia"), nomeFantasia);
		}
	
	public void achouNomeMeioHospPesquisado() {
		try {
			Assert.assertEquals("HOTEL POUSADA VILLA DO CERRADO", obterTexto(By.xpath("//td[@class='data-column column-nomeFantasia']//span")));

			System.out.println("Nome Meio Hospedagem pesquisado encontrado!");
		} catch (AssertionError e) {
			System.out.println("ERRO! Nome Meio Hospedagem não encontrado!");

		}
	}

}
