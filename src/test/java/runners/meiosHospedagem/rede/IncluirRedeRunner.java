package runners.meiosHospedagem.rede;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/meiosHospedagem/gerenciar/cadastro/rede"
				}
		,features = "src/test/resources/features/meiosHospedagem/gerenciar/cadastro/rede/IncluirRede.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
		,dryRun = true
//		,dryRun = false
		)
public class IncluirRedeRunner {

}
