package runners.produto.campanha;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/produto/campanha/incluirCampanha"
				}
		,features = "src/test/resources/features/produto/campanha/IncluirCampanha.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class IncluirCampanhaRunner {

}
