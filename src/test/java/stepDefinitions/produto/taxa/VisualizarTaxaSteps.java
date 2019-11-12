package stepDefinitions.produto.taxa;

import core.BasePage;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.produto.taxa.ListarTaxaPage;

public class VisualizarTaxaSteps extends BasePage {

	ListarTaxaPage listarTaxa = new ListarTaxaPage();

	@Quando("^visualizar$")
	public void visualizar() throws Throwable {
		listarTaxa.visualizarTaxa();
	}

	@Então("^apresentado os dados da taxa$")
	public void apresentado_os_dados_da_taxa() throws Throwable {
	}

}
