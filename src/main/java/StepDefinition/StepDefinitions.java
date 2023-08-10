package StepDefinition;
import Locatori.Locatori;
import Utilities.ChromeConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
    ChromeDriver driver;

    Locatori locatori = new Locatori();

    @Given("Open the browser")
    public void deschideChrome() {
        driver = ChromeConfig.getChromeDriver();
    }

    @When("Access page {string}")
    public void acceseazaPagina(String url) {
        driver.get(url);
    }

    @And("Press button {string}")
    public void pressButton(String var) {
        By buttonlocator = locatori.buttonName(var);
        WebElement element = driver.findElement(buttonlocator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }

    @And("Complete field {string} with value {string}")
        public void completeazaField (String fieldName, String value){
            By fieldlocator = locatori.fieldName(fieldName);
            WebElement element = driver.findElement(fieldlocator);
            element.sendKeys(value);


        }



}
