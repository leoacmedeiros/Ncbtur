package runners.produto.gerenciarProdutos;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/produto/gerenciarProdutos/visualizarProduto"
				}
		,features = "src/test/resources/features/produto/gerenciarProdutos/VisualizarProduto.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class VisualizarProdutoRunner {

}
