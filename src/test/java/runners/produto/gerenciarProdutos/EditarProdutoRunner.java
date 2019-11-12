package runners.produto.gerenciarProdutos;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/produto/gerenciarProdutos/editarProduto"
				}
		,features = "src/test/resources/features/produto/gerenciarProdutos/EditarProduto.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class EditarProdutoRunner {

}
