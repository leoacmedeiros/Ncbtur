package pageObjects.meiosHospedagem.administradoraMeioHospedagem;


import org.junit.Assert;
import org.openqa.selenium.By;
import core.BasePage;


public class IncluirAdministradoraMeioHospedagemPage extends BasePage {

	
	public void clicarBotaoNovaAdministradoraMeioHosp() {
		clicarBotao(By.xpath("//div//a[contains(text(),'Nova Administradora de Meios de Hospedagem')]"));
	}
	
	public void setNome(String nomeFantasia) {
		/*
		WebElement nome = DriverFactory.getDriver().findElement(By.name("nomeFantasia"));
		nome.sendKeys(nomeFantasia);
		*/
		escrever(By.name("nomeFantasia"), nomeFantasia);
	}
	
	public void setCNPJ(String numeroDocumento) {
		escrever(By.name("numeroDocumento"), numeroDocumento);
	}
	
	public void setRazaoSocial(String razaoSocial) {
		escrever(By.name("razaoSocial"), razaoSocial);
	}
	
	public void setCEP(String cep) {
		escrever(By.name("endereco_cep"), cep);
	}
	
	public void setNomeContComercial(String responsavel) {
		escrever(By.name("responsavel"), responsavel);
	}
	
	public void setEmailContComercial(String email) {
		escrever(By.name("email"), email);
	}
	
	public void setTelefoneContComercial(String telefone) {
		escrever(By.name("telefone_comercial"), telefone);
	}
	
	public void clicarSalvarAdministradora() {
		clicarBotao(By.xpath("//div//button[contains(text(),'Salvar Administradora de Meios de Hospedagem')]"));
	}
	
	public void mensagemSucesso() {
		Assert.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
	}
	
	

}
