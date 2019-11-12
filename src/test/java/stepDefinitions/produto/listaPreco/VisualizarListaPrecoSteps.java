package stepDefinitions.produto.listaPreco;

import core.BasePage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.menu.MenuPage;
import pageObjects.produto.listaPreco.ClonarListaPrecoPage;
import pageObjects.produto.listaPreco.FiltrarListaPrecoPage;
import pageObjects.produto.listaPreco.ListarListaPrecoPage;

public class VisualizarListaPrecoSteps extends BasePage {

	MenuPage menu = new MenuPage();
	ListarListaPrecoPage listarListaDePreco = new ListarListaPrecoPage();
	ClonarListaPrecoPage clonarListaDePreco = new ClonarListaPrecoPage();
	FiltrarListaPrecoPage filtrarListaDePreco = new FiltrarListaPrecoPage();

	@Dado("^que acesse o modulo de Produto para visualizar uma Lista de Preço$")
	public void que_acesse_o_modulo_de_Produto_para_visualizar_uma_Lista_de_Preço() throws Throwable {
		menu.acessarListaDePreco();
	}

	@Quando("^Visualizar a Lista de Preço$")
	public void visualizar_a_Lista_de_Preço() throws Throwable {
		listarListaDePreco.visualizarListaDePreco();
	}

	@Então("^será apresentado a Lista de Preço$")
	public void será_apresentado_a_Lista_de_Preço() throws Throwable {
	}

}