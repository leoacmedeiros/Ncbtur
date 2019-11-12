package pageObjects.meiosHospedagem.proposta;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import core.BasePage;
import core.DriverFactory;

public class EditarPropostaDadosCadastraisPage extends BasePage {

		public void clicarPainelMeioHospedagem() {
		clicarBotao(By.xpath("//a[@href='#/hotel/proposta/complementar/1323/15']"));
	}

	public void clicarDadosCadastrais() {
		clicarBotao(By.xpath("(//div//a[@href='#/hotel/proposta/complementar/1323/15/dados-hotel'])[2]"));
	}
	
	public void mensagemSucessoAlterarDadosMeiosHosp() {
		Assert.assertEquals("Meio de hospedagem salvo com sucesso", obterTexto(By.xpath("//div[@class='toast-message']")));
	}
	

}
