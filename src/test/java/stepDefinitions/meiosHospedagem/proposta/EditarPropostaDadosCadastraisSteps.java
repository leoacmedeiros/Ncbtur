package stepDefinitions.meiosHospedagem.proposta;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.menu.MenuPage;
import pageObjects.meiosHospedagem.proposta.EditarPropostaDadosCadastraisPage;
import pageObjects.meiosHospedagem.proposta.IncluirPropostaPage;
import pageObjects.meiosHospedagem.proposta.PesquisarPropostaPage;

public class EditarPropostaDadosCadastraisSteps extends BasePage {

	MenuPage menu = new MenuPage();
	EditarPropostaDadosCadastraisPage editarPropostaDadosCadastrais = new EditarPropostaDadosCadastraisPage();
	IncluirPropostaPage incluirProposta = new IncluirPropostaPage();
	PesquisarPropostaPage pesquisarProposta = new PesquisarPropostaPage();

	@Dado("^acesse o menu Novo convênio para realizar uma busca por Nome$")
	public void acesse_o_menu_Novo_convênio_para_realizar_uma_busca_por_Nome() throws Throwable {
		menu.acessarNovoConvenioProposta();
	}

	@Dado("^realize uma busca pelo Nome do Meio de Hospedagem$")
	public void realize_uma_busca_pelo_Nome_do_Meio_de_Hospedagem(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		pesquisarProposta.pesquisarNomeMeioHospedagem(data.get(0).get(1));
		clicarBotaoPorTexto("Filtrar");

	}

	@Dado("^clique em Painel Meio de Hospedagem$")
	public void clique_em_Painel_Meio_de_Hospedagem() throws Throwable {
		clicarBotaoContainsTexto("Contrato Ativo");
		sleep(2);
		editarPropostaDadosCadastrais.clicarPainelMeioHospedagem();
	}

	@Dado("^clique em Dados Cadastrais$")
	public void clique_em_Dados_Cadastrais() throws Throwable {
		menu.acessarMenuPainelMeioHospedagem();
		editarPropostaDadosCadastrais.clicarDadosCadastrais();
		sleep(2);
	}

	@Dado("^edite os dados Cadastrais$")
	public void edite_os_dados_Cadastrais(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirProposta.setNome(data.get(0).get(1));
		incluirProposta.setRazaoSocial(data.get(1).get(1));
		incluirProposta.setEmail(data.get(2).get(1));
		incluirProposta.setSite(data.get(3).get(1));
		incluirProposta.setTelefone(data.get(4).get(1));
		incluirProposta.setInscricaoMunicipal(data.get(5).get(1));
		incluirProposta.setInscricaoEstadual(data.get(6).get(1));
		incluirProposta.setTipoMeioHospedagem(data.get(9).get(1));
		incluirProposta.setTipoAdministracao(data.get(10).get(1));
		incluirProposta.setNomeContComercial(data.get(11).get(1));
		incluirProposta.setEmailContComercial(data.get(12).get(1));
		incluirProposta.setTelefoneContComercial(data.get(13).get(1));
		
	}

	@Quando("^clicar para Salvar os dados editados do Meio de Hospedagem$")
	public void clicar_para_Salvar_os_dados_editados_do_Meio_de_Hospedagem() throws Throwable {
		clicarBotaoContainsTexto("Salvar Meio de Hospedagem");
	}

	@Então("^o sistema irá incluir os dados editados do Meio de Hospedagem$")
	public void o_sistema_irá_incluir_os_dados_editados_do_Meio_de_Hospedagem() throws Throwable {
		editarPropostaDadosCadastrais.mensagemSucessoAlterarDadosMeiosHosp();
	}

}
