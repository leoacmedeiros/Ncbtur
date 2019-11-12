package stepDefinitions.produto.canalVendas;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.menu.MenuPage;
import pageObjects.produto.canalVendas.IncluirCanalVendasPage;
import pageObjects.produto.canalVendas.ListarCanalVendasPage;

public class IncluirCanalVendasSteps extends BasePage {

	MenuPage menu = new MenuPage();
	ListarCanalVendasPage visualizarCanal = new ListarCanalVendasPage();
	IncluirCanalVendasPage incluirCanal = new IncluirCanalVendasPage();

	@Dado("^que acesse o modulo de Produto para visualizar Canal de Vendas$")
	public void que_acesse_o_modulo_de_Produto_para_visualizar_Canal_de_Vendas() throws Throwable {
		menu.acessarCanalVendas();
	}

	@Dado("^crie o Canal de Venda do Tipo Cooperado$")
	public void crie_o_Canal_de_Venda_do_Tipo_Cooperado() throws Throwable {
		visualizarCanal.novoCanalVenda();
	}

	@Quando("^preencher o formulário CANAL Dados Vendas para o tipo Cooperado$")
	public void preencher_o_formulário_CANAL_Dados_Vendas_para_o_tipo_Cooperado(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirCanal.setTipo				(data.get(0).get(1));
		incluirCanal.setNome				(data.get(1).get(1));
		incluirCanal.setDescricao			(data.get(2).get(1));
		incluirCanal.setRazaoSocial			(data.get(3).get(1));
		incluirCanal.setCnpj				(data.get(4).get(1));
		incluirCanal.setCaptado				(data.get(5).get(1));
		incluirCanal.setTelefone			(data.get(6).get(1));
		incluirCanal.setEmail				(data.get(7).get(1));
		incluirCanal.setCEP					(data.get(8).get(1));
		incluirCanal.setTaxaISS				(data.get(9).get(1));
		incluirCanal.setRemuneracao			(data.get(10).get(1));
		incluirCanal.setTempoIndeterminado	(data.get(11).get(1));
		incluirCanal.setDataInicio			(data.get(12).get(1));
		incluirCanal.setSituacao			(data.get(13).get(1));
	}
	
	@Quando("^preencher o formulário RESPONSÁVEL para o tipo Cooperado$")
	public void preencher_o_formulário_RESPONSÁVEL_para_o_tipo_Cooperado(DataTable formData) throws Throwable {
		incluirCanal.setResponsavel();
		List<List<String>> data = formData.raw();
		incluirCanal.setNomeResponsavel		(data.get(0).get(1));
		incluirCanal.setSexo				(data.get(1).get(1));
		incluirCanal.setCpf					(data.get(2).get(1));
		incluirCanal.setRg					(data.get(3).get(1));
		incluirCanal.setOrgaoExpedidor		(data.get(4).get(1));
		incluirCanal.setProfissao			(data.get(5).get(1));
		incluirCanal.setCargo				(data.get(6).get(1));
		incluirCanal.setNacionalidade		(data.get(7).get(1));
		incluirCanal.setEstadoCivil			(data.get(8).get(1));
		incluirCanal.setDataNascimento		(data.get(9).get(1));
		incluirCanal.setEmailResponsavel	(data.get(10).get(1));
		incluirCanal.setTelefoneResponsavel	(data.get(11).get(1));
		incluirCanal.setCepResponsavel		(data.get(12).get(1));
		incluirCanal.adicionarResponsavel();
	}
	
	@Quando("^preencher o formulário VENDEDOR\\(A\\) para o tipo Cooperado$")
	public void preencher_o_formulário_VENDEDOR_A_para_o_tipo_Cooperado(DataTable formData) throws Throwable {
		incluirCanal.setVendedor();
		List<List<String>> data = formData.raw();
		incluirCanal.setCpfVendedor		(data.get(0).get(1));
		incluirCanal.setPromotorVendas	(data.get(1).get(1));
		incluirCanal.adicionarVendedor();
	}

	@Quando("^anexar DOCUMENTAÇÃO para o tipo Cooperado$")
	public void anexar_DOCUMENTAÇÃO_para_o_tipo_Cooperado(DataTable formData) throws Throwable {
		
	}

	@Quando("^preencher o formulário BANCÁRIO par ao tipo Cooperado$")
	public void preencher_o_formulário_BANCÁRIO_par_ao_tipo_Cooperado(DataTable formData) throws Throwable {
	}
}
