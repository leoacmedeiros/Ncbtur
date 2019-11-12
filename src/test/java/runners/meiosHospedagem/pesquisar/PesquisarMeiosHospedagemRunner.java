package runners.meiosHospedagem.pesquisar;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/meiosHospedagem/gerenciar/Pesquisar"
				}
		,features = "src/test/resources/features/meiosHospedagem/gerenciar/Pesquisar.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class PesquisarMeiosHospedagemRunner {

}
