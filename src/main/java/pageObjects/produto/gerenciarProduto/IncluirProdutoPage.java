package pageObjects.produto.gerenciarProduto;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage;

public class IncluirProdutoPage extends BasePage {

	public void setNome(String nome) {
		escrever(By.xpath("//input[@name='nome']"), nome);
	}

	public void setTipo(String tipo) {
		selecionarComboPeloXPath("//select[@name='tipo']", tipo);
	}

	public void setDiarias(String diarias) {
		escrever(By.xpath("//touchspin[@name='diarias']//input"), diarias);
	}

	public void setQtdParcelas(String qtdParcelas) {
		escrever(By.xpath("//touchspin[@name='parcelasTM']//input"), qtdParcelas);
	}

	public void setNivel(String nivel) {
		selecionarComboPeloXPath("//select[@name='nivelUtilizacao']", nivel);
	}

	public void setCategoria(String categoria) {
		selecionarComboPeloXPath("//select[@name='categoria']", categoria);
	}

	public void setDescricao(String descricao) {
		escrever(By.xpath("//textarea[@name='descricao']"), descricao);
	}

	public void setSituacao(String situacao) {
		if (situacao.trim().equals("Inativo")) {
			clicarCheck(By.xpath("//input[@name='ativo']"));
		}
	}

	public void setPeriodo(String texto) {
		escrever(
				By.xpath(
						"//touchspin[@name='duracao']//input[@class='form-control ng-untouched ng-pristine ng-valid']"),
				texto);
	}

	public void setFeriado(String feriado) {
		if (feriado.trim().equals("Sim")) {
			clicarCheck(By.xpath("//div[@class='portlet-body']//div[2]//div[4]//span"));
		}
	}

	public void setAltaTemporada(String temporada) {
		if (temporada.trim().equals("Sim"))
			clicarCheck(By.xpath("//div[@class='portlet-body']//div[2]//div[5]//span"));
	}

	public void setDespesasAdicionais(String despesasAdicionais, String tipoCobranca) {
		if (despesasAdicionais.trim().equals("Sim")) {
			clicarCheck(By.xpath("//div[@class='portlet-body']//div[2]//div[6]//span"));
			selecionarComboPeloXPath("//select[@name='tipoCobranca']", tipoCobranca);
		} else {

		}
	}

	public void setViradaPeriodo(String viradaPediodo) {
		if (viradaPediodo.trim().equals("Sim"))
			clicarCheck(By.xpath("//div[@class='portlet-body']//div[2]//div[8]//span"));
	}

	public void setRegraCarencia(String carenciaAdesao, String taxaAdesao, String taxaTransferencia) {
		if (carenciaAdesao.trim().equals("Sim")) {
			clicarCheck(By.xpath("//div[@class='portlet-body']//div[2]//div[9]//span"));
			escrever(By.xpath("(//div[@class='row']//div[2]//div[1]//div[1]//div//input)[1]"), taxaAdesao);
			escrever(By.xpath("//div[@class='col-md-12']//div[4]//div[1]//div[1]//input"), taxaTransferencia);
		} else {

		}
	}

	public void salvar() {
		clicarBotao(By.xpath("//button[@class='btn btn-primary button-submit']"));
	}

	public void mensagemSucesso() {
		Assert.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
	}
}
