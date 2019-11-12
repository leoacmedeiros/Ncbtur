package stepDefinitions.produto.campanha;

import core.BasePage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.menu.MenuPage;
import pageObjects.produto.campanha.InativarCampanhaPage;
import pageObjects.produto.campanha.ListarCampanhaPage;

public class InativarCampanhaSteps extends BasePage {

	MenuPage menu = new MenuPage();
	ListarCampanhaPage listarCampanha = new ListarCampanhaPage();
	InativarCampanhaPage inativarCampanha = new InativarCampanhaPage();

	@Dado("^que acesse o modulo de Produto para inativar uma Campanha$")
	public void que_acesse_o_modulo_de_Produto_para_inativar_uma_Campanha() throws Throwable {
		menu.acessarCampanha();
	}

	@Quando("^inativar a Campanha buscada$")
	public void inativar_a_Campanha_buscada() throws Throwable {
		listarCampanha.inativarCampanha();
		inativarCampanha.confirmarMensagem();
	}

	@Então("^a Campanha será inativada$")
	public void a_Campanha_será_inativada() throws Throwable {
	}
}
