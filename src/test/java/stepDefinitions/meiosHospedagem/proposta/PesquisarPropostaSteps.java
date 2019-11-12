package stepDefinitions.meiosHospedagem.proposta;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.menu.MenuPage;
import pageObjects.meiosHospedagem.proposta.PesquisarPropostaPage;

public class PesquisarPropostaSteps extends BasePage {

	MenuPage menu = new MenuPage();
	PesquisarPropostaPage pesquisarProposta = new PesquisarPropostaPage();
		
	@Dado("^que acesse o menu Novo Convênio Proposta$")
	public void que_acesse_o_menu_Novo_Convênio_Proposta() throws Throwable {
	    menu.acessarMeiosHospedagem();
	    menu.acessarNovoConvenioProposta();
	}

	@Quando("^buscar pelo Código da Proposta$")
	public void buscar_pelo_Código_da_Proposta(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		pesquisarProposta.pesquisarCodProposta(data.get(0).get(1));
		pesquisarProposta.clicarBotaoFiltrar();
		sleep(2);
	}

	@Então("^deverá exibir o Código da Proposta pesquisado$")
	public void deverá_exibir_o_Código_da_Proposta_pesquisado() throws Throwable {
		pesquisarProposta.achouCodigoPropostaPesquisado();
		pesquisarProposta.clicarBotaoLimpar();
	    
	}
	
	@Quando("^buscar pelo Código do Meio de Hospedagem$")
	public void buscar_pelo_Código_do_Meio_de_Hospedagem(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		pesquisarProposta.pesquisarCodMeioHospedagem(data.get(0).get(1));
	    pesquisarProposta.clicarBotaoFiltrar();
	    sleep(2);
	}

	@Então("^deverá exibir o Código do Meio de Hospedagem pesquisado$")
	public void deverá_exibir_o_Código_do_Meio_de_Hospedagem_pesquisado() throws Throwable {
		pesquisarProposta.achouCodigoMeioHospPesquisado();
		pesquisarProposta.clicarBotaoLimpar();
	    
	}
	
	@Quando("^a busca for realizada pelo Nome do Meio de Hospedagem$")
	public void a_busca_for_realizada_pelo_Nome_do_Meio_de_Hospedagem(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		pesquisarProposta.pesquisarNomeMeioHospedagem(data.get(0).get(1));
		pesquisarProposta.clicarBotaoFiltrar();
	    sleep(2);
	}
	
	@Então("^deverá exibir o Nome$")
	public void deverá_exibir_o_Nome() throws Throwable {
		pesquisarProposta.achouNomeMeioHospPesquisado();
	    
	}


}
