package runners;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//plugin = "pretty", // exibir as features no console
		monochrome = true,
		snippets = SnippetType.CAMELCASE, // coloca os metodos concatenados 
		dryRun = false,  // valida a estrutura dos testes
		strict = false // caso nao encontre um teste, da erro no teste
		)
public class Runner {

}
