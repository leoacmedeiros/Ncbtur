package stepDefinitions.produto.campanha;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.menu.MenuPage;
import pageObjects.produto.campanha.IncluirCampanhaPage;
import pageObjects.produto.campanha.ListarCampanhaPage;

public class IncluirCampanhaSteps extends BasePage {

	MenuPage menu = new MenuPage();
	ListarCampanhaPage listarCampanha = new ListarCampanhaPage();
	IncluirCampanhaPage incluirCampanha = new IncluirCampanhaPage();

	@Dado("^que acesse o modulo de Produto para criar uma nova Campanha$")
	public void que_acesse_o_modulo_de_Produto_para_criar_uma_nova_Campanha() throws Throwable {
		menu.acessarCampanha();
	}

	@Dado("^crie a Campanha$")
	public void crie_a_Campanha() throws Throwable {
		listarCampanha.novaCampanha();
	}

	@Quando("^preencher o formulário CAMPANHA Dados básicos$")
	public void preencher_o_formulário_CAMPANHA_Dados_básicos(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirCampanha.setCodigoPromocional	(data.get(0).get(1));
		incluirCampanha.setNome					(data.get(1).get(1));
		incluirCampanha.setTipo					(data.get(2).get(1));
		incluirCampanha.setDescricao			(data.get(3).get(1));
		incluirCampanha.setSituacao				(data.get(4).get(1));
		incluirCampanha.setRestricoes			(data.get(5).get(1));
	}

	@Então("^avançar$")
	public void avançar() throws Throwable {
		incluirCampanha.clicarProximo();
	}

	@Quando("^preencher o formulário VIGÊNCIA Duração$")
	public void preencher_o_formulário_VIGÊNCIA_Duração(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirCampanha.setTipoVigencia	(data.get(0).get(1));
		incluirCampanha.setVigencia		(data.get(1).get(1), data.get(2).get(1), data.get(3).get(1));
	}

	@Quando("^preencher o formulário PRODUTOS Itens vinculados$")
	public void preencher_o_formulário_PRODUTOS_Itens_vinculados(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirCampanha.setProduto	(data.get(0).get(1));
	}

	 @Quando("^preencher o formulário TAXAS e descontos$")
	 public void preencher_o_formulário_TAXAS_e_descontos(DataTable formData) throws Throwable {
	 }
	
	 @Quando("^preencher o formulário CANAIS DE VENDA e abrangência$")
	 public void preencher_o_formulário_CANAIS_DE_VENDA_e_abrangência(DataTable formData) throws Throwable {
	 List<List<String>> data = formData.raw();
	 incluirCampanha.setCanaisDeVenda	(data.get(0).get(1));
	 incluirCampanha.setAbrangencia		(data.get(1).get(1));
	 }
	
//	 @Quando("^salvar os dados da Campanha$")
//	 public void salvar_da_Campanha() throws Throwable {
//		 incluirCampanha.salvar();
//	 }
//	 
//	 @Então("^será criada a Campanha$")
//	 public void será_criada_a_Campanha() throws Throwable {
//		 incluirCampanha.mensagemSucesso();
//	 }

}
