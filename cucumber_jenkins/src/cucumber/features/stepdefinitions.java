package cucumber.features;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepdefinitions {
	
	WebDriver driver;
	
	@Given("^this is my firststeps$")
	public void this_is_my_firststep() throws Throwable {
		driver = new FirefoxDriver();
		driver.get("https://www.etsy.com/");
	    System.out.println("this is my firststep");
	}

	@Then("^this is my secondsteps$")
	public void this_is_my_secondstep() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("search-query")).sendKeys("iphone");
		driver.findElement(By.xpath("//div[@class='search-button-wrapper hide']/button")).click();
		 System.out.println("this is my secondstep");
	}

	@Then("^this is my thirdsteps$")
	public void this_is_my_thirdstep() throws Throwable {
		 System.out.println("this is my thirdstep");
	}

}
