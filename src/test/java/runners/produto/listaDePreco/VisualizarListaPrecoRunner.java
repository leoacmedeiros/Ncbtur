package runners.produto.listaDePreco;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/produto/listaDePreco/visualizarListaDePreco"
				}
		,features = "src/test/resources/features/produto/listaDePreco/VisualizarListaDePreco.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class VisualizarListaPrecoRunner {

}
