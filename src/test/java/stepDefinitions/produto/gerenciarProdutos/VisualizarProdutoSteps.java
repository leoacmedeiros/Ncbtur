package stepDefinitions.produto.gerenciarProdutos;

import core.BasePage;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.produto.gerenciarProduto.ListarProdutoPage;

public class VisualizarProdutoSteps extends BasePage {

	ListarProdutoPage listarProduto = new ListarProdutoPage();

	@Quando("^visualzar o Produto buscado$")
	public void visualzar_o_Produto_buscado() throws Throwable {
		listarProduto.visualizarProduto();
	}

	@Então("^será apresentado os dados do Produto$")
	public void será_apresentado_os_dados_do_Produto() throws Throwable {
	}
}