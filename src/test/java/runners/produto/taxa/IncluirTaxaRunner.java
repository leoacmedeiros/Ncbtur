package runners.produto.taxa;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/produto/taxa/incluirTaxa"
				}
		,features = "src/test/resources/features/produto/taxa/IncluirTaxa.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class IncluirTaxaRunner {

}
