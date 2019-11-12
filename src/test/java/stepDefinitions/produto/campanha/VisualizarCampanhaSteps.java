package stepDefinitions.produto.campanha;

import core.BasePage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.menu.MenuPage;
import pageObjects.produto.campanha.EditarCampanhaPage;
import pageObjects.produto.campanha.FiltrarCampanhaPage;
import pageObjects.produto.campanha.ListarCampanhaPage;

public class VisualizarCampanhaSteps extends BasePage {

	MenuPage menu = new MenuPage();
	FiltrarCampanhaPage filtrarCampanha = new FiltrarCampanhaPage();
	ListarCampanhaPage listarCampanha = new ListarCampanhaPage();
	EditarCampanhaPage editarCampanha = new EditarCampanhaPage();

	@Dado("^que acesse o modulo de Produto para visualizar uma Campanha$")
	public void que_acesse_o_modulo_de_Produto_para_visualizar_uma_Campanha() throws Throwable {
		menu.acessarCampanha();
	}

	@Quando("^visualzar o Campanda buscada$")
	public void visualzar_o_Campanda_buscada() throws Throwable {
		listarCampanha.visualizarCampanha();
	}

	@Então("^será apresentado os dados da Campanha$")
	public void será_apresentado_os_dados_da_Campanha() throws Throwable {
	}
}
