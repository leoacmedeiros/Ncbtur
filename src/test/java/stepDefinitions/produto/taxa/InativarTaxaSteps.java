package stepDefinitions.produto.taxa;

import core.BasePage;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.produto.taxa.IncluirTaxaPage;
import pageObjects.produto.taxa.ListarTaxaPage;

public class InativarTaxaSteps extends BasePage {

	ListarTaxaPage listarTaxa = new ListarTaxaPage();
	IncluirTaxaPage incluirTaxa = new IncluirTaxaPage();

	@Quando("^inativar a Taxa$")
	public void inativar_a_Taxa() throws Throwable {
		listarTaxa.inativarTaxa();
		listarTaxa.confirmarInativar();
	}

	@Então("^a Taxa será inativada$")
	public void a_Taxa_será_inativada() throws Throwable {
		listarTaxa.mensagemSucessoInativar();
	}
}