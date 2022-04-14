package Homepage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "../src/Homepage" }, // ou se situe votre fichier .feature
        plugin = { "pretty" })
public class HomepageTest {

}