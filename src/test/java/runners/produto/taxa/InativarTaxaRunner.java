package runners.produto.taxa;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/produto/taxa/inativarTaxa"
				}
		,features = "src/test/resources/features/produto/taxa/InativarTaxa.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
		,dryRun = true
//		,dryRun = false
		)
public class InativarTaxaRunner {

}
