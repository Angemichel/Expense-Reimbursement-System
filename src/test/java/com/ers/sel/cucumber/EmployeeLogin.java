package com.ers.sel.cucumber;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeLogin {
	public static WebDriver driver;
	@Given("User is on home page")
	public void user_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kouam\\OneDrive\\Desktop\\WebDrivers\\chromedriver.exe");
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		//throw new io.cucumber.java.PendingException();
		driver.get("http://localhost:8080/");
		System.out.println("User is on Home page");
	}

	@When("User  enter {string} and {string}")
	public void user_enter_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement uname = driver.findElement(By.id("username"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000000));
		WebElement password = driver.findElement(By.id("password"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000000));
		uname.sendKeys("Kyrie Irving");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000000));
		password.sendKeys("ki");
		System.out.println("User enters Username and Password");
	}

	@When("User selects employee button")
	public void user_selects_employee_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000000));
		WebElement empBtn = driver.findElement(By.id("employee"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000000));
		empBtn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000000));
		WebElement loginBtn = driver.findElement(By.id("submit"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000000));
		loginBtn.click();
		System.out.println("::: Login");
	}

	@Then("The employee page is displayed")
	public void the_employee_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Login Successful ...");
		//driver.quit();
	}
}
