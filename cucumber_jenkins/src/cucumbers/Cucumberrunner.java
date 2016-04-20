package cucumbers;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format={"pretty","json:target/"},
		features={"src/cucumbers/"}
		)
public class Cucumberrunner {

}
