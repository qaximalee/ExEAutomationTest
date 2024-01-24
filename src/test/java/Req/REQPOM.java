package Req;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;
import groovy.time.Duration;

public class REQPOM {

	WebDriver driver;

	public REQPOM(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().window().maximize();

	}

	@FindBy(linkText = "Request Quote")
	@CacheLookup
	public WebElement reqCTA;

	@FindBy(id = "email")
	@CacheLookup
	WebElement reqEmail;

	@FindBy(id = "next-btn")
	@CacheLookup
	WebElement reqNextButton;

	@FindBy(id = "first-name")
	@CacheLookup
	WebElement reqfname;

	@FindBy(id = "last-name")
	@CacheLookup
	WebElement reqlname;

	@FindBy(id = "phone")
	@CacheLookup
	WebElement reqphone;

	@FindBy(id = "company")
	@CacheLookup
	WebElement reqcompany;

	@FindBy(id = "no-of-employees")
	@CacheLookup
	WebElement reqNoOfEmployees;

	@FindBy(id = "Countries")
	@CacheLookup
	WebElement reqCountries;

	@FindBy(partialLinkText = "Canada")
	@CacheLookup
	WebElement countryItem;

	@FindBy(id = "primaryInterest")
	@CacheLookup
	WebElement reqPrimaryInterest;

	@FindBy(partialLinkText = "APIs")
	@CacheLookup
	WebElement interestItem;

	@FindBy(id = "submit-btn")
	@CacheLookup
	WebElement reqsubmitButton;

	public void clickOnNextButton() throws InterruptedException {
		BaseClass.clickonbutton(reqNextButton);
	}

	public void fillFirstDivAndClickOnNextButton() throws InterruptedException {
		Thread.sleep(2000);
		reqCTA.click();
		//System.out.println("CTA Clicked-->\n"+reqCTA.getText().toString());
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		
		try {
			reqEmail.sendKeys("test123@gmail.com");;
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", reqEmail);
		}
		
		//WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == 'complete'"));
				 // Use FluentWait to wait for the element to be visible
				// WebElement element = wait.until(driver -> driver.findElement(By.id(“elementId”)));
				 // Perform actions on the element
		
		System.out.println("Text of the email-->\n"+reqEmail.getText().toString());
		//reqEmail.sendKeys("test@gmail.com");
		Thread.sleep(2000);
		BaseClass.clickonbutton(reqNextButton);
	}

	public void fillSecondDivAndClickOnNextButton() throws InterruptedException {

		reqfname.sendKeys("First Name");
		reqlname.sendKeys("Last Name");
		System.out.println("company text-->"+reqcompany.getAttribute("id"));
		//BaseClass.elementVissiblity(reqcompany);
		Thread.sleep(3000);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//@Deprecated
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == 'complete'"));
		
		try {
			reqcompany.sendKeys("18883058271");
			Thread.sleep(3000);
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", reqcompany);
		}

		//reqcompany.sendKeys("18883058271");
		
		
		
		BaseClass.clickonbutton(reqNextButton);
	}

	public void selectReqCountry() throws InterruptedException {

		Thread.sleep(5000);
		reqCountries.click();
		// System.out.println("Selected Country-->" + countryItem.getText());
		Thread.sleep(5000);
		countryItem.click();

	}
	
	public void scrollTilInterestFields() throws InterruptedException {
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// System.out.println("Text is--" + name.getTagName());
		// name.getTagName();
		js.executeScript("arguments[0].scrollIntoView();", reqPrimaryInterest);
	}

	public void selectInterest() throws InterruptedException {

		Thread.sleep(5000);
		reqPrimaryInterest.click();
		Thread.sleep(5000);
		try {
		interestItem.click();
		}
		catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", interestItem);
	}

	}
	public void fillThirdDivAndClickOnSubmittButton() throws InterruptedException {
		Thread.sleep(3000);
		reqcompany.sendKeys("8x8");
		reqNoOfEmployees.sendKeys("1000");
		
		scrollTilInterestFields();
		Thread.sleep(2000);
		selectReqCountry();
		Thread.sleep(2000);
		selectInterest();
		Thread.sleep(2000);
		BaseClass.clickonbutton(reqsubmitButton);
	}

}
