package pageObjects.produto.gerenciarProduto;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage;

public class EditarProdutoPage extends BasePage {

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
			clicarCheck(By.xpath("//div[10]//div[1]//label[1]//span[1]"));
		}
	}

	public void setPeriodo(String texto) {
		escrever(By.xpath("(//div//touchspin//div//input)[4]"), texto);
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
		if (isCheckMarcado(By.xpath("//div[@class='portlet-body']//div[2]//div[6]//span"))
				&& despesasAdicionais.trim().equals("Não")) {
			clicarCheck(By.xpath("//div[@class='portlet-body']//div[2]//div[6]//span"));
		} else if (isCheckMarcado(By.xpath("//div[@class='portlet-body']//div[2]//div[6]//span"))
				&& despesasAdicionais.trim().equals("Sim")) {
			selecionarComboPeloXPath("//select[@name='tipoCobranca']", tipoCobranca);
		} else if (!isCheckMarcado(By.xpath("//div[@class='portlet-body']//div[2]//div[6]//span"))
				&& despesasAdicionais.trim().equals("Sim")) {
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
		if (isCheckMarcado(By.xpath("//div[@class='portlet-body']//div[2]//div[9]//span"))
				&& carenciaAdesao.trim().equals("Não")) {
			clicarCheck(By.xpath("//div[@class='portlet-body']//div[2]//div[9]//span"));
		} else {
			escrever(By.xpath("(//div[@class='row']//div[2]//div[1]//div[1]//div//input)[1]"), taxaAdesao);
			escrever(By.xpath("//div[@class='col-md-12']//div[4]//div[1]//div[1]//input"), taxaTransferencia);
		}
	}

	// public void setNome(String texto) {
	// escrever(By.xpath("//input[@name='nome']"), texto);
	// }
	//
	// public void setTipo(String valor) {
	// selecionarComboPeloXPath("//select[@name='tipo']", valor);
	// }
	//
	// public void setQtdParcelas(String texto) {
	// escrever(By.xpath(
	// "/html/body/div[4]/cbtur-root/div[3]/div[2]/div[1]/div[2]/produto/cadastrar-produto/div/div[2]/form/produto-form/div/div[1]/div[3]/div/touchspin/div/div/input"),
	// texto);
	// }
	//
	// public void setNivel(String valor) {
	// selecionarComboPeloXPath("//select[@name='nivelUtilizacao']", valor);
	// }
	//
	// public void setCategoria(String valor) {
	// selecionarComboPeloXPath("//select[@name='categoria']", valor);
	// }
	//
	// public void setDescricao(String texto) {
	// escrever(By.xpath("//textarea[@name='descricao']"), texto);
	// }
	//
	// public void setSituacao() {
	// if (!isCheckMarcado(By.xpath("//input[@name='ativo']"))) {
	// clicarCheck(By.xpath("//input[@name='ativo']"));
	// }
	// }
	//
	// public void setPeriodo(String texto) {
	// escrever(
	// By.xpath(
	// "//touchspin[@name='duracao']//input[@class='form-control ng-untouched
	// ng-pristine ng-valid']"),
	// texto);
	// }
	//
	// public void setFeriado() {
	// clicarCheck(By.xpath("//input[@name='excetoFeriadosProlongados']"));
	// }
	//
	// public void setAltaTemporada() {
	// clicarCheck(By.xpath("//input[@name='excetoAltaTemporada']"));
	// }
	//
	// public void setDespesasAdicionais() {
	// clicarCheck(By.xpath("//input[@name='permiteDespesas']"));
	// }
	//
	// public void setCarencia() {
	// clicarCheck(By.xpath("//input[@name='regrasCarencia']"));
	// }
	//
	public void salvar() {
		clicarBotao(By.xpath("//button[@class='btn btn-primary button-submit']"));
	}

	public void mensagemSucesso() {
		Assert.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
	}
}
