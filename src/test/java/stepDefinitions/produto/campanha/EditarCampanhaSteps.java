package stepDefinitions.produto.campanha;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.menu.MenuPage;
import pageObjects.produto.campanha.EditarCampanhaPage;
import pageObjects.produto.campanha.FiltrarCampanhaPage;
import pageObjects.produto.campanha.ListarCampanhaPage;

public class EditarCampanhaSteps extends BasePage {

	MenuPage menu = new MenuPage();
	FiltrarCampanhaPage filtrarCampanha = new FiltrarCampanhaPage();
	ListarCampanhaPage listarCampanha = new ListarCampanhaPage();
	EditarCampanhaPage editarCampanha = new EditarCampanhaPage();

	@Dado("^que acesse o modulo de Produto para editar uma Campanha$")
	public void que_acesse_o_modulo_de_Produto_para_editar_uma_Campanha() throws Throwable {
		menu.acessarCampanha();
	}

	@Quando("^buscar pela Campanha$")
	public void buscar_pela_Campanha(DataTable formData) throws Throwable {
		listarCampanha.filtraCampanha();
		List<List<String>> data = formData.raw();
		filtrarCampanha.setNome(data.get(0).get(1));
		filtrarCampanha.buscar();
	}

	@Quando("^editar os dados da CAMPANHA Dados básicos$")
	public void editar_os_dados_da_CAMPANHA_Dados_básicos(DataTable formData) throws Throwable {
		listarCampanha.editarCampanha();
		List<List<String>> data = formData.raw();
		editarCampanha.setCodigoPromocional	(data.get(0).get(1));
		editarCampanha.setNome				(data.get(1).get(1));
		editarCampanha.setTipo				(data.get(2).get(1));
		editarCampanha.setDescricao			(data.get(3).get(1));
		editarCampanha.setSituacao			(data.get(4).get(1));
		editarCampanha.setRestricoes		(data.get(5).get(1));
	}

	@Quando("^editar os dados da VIGÊNCIA Duração$")
	public void editar_os_dados_da_VIGÊNCIA_Duração(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		editarCampanha.setTipoVigencia	(data.get(0).get(1));
		editarCampanha.setVigencia		(data.get(1).get(1), data.get(2).get(1), data.get(3).get(1));
	}

	@Quando("^editar os dados dos PRODUTOS Itens vinculados$")
	public void editar_os_dados_dos_PRODUTOS_Itens_vinculados(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		editarCampanha.setProduto	(data.get(0).get(1));
	}

	@Quando("^editar os dados das TAXAS e descontos$")
	public void editar_os_dados_das_TAXAS_e_descontos(DataTable formData) throws Throwable {
	}

	@Quando("^editar os dados dos CANAIS DE VENDA e abrangência$")
	public void editar_os_dados_dos_CANAIS_DE_VENDA_e_abrangência(DataTable formData) throws Throwable {
		 List<List<String>> data = formData.raw();
		 editarCampanha.setCanaisDeVenda	(data.get(0).get(1));
		 editarCampanha.setAbrangencia		(data.get(1).get(1));
	}

	@Quando("^salvar os dados editados da Campanha$")
	public void salvar_os_dados_editados_da_Campanha() throws Throwable {
//		editarCampanha.salvar();
	}

	@Então("^será editada a Campanha$")
	public void será_editada_a_Campanha() throws Throwable {
//		editarCampanha.mensagemSucesso();
	}
}
