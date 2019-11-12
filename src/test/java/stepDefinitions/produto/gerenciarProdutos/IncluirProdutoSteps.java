package stepDefinitions.produto.gerenciarProdutos;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.menu.MenuPage;
import pageObjects.produto.gerenciarProduto.IncluirProdutoPage;
import pageObjects.produto.gerenciarProduto.ListarProdutoPage;

public class IncluirProdutoSteps extends BasePage {
	
	@After("@IncluirProduto")
	public void tearDown (Scenario scenario) {
		evidencia(scenario);
	}

	MenuPage menu = new MenuPage();
	ListarProdutoPage listarProduto = new ListarProdutoPage();
	IncluirProdutoPage incluirProduto = new IncluirProdutoPage();

	@Dado("^que acesse o modulo de Produto para vizualizar um Produto$")
	public void que_acesse_o_modulo_de_Produto_para_vizualizar_um_Produto() throws Throwable {
		menu.acessarGerenciarProdutos();
	}

	@Dado("^crie um Produto$")
	public void crie_um_Produto() throws Throwable {
		listarProduto.novoProduto();
	}

	@Dado("^preencha o formulario para produto do Tipo VENDA$")
	public void preencha_o_formulario_para_produto_do_Tipo_VENDA(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirProduto.setNome				(data.get(0).get(1));
		incluirProduto.setTipo				(data.get(1).get(1));
		incluirProduto.setDiarias			(data.get(2).get(1));
		incluirProduto.setQtdParcelas		(data.get(3).get(1));
		incluirProduto.setNivel				(data.get(4).get(1));
		incluirProduto.setCategoria			(data.get(5).get(1));
		incluirProduto.setDescricao			(data.get(6).get(1));
		incluirProduto.setSituacao			(data.get(7).get(1));
		incluirProduto.setPeriodo			(data.get(8).get(1));
		incluirProduto.setFeriado			(data.get(9).get(1));
		incluirProduto.setAltaTemporada		(data.get(10).get(1));
		incluirProduto.setDespesasAdicionais(data.get(11).get(1), data.get(12).get(1));
		incluirProduto.setViradaPeriodo		(data.get(13).get(1));
		incluirProduto.setRegraCarencia		(data.get(14).get(1), data.get(15).get(1), data.get(16).get(1));

	}

	@Quando("^salvar os dados do Produto$")
	public void salvar_os_dados_do_Produto() throws Throwable {
		incluirProduto.salvar();
	}

	@Então("^será criado o Produto$")
	public void será_criado_o_Produto() throws Throwable {
		incluirProduto.mensagemSucesso();
	}
}