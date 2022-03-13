package br.com.calculator.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import br.com.calculator.core.*;


@RunWith(Cucumber.class)
@CucumberOptions(glue = { "br.com.calculator.steps" }, features = {
		"src/main/resources" },tags =  "@geral")
public class Ruuner {
	
	

	@AfterClass
	public static void encerraDriver() {
	//Driver.encerraDriver(); 
	}
	

}
