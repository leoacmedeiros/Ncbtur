package runners.meiosHospedagem.proposta;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/meiosHospedagem/negociacao/novoConvenioProposta"
				}
		,features = "src/test/resources/features/meiosHospedagem/negociacao/novoConvenioProposta/EditarPropostaDadosCadastrais.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class EditarPropostaDadosCadastraisRunner {

}
