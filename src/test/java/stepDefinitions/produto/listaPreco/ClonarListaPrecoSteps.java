package stepDefinitions.produto.listaPreco;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.menu.MenuPage;
import pageObjects.produto.listaPreco.ClonarListaPrecoPage;
import pageObjects.produto.listaPreco.FiltrarListaPrecoPage;
import pageObjects.produto.listaPreco.ListarListaPrecoPage;

public class ClonarListaPrecoSteps extends BasePage {

	MenuPage menu = new MenuPage();
	ListarListaPrecoPage listarListaDePreco = new ListarListaPrecoPage();
	ClonarListaPrecoPage clonarListaDePreco = new ClonarListaPrecoPage();
	FiltrarListaPrecoPage filtrarListaDePreco = new FiltrarListaPrecoPage();

	@Dado("^que acesse o modulo de Produto para clonar uma Lista de Preço$")
	public void que_acesse_o_modulo_de_Produto_para_clonar_uma_Lista_de_Preço() throws Throwable {
		menu.acessarListaDePreco();
	}

	@Quando("^buscar pela Lista de Preço$")
	public void buscar_pela_Lista_de_Preço(DataTable formData) throws Throwable {
		listarListaDePreco.filtrarListaDePreco();
		List<List<String>> data = formData.raw();
		filtrarListaDePreco.setSituacao(data.get(0).get(1));
		filtrarListaDePreco.buscar();
	}

	@Quando("^Clonar a Lista de Preço$")
	public void clonar_a_Lista_de_Preço() throws Throwable {
		listarListaDePreco.clonarListaDePreco();
	}

	@Quando("^definir uma nova data inicial$")
	public void definir_uma_nova_data_inicial(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		clonarListaDePreco.setDataInicio(data.get(0).get(1));
	}

	@Quando("^salvar a Lista de Preço$")
	public void salvar_a_Lista_de_Preço() throws Throwable {
		clonarListaDePreco.salvar();
	}

	@Então("^será criada a Lista de Preço$")
	public void será_criada_a_Lista_de_Preço() throws Throwable {
		clonarListaDePreco.mensagemSucesso();
	}

}