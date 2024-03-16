package stepdefinitions;

import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ConfigReader;
import utilities.Driver;


public class Hooks {

    @Before
    public void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("urlN11"));
    }

    @After
    public void tearDown (Scenario scenario){
        final byte[] screenshot= ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()){
            scenario.attach(screenshot,"image/png","screenshots");
        }
        //Driver.quitDriver();
    }
}
