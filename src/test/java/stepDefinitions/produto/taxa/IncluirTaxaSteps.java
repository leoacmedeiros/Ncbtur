package stepDefinitions.produto.taxa;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.menu.MenuPage;
import pageObjects.produto.taxa.IncluirTaxaPage;
import pageObjects.produto.taxa.ListarTaxaPage;

public class IncluirTaxaSteps extends BasePage {

	MenuPage menu = new MenuPage();
	ListarTaxaPage listarTaxa = new ListarTaxaPage();
	IncluirTaxaPage incluirTaxa = new IncluirTaxaPage();
	
	

	@Dado("^que acesse o modulo de Produto para visualizar Taxas$")
	public void que_acesse_o_modulo_de_Produto_para_vizualizar_Taxas() throws Throwable {
		menu.acessarTaxa();
	}
	
	@Dado("^crie a Taxa$")
	public void crie_a_Taxa() throws Throwable {
		listarTaxa.novaTaxa();
	}

	@Quando("^preencher o formulário$")
	public void preencher_o_formulário(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirTaxa.setTipo(data.get(0).get(1));
		incluirTaxa.setNome(data.get(1).get(1));
		incluirTaxa.setPermiteComissao(data.get(2).get(1), data.get(0).get(1));
		incluirTaxa.setDescCampanha(data.get(3).get(1), data.get(0).get(1));
		incluirTaxa.setDescConvenio(data.get(4).get(1), data.get(0).get(1));
		incluirTaxa.setDescricao(data.get(5).get(1));
		incluirTaxa.setSituacao(data.get(6).get(1));
	}

	// @Quando("^salvar os dados do formulario$")
	// public void salvar_os_dados_do_formulario() throws Throwable {
	// incluirTaxa.salvar();
	// }
	//
	// @Então("^será criada a Taxa$")
	// public void será_criada_a_Taxa() throws Throwable {
	// incluirTaxa.mensagemSucesso();
	// }

}