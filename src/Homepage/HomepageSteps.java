package Homepage;

import java.lang.*;
import java.util.concurrent.TimeUnit;
import java.util.*;

import org.junit.Test;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class HomepageSteps {

    public static WebDriver driver;

    @Before
    public void beforeScenario() {
        System.setProperty("webdriver.chrome.driver", "/Library/Java/JUNIT/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("^je suis sur la homepage$")
    public void je_suis_sur_la_homepage() throws Throwable {
        driver.get("https://www.tesla.com/fr_fr");
    }

    @Then("^le titre doit être \"([^\"]*)\"$")
    public void le_titre_doit_être(String arg1) throws Throwable {
        System.out.println(" --- TEST DU TITRE PRINCIPALE--- ");
        assertEquals(driver.getTitle(), arg1);

    }

    @Then("^La description de la page d'accueil doit être: \"([^\"]*)\"$")
    public void la_description_de_la_page_d_accueil_doit_être(String arg1) throws Throwable {
        System.out.println(" --- TEST DE LA DESC. --- ");
        assertTrue(
                driver.findElement(By.cssSelector("meta[name='description']")).getAttribute("content").contains(arg1));
    }

    @Then("^la punchline doit être \"([^\"]*)\"$")
    public void la_punchline_doit_être(String arg1) throws Throwable {
        List<WebElement> allH1 = driver.findElements(By.cssSelector(".tcl-homepage-hero__content > h1"));
        for (WebElement h1 : allH1)
            if (h1.getText() == arg1) {
                assertEquals(h1.getText(), arg1);
            }
    }

    @Then("^je peux accéder au lien: \"([^\"]*)\"$")
    public void je_peux_accéder_au_lien(String arg1) throws Throwable {
        List<WebElement> AllH1 = driver.findElements(By.cssSelector(".tcl-homepage-hero__content > h1"));
        for (WebElement h1 : AllH1)
            if (h1.getText() == arg1) {
                assertEquals(h1.getText(), arg1);
            }
    }

    @When("^je suis dans le menu burger$")
    public void je_suis_dans_le_menu_burger() throws Throwable {
        boolean isClicked = driver.findElement(By.cssSelector(".tds-site-nav-items > li > button"))
                .isDisplayed();
    }

    @After
    public void afterScenario() {
        driver.quit();
    }

}
