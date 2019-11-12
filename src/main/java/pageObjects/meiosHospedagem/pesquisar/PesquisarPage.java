package pageObjects.meiosHospedagem.pesquisar;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import core.BasePage;
import core.DriverFactory;

public class PesquisarPage extends BasePage {

	public void pesquisarPorCodigo(String idPesquisar) {
		escrever(By.name("id"), idPesquisar );
	}
	
	public void clicarFiltrar() {
		clicarBotao(By.xpath("(//button[@class='btn green'])[1]"));
	}
	
	public void codigoPesquisado() {
		try {
			boolean codigoExibido = DriverFactory.getDriver().getPageSource().contains("1342");
			assertTrue(codigoExibido);
			System.out.println("Meio de hospedagem com o código pesquisado encontrado!");
		}catch(AssertionError e){
			System.out.println("ERRO! Código não encontrado!");
			
		}
	
	}
	
	public void limpar() {
		clicarBotao(By.xpath("(//button[@class='btn dark inverse'])[1]"));
	}
	
	public void nomeMeioHospedagem(String nome) {
		escrever(By.name("nomeFantasia"), nome );
	}
	
	public void nomePesquisado() {
		try {
			boolean nomeExibido = DriverFactory.getDriver().getPageSource().contains("MACHADINHO TERMAS PARK HOTEL");
			assertTrue(nomeExibido);
			System.out.println("Meio de hospedagem com o nome pesquisado encontrado!");
		}catch(AssertionError e){
			System.out.println("ERRO! Nome não encontrado!");
			
		}
	
	}
	
	
	

}
