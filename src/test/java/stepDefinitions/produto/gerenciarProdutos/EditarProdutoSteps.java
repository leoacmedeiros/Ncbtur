package stepDefinitions.produto.gerenciarProdutos;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.produto.gerenciarProduto.EditarProdutoPage;
import pageObjects.produto.gerenciarProduto.FiltrarProdutoPage;
import pageObjects.produto.gerenciarProduto.ListarProdutoPage;

public class EditarProdutoSteps extends BasePage {
	
	ListarProdutoPage listarProduto = new ListarProdutoPage();
	FiltrarProdutoPage filtrarProduto = new FiltrarProdutoPage();
	EditarProdutoPage editarProduto = new EditarProdutoPage();
	
	@Quando("^buscar pelo Produto$")
	public void buscar_pelo_Produto(DataTable formData) throws Throwable {
		listarProduto.filtrarProduto();
		List<List<String>> data = formData.raw();
		filtrarProduto.setNome(data.get(0).get(1));
		filtrarProduto.buscar();
	}

	@Quando("^editar o produto$")
	public void editar_o_produto(DataTable formData) throws Throwable {
		listarProduto.editarProduto();
		List<List<String>> data = formData.raw();
		editarProduto.setNome				(data.get(0).get(1));
		editarProduto.setTipo				(data.get(1).get(1));
		editarProduto.setDiarias			(data.get(2).get(1));
		editarProduto.setQtdParcelas		(data.get(3).get(1));
		editarProduto.setNivel				(data.get(4).get(1));
		editarProduto.setCategoria			(data.get(5).get(1));
		editarProduto.setDescricao			(data.get(6).get(1));
		editarProduto.setSituacao			(data.get(7).get(1));
		editarProduto.setPeriodo			(data.get(8).get(1));
		editarProduto.setFeriado			(data.get(9).get(1));
		editarProduto.setAltaTemporada		(data.get(10).get(1));
		editarProduto.setDespesasAdicionais	(data.get(11).get(1), data.get(12).get(1));
		editarProduto.setViradaPeriodo		(data.get(13).get(1));
		editarProduto.setRegraCarencia		(data.get(14).get(1), data.get(15).get(1), data.get(16).get(1));
	}

	@Então("^o Produto será editado$")
	public void o_Produto_será_editado() throws Throwable {
	}

}
