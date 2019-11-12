package pageObjects.produto.canalVendas;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage;

public class IncluirCanalVendasPage extends BasePage {

	public void setTipo(String tipo) {
		selecionarComboPeloXPath("//select[@formcontrolname='classificacao']", tipo);
	}

	public void setNome(String nome) {
		escrever(By.xpath("(//input[@name='nome'])[1]"), nome);
	}

	public void setDescricao(String descricao) {
		escrever(By.xpath("//textarea[@name='descricao']"), descricao);
	}

	public void setRazaoSocial(String razaoSocial) {
		escrever(By.xpath("//input[@name='razaoSocial']"), razaoSocial);
	}

	public void setCnpj(String cnpj) {
		escrever(By.xpath("//input[@formcontrolname='cnpj']"), cnpj);
	}

	public void setCaptado(String captado) {
		escrever(By.xpath("//input[@name='input']"), captado);
		clicarBotao(By.xpath("//ul[@class='typeahead']"));
	}

	public void setTelefone(String telefone) {
		clicarBotao(By.xpath("(//a[@class='btn sbold green btn-xs'])[1]"));
		escrever(By.xpath("(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[2]"), telefone);
		clicarBotao(By.xpath("(//button[@class='btn blue btn-xs'])[1]"));
	}

	public void setEmail(String email) {
		clicarBotao(By.xpath("(//a[@class='btn sbold green btn-xs'])[2]"));
		escrever(By.xpath("(//div/input)[10]"), email);
		clicarBotao(By.xpath("(//button[@class='btn blue btn-xs'])[1]"));
	}

	public void setCEP(String cep) {
		escrever(By.xpath("//input[@name='endereco_cep']"), cep);
	}

	public void setTaxaISS(String taxaISS) {
		escrever(By.xpath("//input[@name='taxaISS']"), taxaISS);
	}

	public void setRemuneracao(String remuneracao) {
		clicarCheck(By.xpath("(//div[@class='form-group'])[17]//span"));
	}

	public void setTempoIndeterminado(String tempoIndetermindado) {
		clicarCheck(By.xpath("(//div[@class='form-group'])[19]//span"));
	}

	public void setDataInicio(String dataInicio) {
		escrever(By.xpath("//input[@name='inicioEm']"), dataInicio);
	}

	public void setSituacao(String situacao) {
		clicarCheck(By.xpath("(//div[@class='form-group'])[21]//span"));
	}

	public void avancar() {
		clicarBotao(By.xpath("//button[@class='btn blue button-next']"));
	}

	public void setResponsavel() {
		clicarBotao(By.xpath("(//button[@class='btn sbold green'])[1]"));
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		escrever(By.xpath("(//input[@formcontrolname='nome'])[2]"), nomeResponsavel);
	}

	public void setSexo(String sexo) {
		selecionarComboPeloXPath("(//select[@formcontrolname='sexo'])", sexo);
	}

	public void setCpf(String cpf) {
		escrever(By.xpath("(//input[@formcontrolname='cpf'])"), cpf);
	}

	public void setRg(String rg) {
		escrever(By.xpath("(//input[@formcontrolname='rg'])"), rg);
	}

	public void setOrgaoExpedidor(String orgaoExpedidor) {
		escrever(By.xpath("(//input[@formcontrolname='orgaoExpedidor'])"), orgaoExpedidor);
	}

	public void setProfissao(String profissao) {
		selecionarComboPeloXPath("(//select[@formcontrolname='profissao'])", profissao);
	}

	public void setCargo(String cargo) {
		selecionarComboPeloXPath("//select[@name='nome']", cargo);
	}

	public void setNacionalidade(String nacionalidade) {
		selecionarComboPeloXPath("//select[@name='nacionalidade']", nacionalidade);
	}

	public void setEstadoCivil(String estadoCivil) {
		selecionarComboPeloXPath("(//select[@formcontrolname='estadoCivil'])", estadoCivil);
	}

	public void setDataNascimento(String dataNascimento) {
		escrever(By.xpath("//input[@name='dataNascimento']"), dataNascimento);
	}

	public void setEmailResponsavel(String emailResponsavel) {
		escrever(By.xpath("(//input[@formcontrolname='email'])[1]"), emailResponsavel);
	}

	public void setTelefoneResponsavel(String telefoneResponsavel) {
		clicarBotao(By.xpath("(//a[@class='btn sbold green btn-xs'])[3]"));
		escrever(By.xpath("(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[6]"),
				telefoneResponsavel);
		clicarBotao(By.xpath("(//button[@class='btn blue btn-xs'])[2]"));
	}

	public void setCepResponsavel(String cepResponsavel) {
		escrever(By.xpath("(//input[@name='endereco_cep'])[2]"), cepResponsavel);
	}

	public void adicionarResponsavel() {
		clicarBotao(By.xpath("//button[@class='btn blue btn-success']"));
	}

	public void setVendedor() {
		scrollPageUP();
		clicarBotao(By.xpath("//div[@class='tab-pane active']//div[@class='text-right margin-bottom-15']//button[1]"));
	}

	public void setCpfVendedor(String cpfVendedor) {
		escrever(By.xpath("//input[@name='cpf']"), cpfVendedor);
	}

	public void setPromotorVendas(String promotorVendas) {
		if (promotorVendas.trim().equals("Sim")) {
			clicarCheck(By.xpath("//div[@class='padding-top-30']//span"));
		}
	}

	public void adicionarVendedor() {
		clicarBotao(By.xpath("//button[@class='btn blue btn-success']"));
	}

}
