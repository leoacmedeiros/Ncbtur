package stepDefinitions.produto.gerenciarProdutos;

import core.BasePage;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.produto.gerenciarProduto.AtivarProdutoPage;
import pageObjects.produto.gerenciarProduto.ListarProdutoPage;

public class AtivarProdutoSteps extends BasePage {

	ListarProdutoPage listarProduto = new ListarProdutoPage();
	AtivarProdutoPage ativarProduto = new AtivarProdutoPage();

	@Quando("^ativar o Produto buscado$")
	public void inativar_o_Produto_buscado() throws Throwable {
		listarProduto.inativarProduto();
		ativarProduto.confirmarMensagem();
	}

	@Então("^o produto será ativado$")
	public void o_produto_será_inativado() throws Throwable {
		ativarProduto.confirmarMensagem();
	}
}