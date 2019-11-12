package pageObjects.menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.BasePage;
import core.DriverFactory;

public class MenuPage extends BasePage {

	public void acessarTaxa() {
		clicarBotao(By.xpath("//span[contains(text(),'Produto')]"));
		clicarBotao(By.xpath("//span[contains(text(),'Taxa')]"));
	}

	public void acessarGerenciarProdutos() {
		clicarBotao(By.xpath("//span[contains(text(),'Produto')]"));
		clicarBotao(By.xpath("//span[contains(text(),'Gerenciar Produtos')]"));
	}

	public void acessarListaDePreco() {
		clicarBotao(By.xpath("//span[contains(text(),'Produto')]"));
		clicarBotao(By.xpath("//span[contains(text(),'Lista de Preço')]"));
	}

	public void acessarCampanha() {
		clicarBotao(By.xpath("//span[contains(text(),'Produto')]"));
		clicarBotao(By.xpath("//span[contains(text(),'Campanha')]"));
	}

	public void acessarCanalVendas() {
		clicarBotao(By.xpath("//span[contains(text(),'Produto')]"));
		clicarBotao(By.xpath("//span[contains(text(),'Canal de Vendas')]"));
		sleep(5);
	}

	public void acessarMeiosHospedagemPesquisar() {
		clicarBotao(By.xpath("(//span[contains(text(),'Meios de Hospedagem')])[1]"));
		clicarBotao(By.xpath("(//span[contains(text(),'Gerenciar')])[3]"));
		clicarBotao(By.xpath("(//span[contains(text(),'Pesquisar')])[2]"));
	}

	public void acessarMeiosHospedagemGerenciarCadastro() {
		clicarBotao(By.xpath("(//span[contains(text(),'Meios de Hospedagem')])[1]"));
		clicarBotao(By.xpath("(//span[contains(text(),'Gerenciar')])[3]"));
		clicarBotao(By.xpath("(//span[contains(text(),'Cadastro')])[2]"));
	}

	public void acessarMeiosHospedagemGerenciarCadastroAdministradoraMeioHospedagem() {
		clicarBotao(By.xpath("(//span[contains(text(),'Administradora de Meio de Hospedagem')])[1]"));

	}

	public void acessarMeiosHospedagemGerenciarCadastroRede() {
		clicarBotao(By.xpath("(//span[contains(text(),'Rede')])[1]"));

	}

	public void acessarMeiosHospedagem() {
		clicarBotao(By.xpath("(//span[contains(text(),'Meios de Hospedagem')])[1]"));
	}

	public void acessarNovoConvenioProposta() {
		clicarBotao(By.xpath("(//span[contains(text(),'Negociação')])[1]"));
		clicarBotao(By.xpath("(//span[contains(text(),'Novo convênio')])[1]"));

	}

	public void acessarMenuPainelMeioHospedagem() {
		clicarBotao(By.xpath("//a[@href='#meiosDeHospedagem']//i"));
	}
}
