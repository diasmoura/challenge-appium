package br.com.calculator.core;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Driver {
	
	
	 private static AndroidDriver driver;
	 

	    public static AndroidDriver getDriver(){
	        if(driver == null){
	            conectar();
	        }
	        return driver;
	    }

	    private static AndroidDriver conectar() {
	        File diretorioAplicacao = new File("app");
	        File arquivoAplicacao = new File(diretorioAplicacao, "app-android-calculator.apk");

	        DesiredCapabilities capacidade = new DesiredCapabilities();
	        capacidade.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	        capacidade.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
	        capacidade.setCapability(MobileCapabilityType.APP, arquivoAplicacao.getAbsolutePath());
	        capacidade.setCapability(MobileCapabilityType.NO_RESET, "true");
	        capacidade.setCapability("appActivity","com.example.leonardomenezes.simplecalculatorandroid.MainActivity");
	        capacidade.setCapability("appPackage" , "com.example.leonardomenezes.simplecalculatorandroid");
	        capacidade.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 4600);


	        try {
	            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capacidade);
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        }

	        return driver;
	    }
	    
	    public static void encerraDriver() {
	    	if(driver!=null) {
				driver.quit();
				driver=null;
			}
	    	
	    }
	    
	    

}
