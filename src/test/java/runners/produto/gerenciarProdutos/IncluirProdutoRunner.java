package runners.produto.gerenciarProdutos;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/produto/gerenciarProdutos/incluirProduto"
				}
		,features = "src/test/resources/features/produto/gerenciarProdutos/IncluirProduto.feature"
		,glue = {"stepDefinitions"}
		,tags = {"~@ignore" }
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class IncluirProdutoRunner {

}