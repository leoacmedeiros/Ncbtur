package stepDefinitions.produto.taxa;

import core.BasePage;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.produto.taxa.ListarTaxaPage;

public class AtivarTaxaSteps extends BasePage {

	ListarTaxaPage listarTaxa = new ListarTaxaPage();

	@Quando("^ativar a Taxa$")
	public void ativar_a_Taxa() throws Throwable {
		listarTaxa.ativarTaxa();
		listarTaxa.confirmarAtivar();
	}

	@Então("^a Taxa será ativada$")
	public void a_Taxa_será_ativada() throws Throwable {
		listarTaxa.mensagemSucessoInativar();
	}
}