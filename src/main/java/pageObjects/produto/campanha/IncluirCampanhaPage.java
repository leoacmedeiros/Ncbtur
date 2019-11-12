package pageObjects.produto.campanha;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage;

public class IncluirCampanhaPage extends BasePage {

	public void setCodigoPromocional(String codigoPromocional) {
		escrever(By.xpath("//input[@id='codigoPromocional']"), codigoPromocional);
	}

	public void setNome(String nome) {
		escrever(By.xpath("//input[@name='nome']"), nome);
	}

	public void setTipo(String tipo) {
		selecionarComboPeloXPath("//select[@name='tipo']", tipo);
	}

	public void setDescricao(String descricao) {
		escrever(By.xpath("//textarea[@name='descricao']"), descricao);
	}

	public void setSituacao(String situacao) {
		if (situacao.trim().equals("Ativa"))
			clicarCheck(By.xpath(
					"/html/body/div[5]/cbtur-root/div[3]/div[2]/div[1]/div[2]/produto/campanha/cadastrar-campanha/div/div[2]/form-wizard/div/div[1]/div[2]/div[1]/div/campanha-form/div/div[7]/div/label/span"));
	}

	public void setRestricoes(String restricoes) {
		escrever(By.xpath("//textarea[@name='observacoes']"), restricoes);
	}

	public void clicarProximo() {
		clicarBotao(By.xpath("//button[@class='btn blue button-next']"));
	}

	public void setTipoVigencia(String vigencia) {
		if (vigencia.trim().equals("Período definido")) {
			clicarRadio(By.xpath("//input[@value='periodo']"));
		} else if (vigencia.trim().equals("Meses")) {
			clicarRadio(By.xpath("//input[@value='meses']"));
		}
	}

	public void setVigencia(String tempoIndeterminado, String dataInicio, String dataFim) {
		if (tempoIndeterminado.trim().equals("Sim")) {
			clicarRadio(By.xpath(
					"/html/body/div[5]/cbtur-root/div[3]/div[2]/div[1]/div[2]/produto/campanha/cadastrar-campanha/div/div[2]/form-wizard/div/div[1]/div[2]/div[2]/div/vigencia-campanha-form/div/div[6]/div/label/span"));
			escrever(By.xpath("//input[@name='inicioVigencia']"), dataInicio);
		} else if (tempoIndeterminado.trim().equals("Não")) {
			escrever(By.xpath("//input[@name='inicioVigencia']"), dataInicio);
			escrever(By.xpath("//input[@name='fimVigencia']"), dataFim);
		}
	}

	public void setProduto(String produto) {
		scrollPageUP();
		if (produto.trim().equals("Todos")) {
			clicarCheck(By.xpath("//div[@class='form-group']//div//label[1]"));
		}
	}

	public void setCanaisDeVenda(String canais) {
		scrollPageUP();
		clicarBotao(By.xpath("//button[@class='btn green']"));
		if (canais.trim().equals("Todos")) {
			clicarBotao(By.xpath("//button[contains(text(),'Pesquisar')]"));
			clicarRadio(By.xpath(
					"//table[@class='table table-striped table-bordered table-advance table-hover']//thead//tr//th//span"));
			clicarBotao(By.xpath("//button[contains(text(),'Adicionar Canais')]"));
		} else {
			escrever(By.xpath("//form[@class='row ng-untouched ng-pristine ng-valid']//input[@name='nome']"), canais);
			clicarBotao(By.xpath("//button[contains(text(),'Pesquisar')]"));
			clicarCheck(By.xpath("//tbody//label[@class='mt-checkbox mt-checkbox-outline']//span"));
			clicarBotao(By.xpath("//button[contains(text(),'Adicionar Canais')]"));
		}
	}

	public void setAbrangencia(String abrangencia) {
		if (abrangencia.trim().equals("Todos")) {
			clicarBotao(By.xpath(
					"//body[@class='page-header-fixed page-content-white page-md']/div[@class='page-wrapper']/cbtur-root/div[@class='page-container']/div[@class='page-content-wrapper']/div[@class='page-content']/div[@class='content-outlet-ct']/produto/campanha/cadastrar-campanha/div[@class='portlet light']/div[@class='portlet-body form']/form-wizard[@class='step-width']/div[@class='form-wizard']/div[@class='form-body']/div[@class='tab-content']/div[@class='tab-pane active']/div[@class='tab-5']/canais-venda-form/div[@class='row hide-value-disable ng-untouched ng-pristine ng-valid']/div[@class='col-md-12']/div[@class='form-group mult']/abrangenciaufs/div[@class='col-md-12']/label[1]/span"));
		}
		// clicarCheck(By.xpath("//div[@class='form-group
		// mult']//div[1]//div[1]//label[1]"));(//div[@class='form-group
		// mult']//div[1]//input[@name='selecionarTudo'])[1]
	}

	public void salvar() {
		 clicarBotao(By.xpath("//button[@class='btn green button-submit']"));
	}

	public void mensagemSucesso() {
		Assert.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
	}

}
