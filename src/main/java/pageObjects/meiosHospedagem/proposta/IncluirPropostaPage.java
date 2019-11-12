package pageObjects.meiosHospedagem.proposta;

import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import core.BasePage;
import core.DriverFactory;


public class IncluirPropostaPage extends BasePage {

	public void clicarNovaProposta() {

		JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.getDriver();
		jse.executeScript("scroll(0, -250);");

		clicarBotao(By.xpath("//a[@routerlink='/hotel/proposta/novo'][@ng-reflect-router-link='/hotel/proposta/novo']"));

	}

	public void setCNPJ(String numeroDocumento) {
		escrever(By.name("numeroDocumento"), numeroDocumento);
	}

	public void setNome(String nome) {
		escrever(By.name("nomeFantasia"), nome);
	}

	public void setRazaoSocial(String razaoSocial) {
		escrever(By.name("razaoSocial"), razaoSocial);
	}
	
	public void setEmail(String emailGeradoAuto) {
		escrever(By.name("email"), emailGeradoAuto);

	}
	
	public void setSite(String site) {
		escrever(By.name("site"), site);
	}
	
	public void setTelefone(String telefone) {
		escrever(By.name("telefone"), telefone);
	}
	
	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		escrever(By.name("inscricaoMunicipal"), inscricaoMunicipal);
	}
	
	public void setInscricaoEstadual(String inscricaoEstadual) {
		escrever(By.name("inscricaoEstadual"), inscricaoEstadual);
	}
	
	public void setRede(String rede) {
		escrever(By.xpath("(//div//autocomplete[@formcontrolname='id']//input)[1]"), rede);
	}
	
	public void setTipoMeioHospedagem(String tipoHotel) {
		selecionarComboPeloXPath("//select[@formcontrolname='tipohotel'][@name='tipohotel']", tipoHotel);
	}
	
	public void setTaxaIss(String taxaIss) {
		escrever(By.name("taxaISS"), taxaIss);
	}
	
	public void setTipoAdministracao(String tipoAdmin) {
		selecionarComboPeloXPath("//select[@formcontrolname='tipoAdmin'][@name='tipoAdmin']", tipoAdmin);
	}
	
	public void setNomeContComercial(String nomeResponsavel) {
		escrever(By.name("responsavel"), nomeResponsavel);
	}
	
	public void setEmailContComercial(String emailContComercial) {
		escrever(By.xpath("(//div//input[@name='email'])[2]"), emailContComercial);
	}
	
	public void setTelefoneContComercial(String telefoneComercial) {
		escrever(By.name("telefone_comercial"), telefoneComercial);
	}
	
	public void setCepEndereco(String cepEndereco) {
		escrever(By.xpath("(//input[@formcontrolname='cep'][@name='endereco_cep'])[1]"), cepEndereco);
	}
	
	public void setCepEnderecoCorrespondencia(String cepEnderecoCorrespondencia) {
		escrever(By.xpath("(//input[@formcontrolname='cep'][@name='endereco_cep'])[2]"), cepEnderecoCorrespondencia);
	}
	
	public void clicarSalvarMeioHospedagem() {
		clicarBotao(By.xpath("//button[contains(text(),'Salvar Meio de Hospedagem')]"));
	}
	
	public void mensagemSucesso() {
		Assert.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
	}
	
	

}
