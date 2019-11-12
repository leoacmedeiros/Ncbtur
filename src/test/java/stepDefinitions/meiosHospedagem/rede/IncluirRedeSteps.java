package stepDefinitions.meiosHospedagem.rede;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.menu.MenuPage;
import pageObjects.meiosHospedagem.rede.IncluirRedePage;

public class IncluirRedeSteps extends BasePage {

	MenuPage menu = new MenuPage();
	IncluirRedePage incluirRede = new IncluirRedePage();

	@Dado("^que acesse o Menu Meios de Hospedagem$")
	public void que_acesse_o_Menu_Meios_de_Hospedagem() throws Throwable {
		menu.acessarMeiosHospedagemGerenciarCadastro();
	}

	@Dado("^acesse o Menu Rede$")
	public void acesse_o_Menu_Rede() throws Throwable {
		menu.acessarMeiosHospedagemGerenciarCadastroRede();
	}

	@Dado("^clique no botão de Nova Rede$")
	public void clique_no_botão_de_Nova_Rede() throws Throwable {
		incluirRede.clicarNovaRede();
	}

	@Quando("^preencher todos os campos com dados válidos$")
	public void preencher_todos_os_campos_com_dados_válidos(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirRede.setNome(data.get(0).get(1));
		incluirRede.clicarRedeAtiva();
		incluirRede.setCEP(data.get(2).get(1));
		incluirRede.setNomeContComerc(data.get(3).get(1));
		incluirRede.setEmail(data.get(4).get(1));
		incluirRede.setTelefone(data.get(5).get(1));
	}

	@Quando("^clicar no botão Salvar Rede$")
	public void clicar_no_botão_Salvar_Rede() throws Throwable {
		incluirRede.clicarSalvarRede();
	}

	@Então("^o sistema irá incluir uma nova Rede com os dados informados$")
	public void o_sistema_irá_incluir_uma_nova_Rede_com_os_dados_informados() throws Throwable {
		incluirRede.mensagemSucesso();

	}

}
