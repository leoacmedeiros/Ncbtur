package stepDefinitions.produto.gerenciarProdutos;

import core.BasePage;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.menu.MenuPage;
import pageObjects.produto.gerenciarProduto.InativarProdutoPage;
import pageObjects.produto.gerenciarProduto.ListarProdutoPage;

public class InativarProdutoSteps extends BasePage {

	ListarProdutoPage listarProduto = new ListarProdutoPage();
	InativarProdutoPage inativarProduto = new InativarProdutoPage();

	@Quando("^inativar o Produto buscado$")
	public void inativar_o_Produto_buscado() throws Throwable {
		listarProduto.inativarProduto();
		inativarProduto.confirmarMensagem();
	}

	@Então("^o produto será inativado$")
	public void o_produto_será_inativado() throws Throwable {
		inativarProduto.confirmarMensagem();
	}
}