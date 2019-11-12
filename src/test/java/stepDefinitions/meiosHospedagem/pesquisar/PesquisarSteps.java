package stepDefinitions.meiosHospedagem.pesquisar;

import java.util.List;


import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.meiosHospedagem.pesquisar.PesquisarPage;
import pageObjects.menu.MenuPage;

public class PesquisarSteps extends BasePage {

	MenuPage menu = new MenuPage();
	PesquisarPage pesquisa = new PesquisarPage();
		
	
	@Dado("^que acesse o modulo de Meios de Hospedagem$")
	public void que_acesse_o_modulo_de_Meios_de_Hospedagem() throws Throwable {
		menu.acessarMeiosHospedagemPesquisar();
	    
	}

	@Quando("^buscar pelo codigo$")
	public void buscar_pelo_Codigo(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		pesquisa.pesquisarPorCodigo(data.get(0).get(1));
		pesquisa.clicarFiltrar();
		 
	}
	
	@Então("^deverá exibir o código pesquisado$")
	public void deverá_exibir_o_código_pesquisado() throws Throwable {
	   	pesquisa.limpar();
		pesquisa.codigoPesquisado();
	}
	
	
	@Quando("^buscar pelo Nome do Meio de Hospedagem$")
	public void buscar_pelo_Nome_do_Meio_de_Hospedagem(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		pesquisa.nomeMeioHospedagem(data.get(0).get(1));
		pesquisa.clicarFiltrar();
		
	}
		

	@Então("^deverá exibir o Nome do Meio de Hospedagem pesquisado$")
	public void deverá_exibir_o_Nome_do_Meio_de_Hospedagem_pesquisado() throws Throwable {
	    pesquisa.nomePesquisado();
	   
	}
	
	
	


}
