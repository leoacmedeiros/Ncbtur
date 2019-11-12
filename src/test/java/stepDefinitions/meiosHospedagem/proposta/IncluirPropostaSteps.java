package stepDefinitions.meiosHospedagem.proposta;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.menu.MenuPage;
import utils.GeraCpfCnpj;
import pageObjects.meiosHospedagem.proposta.IncluirPropostaPage;

public class IncluirPropostaSteps extends BasePage {

	MenuPage menu = new MenuPage();
	IncluirPropostaPage incluirProposta = new IncluirPropostaPage();
	GeraCpfCnpj gerador = new GeraCpfCnpj();	
	
	@Dado("^que acesse o módulo de Meios de Hospedagem$")
	public void que_acesse_o_módulo_de_Meios_de_Hospedagem() throws Throwable {
	    menu.acessarMeiosHospedagem();
	}

	@Dado("^acesse o menu Novo convênio$")
	public void acesse_o_menu_Novo_convênio() throws Throwable {
	    menu.acessarNovoConvenioProposta();
	}

	@Dado("^clique no botão Nova Proposta$")
	public void clique_no_botão_Nova_Proposta() throws Throwable {
		incluirProposta.clicarNovaProposta();
		
	}

	@Dado("^preencha todos os campos$")
	public void preencha_todos_os_campos(DataTable formData) throws Throwable {
		
		String cnpj = gerador.cnpj(false);		
		incluirProposta.setCNPJ(cnpj);
		
		List<List<String>> data = formData.raw();		
		incluirProposta.setNome(data.get(1).get(1));
		incluirProposta.setRazaoSocial(data.get(2).get(1));
		incluirProposta.setEmail(geraEmailAuto());
		incluirProposta.setSite(data.get(4).get(1));
		incluirProposta.setTelefone(data.get(5).get(1));
		incluirProposta.setInscricaoMunicipal(data.get(6).get(1));
		incluirProposta.setInscricaoEstadual(data.get(7).get(1));
		incluirProposta.setRede(data.get(8).get(1));
		incluirProposta.setTipoMeioHospedagem(data.get(10).get(1));
		incluirProposta.setTipoAdministracao(data.get(11).get(1));
		incluirProposta.setNomeContComercial(data.get(12).get(1));
	    incluirProposta.setEmailContComercial(geraEmailAuto());
	    incluirProposta.setTelefoneContComercial(data.get(14).get(1));
	    incluirProposta.setCepEndereco(data.get(15).get(1));
	    incluirProposta.setCepEnderecoCorrespondencia(data.get(16).get(1));
	    incluirProposta.setTaxaIss(data.get(9).get(1));
	}

	@Quando("^clicar no botão de Salvar Meio de Hospedagem$")
	public void clicar_no_botão_de_Salvar_Meio_de_Hospedagem() throws Throwable {
		incluirProposta.clicarSalvarMeioHospedagem();
	}

	@Então("^o sistema irá incluir os dados informados$")
	public void o_sistema_irá_incluir_os_dados_informados() throws Throwable {
	    incluirProposta.mensagemSucesso();
	}
	
	


}
