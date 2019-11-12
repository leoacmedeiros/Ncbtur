package pageObjects.produto.taxa;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage;

public class EditarTaxaPage extends BasePage {

	public static final String COMBO_TIPO_TAXA = "//select[@formcontrolname='tipo']";
	public static final String CAMPO_NOME = "//input[@name='nome']";
	public static final String PERMITE_COMISSAO = "(//div[@class='row']//div//div[1]//label//span)[3]";
	public static final String DESCONTO_CAMPANHA = "(//div[@class='row']//div//div[1]//label//span)[4]";
	public static final String DESCONTO_CONVENIO = "(//div[@class='row']//div//div[1]//label//span)[5]";
	public static final String CAMPO_DESCRICAO = "//textarea[@formcontrolname='descricao']";
	public static final String CHECKBOX_SITUACAO = "//div[@class='form-group']//div[@class='col-md-8']//label[1]";
	public static final String SALVAR_TAXA = "//button[@class='btn btn-primary button-submit']";
	public static final String SUCESSO = "//div[@class='toast-message']";

	public void setTipo(String tipo) {
		selecionarComboPeloXPath(COMBO_TIPO_TAXA, tipo);
	}

	public void setNome(String nome) {
		escrever(By.xpath(CAMPO_NOME), nome);
	}

	public void setPermiteComissao(String permiteComissao) {
		if (permiteComissao.trim().equals("Sim")) {
			clicarCheck(By.xpath(PERMITE_COMISSAO));
		}
	}

	public void setDescCampanha(String descCampanha) {
		if (descCampanha.trim().equals("Sim")) {
			clicarCheck(By.xpath(DESCONTO_CAMPANHA));
		}
	}

	public void setDescConvenio(String desConvenio) {
		if (desConvenio.trim().equals("Sim")) {
			clicarCheck(By.xpath(DESCONTO_CONVENIO));
		}
	}

	public void setDescricao(String descricao) {
		escrever(By.xpath(CAMPO_DESCRICAO), descricao);
	}

	public void setSituacao(String situacao) {
		if (situacao.trim().equals("Inativo")) {
			clicarCheck(By.xpath(CHECKBOX_SITUACAO));
		}
	}

	public void salvar() {
		clicarBotao(By.xpath(SALVAR_TAXA));
	}

	public void mensagemSucesso() {
		Assert.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath(SUCESSO)));
	}

}