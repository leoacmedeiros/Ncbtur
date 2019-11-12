package runners.produto.taxa;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/produto/taxa/visualizarTaxa"
				}
		,features = "src/test/resources/features/produto/taxa/VisualizarTaxa.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class VisualizarTaxaRunner {

}
