package pageObjects.meiosHospedagem.rede;

import org.junit.Assert;
import org.openqa.selenium.By;
import core.BasePage;

public class IncluirRedePage extends BasePage {

	public void clicarNovaRede() {
		clicarBotao(By.xpath("//div//a[contains(text(),'Nova Rede')]"));
	}

	public void setNome(String nomeRede) {
		escrever(By.name("nome"), nomeRede);
	}

	public void clicarRedeAtiva() {
		clicarCheck(By.name("situacao"));
	}

	public void setCEP(String cep) {
		escrever(By.name("endereco_cep"), cep);
	}

	public void setNomeContComerc(String responsavel) {
		escrever(By.name("responsavel"), responsavel);
	}

	public void setEmail(String email) {
		escrever(By.name("email"), email);
	}

	public void setTelefone(String telefone_comercial) {
		escrever(By.name("telefone_comercial"), telefone_comercial);
	}

	public void clicarSalvarRede() {
		clicarBotao(By.xpath("//div//button[contains(text(),'Salvar Rede')]"));

	}
	
	public void mensagemSucesso() {
		Assert.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
	}
}
