package Eventpage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "../src/Eventpage" }, // ou se situe votre fichier .feature
        plugin = { "pretty" })
public class EventpageTest {

}