package TEST;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class ReportGeneration {
	ExtentReports extentreports;
	ExtentSparkReporter htmlreport;
	ExtentTest testcase;
	WebDriver driver;


	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://senguttuone.blogspot.com/");


		// Write code here that turns the phrase above into concrete actions
		System.out.println("heloo");

		extentreports = new ExtentReports();	
		htmlreport = new ExtentSparkReporter("ExtentSpark.html");
		extentreports.attachReporter(htmlreport);
		testcase= extentreports.createTest("launch broswser");
		TakesScreenshot screenshot= (TakesScreenshot) driver;
		File sourceFile=screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile= new File("blog.png");
		try {
			FileHandler.copy(sourceFile, destinationFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		testcase.addScreenCaptureFromPath("blog.png");


	}

	@Given("some other precondition")
	public void some_other_precondition() {
		testcase= extentreports.createTest("some_other_precondition");
		// Write code here that turns the phrase above into concrete actions
		//  testcase.log(Status.PASS, "Okay");
	}

	@When("I complete action")
	public void i_complete_action() {
		testcase= extentreports.createTest("I complete action");
		// Write code here that turns the phrase above into concrete actions
		//	testcase.log(Status.INFO, "Okay");
	}

	@When("some other action")
	public void some_other_action() {
		testcase= extentreports.createTest("some other action");
		extentreports.flush();
		// Write code here that turns the phrase above into concrete actions
		//	testcase.log(Status.PASS, "Okay");
	}

	@When("yet another action")
	public void yet_another_action() {
		// Write code here that turns the phrase above into concrete actions
		//   testcase.log(Status.FAIL, "Ship");

	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Given("I want to write a step with name1")
	public void i_want_to_write_a_step_with_name1() {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Given("I want to write a step with name2")
	public void i_want_to_write_a_step_with_name2() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("I verify the Fail in step")
	public void i_verify_the_fail_in_step() {
		// Write code here that turns the phrase above into concrete actions

	}



}
