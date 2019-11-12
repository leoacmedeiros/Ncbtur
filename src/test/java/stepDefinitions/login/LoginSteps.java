package stepDefinitions.login;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import pageObjects.login.LoginPage;

public class LoginSteps {

	private static LoginPage page = new LoginPage();

	@Dado("^que eu acesse o sistema CBTUR$")
	public void que_eu_acesse_o_sistema_CBTUR() throws Throwable {
		page.logarUsuarioGeral();
	}

	@Então("^deverá exibir a tela inicial do sistema$")
	public void deverá_exibir_a_tela_inicial_do_sistema() throws Throwable {
		page.telaInicial();
	}

}
