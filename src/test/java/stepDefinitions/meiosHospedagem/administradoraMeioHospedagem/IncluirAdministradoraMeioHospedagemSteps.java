package stepDefinitions.meiosHospedagem.administradoraMeioHospedagem;

import java.util.List;


import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.menu.MenuPage;
import pageObjects.meiosHospedagem.administradoraMeioHospedagem.IncluirAdministradoraMeioHospedagemPage;
import pageObjects.meiosHospedagem.pesquisar.PesquisarPage;


public class IncluirAdministradoraMeioHospedagemSteps extends BasePage {

	MenuPage menu = new MenuPage();
	IncluirAdministradoraMeioHospedagemPage incluirAdmMeioHosp = new IncluirAdministradoraMeioHospedagemPage();
	
	/*
	@Dado("^que acesse o Menu Meios de Hospedagem$")
	public void que_acesse_o_Menu_Meios_de_Hospedagem() throws Throwable {
	  menu.acessarMeiosHospedagemGerenciarCadastro();
	}
	*/

	@Dado("^acesse o Menu Administradora de Meio de Hospedagem$")
	public void acesse_o_Menu_Administradora_de_Meio_de_Hospedagem() throws Throwable {
		menu.acessarMeiosHospedagemGerenciarCadastro();
	    menu.acessarMeiosHospedagemGerenciarCadastroAdministradoraMeioHospedagem();
	}

	@Dado("^clique no botao de Nova Administradora de Meios de Hospedagem$")
	public void clique_no_botao_de_Nova_Administradora_de_Meios_de_Hospedagem() throws Throwable {
		incluirAdmMeioHosp.clicarBotaoNovaAdministradoraMeioHosp();
				
	}

	@Quando("^preencher todos os campos com dados validos$")
	public void preencher_todos_os_campos_com_dados_validos(DataTable formData) throws Throwable {
			List<List<String>> data = formData.raw();
			incluirAdmMeioHosp.setNome(data.get(0).get(1));
			incluirAdmMeioHosp.setCNPJ(data.get(1).get(1));
			incluirAdmMeioHosp.setRazaoSocial(data.get(2).get(1));
			incluirAdmMeioHosp.setCEP(data.get(3).get(1));
			incluirAdmMeioHosp.setNomeContComercial(data.get(4).get(1));
			incluirAdmMeioHosp.setEmailContComercial(data.get(5).get(1));
			incluirAdmMeioHosp.setTelefoneContComercial(data.get(6).get(1));
	}

	@Quando("^clicar no botao Salvar Administradora de Meios de Hospedagem$")
	public void clicar_no_botao_Salvar_Administradora_de_Meios_de_Hospedagem() throws Throwable {
	    	incluirAdmMeioHosp.clicarSalvarAdministradora();
	}

	@Então("^o sistema ira incluir uma nova Administradora de Meios de Hospedagem com os dados inseridos$")
	public void o_sistema_ira_incluir_uma_nova_Administradora_de_Meios_de_Hospedagem_com_os_dados_inseridos() throws Throwable {
	    	incluirAdmMeioHosp.mensagemSucesso();
	}
	
	
	
	


}
