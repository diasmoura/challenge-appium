package br.com.calculator.core;

import static br.com.calculator.core.Driver.getDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseScreen {

	public void esperarElementoPresente(By by) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	public void esconderTeclado() {
		getDriver().hideKeyboard();
	}

}
