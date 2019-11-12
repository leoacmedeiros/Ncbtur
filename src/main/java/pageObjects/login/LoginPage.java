package pageObjects.login;

import org.openqa.selenium.By;

import core.BasePage;
import core.DriverFactory;

public class LoginPage extends BasePage {
	
	private static String EXTERNO = "http://cbtur-hml.bancorbras.com.br/";
	private static String TESTE = "http://ncbtur-tst.bancorbras.com.br/";
	
	public void acessarCBTUR() {
		DriverFactory.getDriver().get(TESTE);
	}

	public void setUsuario(String usuario) {
		escrever("UserName", usuario);
	}

	public void setSenha(String senha) {
		escrever("Password", senha);
	}

	public void entrar() {
		clicarBotao(By.xpath("//input[@class='btn btn-lg btn-primary btn-block']"));
	}

	public void telaInicial() {
		try {
			obterHome("Home", "//span[contains(text(),'Home')]");
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void logar(String usuario, String senha) {
		sleep(5);
		setUsuario(usuario);
		setSenha(senha);
		entrar();
	}

	public void logarUsuarioGeral() {
		acessarCBTUR();
		logar("002.747.501-80", "0000");
		sleep(10);
	}

}