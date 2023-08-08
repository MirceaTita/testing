package StepDefinition;
import Utilities.ChromeConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
    ChromeDriver driver;

    @Given("Open the browser")
    public void deschideChrome(){
        driver=ChromeConfig.getChromeDriver();
    }
    @When("Access page {string}")
    public void acceseazaPagina(String url){
        driver.get(url);

    }



}
