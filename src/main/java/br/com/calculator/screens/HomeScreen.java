package br.com.calculator.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import static br.com.calculator.core.Driver.getDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import br.com.calculator.core.BaseScreen;

public class HomeScreen extends BaseScreen{

	public HomeScreen() {
		PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
	}
	
	@AndroidFindBy(id = "android_field_first_number")
    WebElement campoFirstNumber;
	
	@AndroidFindBy(id = "android_field_second_number")
    WebElement campoSecondNumber;

	@AndroidFindBy(id = "android_button_sum")
    WebElement botaoSoma;
	
	@AndroidFindBy(id = "android_result_text")
    WebElement resultadoTexto;

	public WebElement getResultadoTexto() {
		return resultadoTexto;
	}

	public void setResultadoTexto(WebElement resultadoTexto) {
		this.resultadoTexto = resultadoTexto;
	}

	public WebElement getCampoSecondNumber() {
		return campoSecondNumber;
	}

	public void setCampoSecondNumber(WebElement campoSecondNumber) {
		this.campoSecondNumber = campoSecondNumber;
	}

	public WebElement getCampoFirstNumber() {
		return campoFirstNumber;
	}

	public void setCampoFirstNumber(WebElement campoFirstNumber) {
		this.campoFirstNumber = campoFirstNumber;
	}
	
	public WebElement getBotaoSoma() {
		return botaoSoma;
	}

	public void setBotaoSoma(WebElement botaoSoma) {
		this.botaoSoma = botaoSoma;
	}

}
