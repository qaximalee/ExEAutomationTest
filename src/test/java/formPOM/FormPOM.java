package formPOM;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import Utilities.BaseClass;
import junit.framework.Assert;
@Test
public class FormPOM {
	WebDriver driver;
	//ChromeDriver driver;
	BaseClass baseclass;
	ChromeOptions option;

	public FormPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().window().maximize();
	}

	// -----------------------Start of RAQ Form-----------------------------//
	@FindBy(linkText = "Request Quote")
	@CacheLookup
	public WebElement reqCTA;

	public String previewUrl = "https://deploy-preview-2552--legendary-monstera-200afd.netlify.app/automation-testing";
	public String marketoUrl = "https://deploy-preview-2552--legendary-monstera-200afd.netlify.app/.netlify/functions/post-marketo-lead";

	//
	@FindBy(id = "email")
	@CacheLookup
	WebElement reqEmail;

	@FindBy(id = "next-btn")
	@CacheLookup
	WebElement reqNextButton;
	
	@FindBy(xpath = "//button[@aria-label='Back button']")
	@CacheLookup
	WebElement reqBackButton;
	
	
	@FindBy(xpath = "//button[@id='back-ctaID']")
	@CacheLookup
	WebElement reqSecondBackButton;
	
	//@FindBy(xpath = "/html/body/div[1]/div[1]/main/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/div/button")
	@FindBy(xpath="//button[@id='nexttwo-btn']")
	@CacheLookup
	WebElement reqSecondNextButton;

	@FindBy(id = "first-name")
	@CacheLookup
	WebElement reqfname;
	
	@FindBy(xpath = "//*[@id=\"flexMob\"]/div[1]/p[1]")
	@CacheLookup
	WebElement reqfnameLable;
	
	@FindBy(xpath = "//*[@id=\"flexMob\"]/div[1]/p[2]")
	@CacheLookup
	WebElement reqfnameReqError;
	
	@FindBy(xpath = "//*[@id=\"flexMob\"]/div[1]/p[2]")
	@CacheLookup
	WebElement reqComReqError;
	
	@FindBy(xpath = "//*[@id=\"flexMob\"]/div[2]/p[2]")
	@CacheLookup
	WebElement reqNOEReqError;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/main/div/div[2]/div/div/div[1]/div[3]/div/div[1]/div[1]/div[1]/p[2]")
	@CacheLookup
	WebElement reqSpecialCharcterError;
	
	@FindBy(xpath = "//*[@id=\"flexMob\"]/div[1]/p[2]")
	@CacheLookup
	WebElement reqSpecialChNotAllowedErrorfName;
	
	@FindBy(xpath = "//*[@id=\"flexMob\"]/div[2]/p[2]")
	@CacheLookup
	WebElement reqSpecialChNotAllowedErrorlName;
	
	////*[@id="flexMob"]/div[1]/p[2]
	

	@FindBy(id = "last-name")
	@CacheLookup
	WebElement reqlname;
	
	@FindBy(xpath = "//*[@id=\"flexMob\"]/div[2]/p[1]")
	@CacheLookup
	WebElement reqlnameLable;
	
	@FindBy(xpath = "//*[@id=\"flexMob\"]/div[2]/p[2]")
	@CacheLookup
	WebElement reqlnameReqError;

	@FindBy(id = "phone")
	@CacheLookup
	WebElement reqphone;
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/main/div/div[2]/div/div/div[1]/div[2]/div/div[1]/div[2]/p[1]")
	@CacheLookup
	WebElement reqphoneLable;
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/main/div/div[2]/div/div/div[1]/div[2]/div/div[1]/div[2]/p[2]")
	@CacheLookup
	WebElement reqphoneReqError;
	
	@FindBy(id = "company")
	@CacheLookup
	WebElement reqcompany;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/main/div/div[2]/div/div/div[1]/div[3]/div/div[1]/div[1]/div[1]/p[2]")
	@CacheLookup
	WebElement reqCompanySpecialCharacterError;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/main/div/div[2]/div/div/div[1]/div[3]/div/div[1]/div[1]/div[1]/p[1]")
	@CacheLookup
	WebElement reqcompanyLable;

	@FindBy(id = "no-of-employees")
	@CacheLookup
	WebElement reqNoOfEmployees;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/main/div/div[2]/div/div/div[1]/div[3]/div/div[1]/div[3]/p")
	@CacheLookup
	WebElement reqStateLable;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/main/div/div[2]/div/div/div[1]/div[3]/div/div[1]/div[1]/div[2]/p[1]")
	@CacheLookup
	WebElement reqNoOfEmployeesLable;

	@FindBy(id = "Countries")
	@CacheLookup
	WebElement reqCountries;
	
	@FindBy(partialLinkText ="United States")
	@CacheLookup
	WebElement reqCountryItem1_United_States;
	
	@FindBy(xpath="//div[@class='dropdown-content']/child::a[2]")
	@CacheLookup
	WebElement reqCountryItem2_Canada;
	
	@FindBy(xpath="//div[@class='dropdown-content']/child::a[232]")
	@CacheLookup
	WebElement reqCountryItem232_Zambia;
	
	@FindBy(xpath="//div[@class='dropdown-content']/child::a[233]")
	@CacheLookup
	WebElement reqCountryItem233_Zimbabwe;

	@FindBy(partialLinkText = "United States")
	@CacheLookup
	WebElement reqcountryItemUS;
	
	@FindBy(id = "State")
	@CacheLookup
	WebElement reqState;
	
	@FindBy(partialLinkText = "Canada")
	@CacheLookup
	WebElement reqcountryItemCanada;

	@FindBy(id = "primaryInterest")
	@CacheLookup
	WebElement reqPrimaryInterest;

	@FindBy(partialLinkText = "Communication APIs")
	@CacheLookup
	WebElement reqinterestItem;
	
	

	@FindBy(partialLinkText = "Alaska")
	@CacheLookup
	WebElement reqStateItem;

	@FindBy(id = "submit-btn")
	@CacheLookup
	WebElement reqsubmitButton;

	// RAQ Methods

	public void clickOnNextButton() throws InterruptedException {
		BaseClass.clickonbutton(reqNextButton);
	}

	public void clickondemoButton() throws InterruptedException {
		baseclass = new BaseClass();
		baseclass.performMouseActionIfElementNotClickable(reqCTA);
		System.out.println("----------End of first Method-------");
	}

	public void fillFirstDivAndClickOnNextButton() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(2000);
		// baseclass.performMouseActionIfElementNotClickable(reqCTA);
		// reqCTA.click();
		// baseclass.jsExecutorForClick(reqCTA);
		// baseclass.retryingFindClick(reqCTA);
		// System.out.println("CTA Clicked-->\n"+reqCTA.getAccessibleName());
		Actions action = new Actions(driver);
		Thread.sleep(2000);

		try {
			Thread.sleep(3000);
			reqEmail.sendKeys("test@gmail.com");
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", reqEmail);
		}

		// WebDriverWait wait = new WebDriverWait(driver,
		// java.time.Duration.ofSeconds(20));
		// wait.until(ExpectedConditions.jsReturnsValue("return document.readyState ==
		// 'complete'"));
		// Use FluentWait to wait for the element to be visible
		// WebElement element = wait.until(driver ->
		// driver.findElement(By.id(“elementId”)));
		// Perform actions on the element

		System.out.println("Text of the email-->\n" + reqEmail.getText().toString());
		// reqEmail.sendKeys("test@gmail.com");
		Thread.sleep(2000);
		BaseClass.clickonbutton(reqNextButton);
	}

	public void fillSecondDivAndClickOnNextButton() throws InterruptedException {

		System.out.println("company text-->" + reqcompany.getAttribute("id"));
		// BaseClass.elementVissiblity(reqcompany);
		Thread.sleep(3000);
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		// @Deprecated
		// WebDriverWait wait = new WebDriverWait(driver, 10);
		// wait.until(ExpectedConditions.jsReturnsValue("return document.readyState ==
		// 'complete'"));

		try {
			reqfname.sendKeys("First Name");
			reqlname.sendKeys("Last Name");
			reqphone.sendKeys("18883058271");

			Thread.sleep(3000);
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", reqcompany);
		}

		// reqcompany.sendKeys("18883058271");

		BaseClass.clickonbutton(reqNextButton);
	}

	public void selectReqCountry() throws InterruptedException {

		Thread.sleep(5000);
		reqCountries.click();
		// System.out.println("Selected Country-->" + countryItem.getText());
		Thread.sleep(5000);
		reqCountryItem1_United_States.click();
	}

	public void selectReqCountry_Canada() throws InterruptedException {

		Thread.sleep(5000);
		reqCountries.click();
		// System.out.println("Selected Country-->" + countryItem.getText());
		Thread.sleep(5000);
		reqCountryItem2_Canada.click();
	}
	public void selectState() throws InterruptedException {

		Thread.sleep(5000);
		reqState.click();
		Thread.sleep(5000);
		try {
			reqStateItem.click();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", reqStateItem);
		}
	}
	
	public void scrollTilState() throws InterruptedException {
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// System.out.println("Text is--" + name.getTagName());
		// name.getTagName();
		js.executeScript("arguments[0].scrollIntoView();", reqState);
	}

	public void selectInterest() throws InterruptedException {

		Thread.sleep(5000);
		reqPrimaryInterest.click();
		Thread.sleep(5000);
		try {
			reqinterestItem.click();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", reqinterestItem);
		}
		
	}

	
	
	public void fillThirdDivAndClickOnSubmittButton() throws InterruptedException {
		Thread.sleep(3000);
		reqcompany.sendKeys("8x8");
		reqNoOfEmployees.sendKeys("1000");
		baseclass = new BaseClass();
		baseclass.scroll(reqCountries);
		Thread.sleep(2000);
		selectReqCountry();
		Thread.sleep(2000);
		selectInterest();
		Thread.sleep(2000);
		BaseClass.clickonbutton(reqsubmitButton);
		Thread.sleep(4000);
		// baseclass=new BaseClass();
		BaseClass.teardowon();
	}

	// ----------------------- End of RAQ Form-----------------------------//

	//

	//

	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/main/div/div[2]/div/div/div[1]/div[1]/div/div[1]/p[2]")
	@CacheLookup
	public WebElement emailrequiredError;
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/main/div/div[2]/div/div/div[1]/div[1]/div/div[1]/p[2]")
	@CacheLookup
	public WebElement blockEmailError;
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/main/div/div[2]/div/div/div[1]/div[1]/div/div[1]/p[2]")
	@CacheLookup
	public WebElement blockEmailError2;

	@FindBy(id = "email")
	@CacheLookup
	public WebElement emailField;

	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/main/div/div[2]/div/div/div[1]/div[1]/div/div[1]/p[1]")
	@CacheLookup
	public WebElement emaillable;

	
	//
	@FindBy(xpath = "//*[@id=\"flexMob\"]/div[1]/p[2]")
	@CacheLookup
	public WebElement firstNamerequiredError;

	@FindBy(xpath = "//*[@id=\"cro-field\"]")
	@CacheLookup
	public WebElement firstNamefield;

	@FindBy(xpath = "//*[@id=\"flexMob\"]/div[1]/p[1]")
	@CacheLookup
	public WebElement firstNamelable;
	@FindBy(xpath = "//*[@id=\"flexMob\"]/div[2]/p[2]")
	@CacheLookup
	public WebElement lastNamerequiredError;

	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/main/div/div[2]/div/div/div[1]/div[1]/div/div[1]/p[2]")
	@CacheLookup
	public WebElement phonerequiredError;

	@FindBy(xpath = "//*[@id=\"flexMob\"]/div[2]/p[2]")
	@CacheLookup
	public WebElement employeesrequiredError;

	@FindBy(xpath = "//*[@id=\"flexMob\"]/div[1]/p[2]")
	@CacheLookup
	public WebElement companyrequiredError;

	//// *[@id="flexMob"]/div[1]/p[2]

	//

	@FindBy(id = "//*[@id=\"uid\"]")
	@CacheLookup
	public static WebElement formId;

	@FindBy(id = "full-name")
	@CacheLookup
	WebElement fullname;

	@FindBy(id = "tên")
	@CacheLookup
	WebElement ten;

	@FindBy(id = "công-ty")
	@CacheLookup
	WebElement cong_ty;

	@FindBy(id = "số-lượng nhân viên")
	@CacheLookup
	WebElement so_luong_nhan_vien;

	@FindBy(id = "họ")
	@CacheLookup
	WebElement ho;
	@FindBy(id = "first-and last name")
	@CacheLookup
	WebElement first_and_last_name;

	@FindBy(id = "first-name")
	@CacheLookup
	WebElement fname;

	@FindBy(id = "last-name")
	@CacheLookup
	WebElement lname;

	@FindBy(id = "email")
	@CacheLookup
	WebElement email;

	@FindBy(id = "phone")
	@CacheLookup
	WebElement phone;

	@FindBy(id = "company")
	@CacheLookup
	WebElement company;

	@FindBy(id = "Contact Phone Number")
	@CacheLookup
	WebElement contact_phone_number;

	@FindBy(id = "phone-number")
	@CacheLookup
	WebElement phonenumber;

	@FindBy(id = "company-name")
	@CacheLookup
	WebElement companyName;

	@FindBy(id = "type-of company")
	@CacheLookup
	WebElement type_of_company;

	@FindBy(id = "estimated-number of monthly active users")
	@CacheLookup
	WebElement estimated_monthly_active_user;

	@FindBy(id = "anything-else that can help us prepare for the call?")
	@CacheLookup
	WebElement prepare_for_call;

	@FindBy(xpath = "//a[@value='Government']")
	@CacheLookup
	WebElement type_of_company_Item;

	@FindBy(id = "industry")
	@CacheLookup
	WebElement industry;

	@FindBy(xpath = "//a[@value='Agriculture']")
	@CacheLookup
	WebElement industry_item;

	@FindBy(id = "legal-company name")
	@CacheLookup
	WebElement legal_company_name;

	@FindBy(id = "doing-business as")
	@CacheLookup
	WebElement doing_business_as;

	@FindBy(id = "street-address")
	@CacheLookup
	WebElement street_address;

	@FindBy(id = "city")
	@CacheLookup
	WebElement city;

	@FindBy(id = "zip-code")
	@CacheLookup
	WebElement zip_code;

	@FindBy(id = "ein-(employer identification number)")
	@CacheLookup
	WebElement employee_number;

	@FindBy(id = "stock-symbol")
	@CacheLookup
	WebElement stock_symbol;

	@FindBy(id = "stock-exchange")
	@CacheLookup
	WebElement stock_exchange;

	@FindBy(id = "website")
	@CacheLookup
	WebElement website;

	@FindBy(id = "sms-active 8x8 number")
	@CacheLookup
	WebElement active_number;

	@FindBy(id = "number-of employees")
	@CacheLookup
	WebElement no_of_employees;

	@FindBy(id = "country/region")
	@CacheLookup
	WebElement country_region;

	@FindBy(id = "country")
	@CacheLookup
	WebElement country;
	
	

	@FindBy(id = "quốc-gia")
	@CacheLookup
	WebElement country24;

	@FindBy(id = "message")
	@CacheLookup
	WebElement message;
	

	@FindBy(partialLinkText = "Albania")
	@CacheLookup
	WebElement countryItem;

	@FindBy(id = "us/ca-demo date")
	@CacheLookup
	public static WebElement ca_demo_date;

	@FindBy(xpath = "//a[@value='12/13/2021']")
	@CacheLookup
	public static WebElement ca_demo_date_Item;

	@FindBy(id = "demo-date")
	@CacheLookup
	public static WebElement demo_date;

	@FindBy(xpath = "//a[@value='03/09/2022']")
	@CacheLookup
	public static WebElement demo_date_Item1;

	@FindBy(xpath = "//a[@value='05/03/2022']")
	@CacheLookup
	public static WebElement demo_date_Item21;

	@FindBy(xpath = "//a[@data-clean-label='Wed, Mar 16']")
	@CacheLookup
	public WebElement demo_date_Item2;

	// String temp=timeItem.getText();

	@FindBy(id = "primary-interest")
	@CacheLookup
	WebElement interest;

	@FindBy(partialLinkText = "Chat Apps")
	@CacheLookup
	WebElement interestItem;

	@FindBy(css = "#gatsby-focus-wrapper > div > div > h3")
	@CacheLookup
	WebElement successmessage;
	//

	@FindBy(id = "submitRaqForm")
	@CacheLookup
	WebElement submitbutton;

	public void fillFirsNameForm() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(3000);
		baseclass.clearsixFiled(fname, lname, email, phonenumber, companyName, no_of_employees);
		Thread.sleep(2000);
		baseclass.FillFirstLastNameForm(fname, lname, email, phonenumber, companyName, no_of_employees);
		Thread.sleep(2000);
		baseclass.scroll(no_of_employees);
		baseclass.selectFromList(country_region, countryItem);
		Thread.sleep(2000);
	}

	public void fillFirsNameForm10() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(4000);
		baseclass.clearFiveFiled(fname, lname, email, companyName, no_of_employees);
		baseclass.FillFirstLastNameWithoutPhoneForm(fname, lname, email, companyName, no_of_employees);
		Thread.sleep(3000);
		baseclass.scroll(no_of_employees);
		baseclass.selectFromList(country_region, countryItem);
		Thread.sleep(2000);
	}

	public void fillFirsNameFormWithCoutryAndState() throws InterruptedException {
		// BaseClass.clearsixFiled(fname, lname, email, phonenumber, companyName,
		// no_of_employees);
		baseclass = new BaseClass();
		Thread.sleep(4000);
		baseclass.clearsixFiled(fname, lname, email, phonenumber, companyName, no_of_employees);
		Thread.sleep(2000);
		baseclass.FillFirstLastNameForm(fname, lname, email, phonenumber, companyName, no_of_employees);
		Thread.sleep(2000);
		baseclass.scroll(no_of_employees);
		// String temp=country_region.getAccessibleName();
		// System.out.println("--Region is-->"+temp);
		baseclass.selectFromList(country_region, countryItem);
		Thread.sleep(2000);
		baseclass.selectInterest(interest, interestItem);
	}

	public void fillFirstNameForm4() throws InterruptedException {
		baseclass = new BaseClass();
		// baseclass.waitforElement(email);
		Thread.sleep(4000);
		// baseclass.clearOneFiled(email);
		// baseclass.clearsixFiled(fname, lname, email, phone, company,
		// no_of_employees);
		// Thread.sleep(3000);
		baseclass.fillFirstAndLastName(fname, lname);
		Thread.sleep(3000);
		baseclass.scroll(no_of_employees);
		// String temp=country_region.getAccessibleName();
		// System.out.println("--Region is-->"+temp);
		// baseclass.selectFromList(country, countryItem);
		Thread.sleep(4000);
		// BaseClass.selectInterest(interest, interestItem);
	}

	public void fillFullNameForm() throws InterruptedException {
		// BaseClass.clearOneFiled(email);
		baseclass = new BaseClass();
		Thread.sleep(4000);
		baseclass.clearFourFiled(email, phone, company, no_of_employees);
		baseclass.FillFullNameForm(fullname, email, phone, company, no_of_employees);
		Thread.sleep(2000);
		baseclass.scroll(no_of_employees);
		// BaseClass.selectCountry_region(country_region, countryItem);
		Thread.sleep(2000);
		// BaseClass.selectInterest(interest, interestItem);
	}

	public void fillFirstAndLastNameForm15() throws InterruptedException {
		Thread.sleep(3000);
		baseclass = new BaseClass();
		// baseclass.clearFourFiled(first_and_last_name, email, contact_phone_number,
		// legal_company_name);
		// baseclass.clearOneFiled(email);
		// Thread.sleep(2000);
		baseclass.FillFirstAndLastNameForm16_1(first_and_last_name, email, contact_phone_number, legal_company_name,
				doing_business_as);
		Thread.sleep(2000);
		baseclass.selectFromList(industry, industry_item);
		Thread.sleep(3000);
		baseclass.scroll(industry);
		Thread.sleep(2000);
		baseclass.selectFromList(type_of_company, type_of_company_Item);
		Thread.sleep(3000);
		baseclass.FillFirstAndLastNameForm16_2(street_address, city, zip_code, employee_number);
		// baseclass.selectFromList(country_region, countryItem);
		Thread.sleep(3000);
		baseclass.scroll(zip_code);
		Thread.sleep(2000);
		baseclass.FillFirstAndLastNameForm16_3(stock_symbol, stock_exchange, website, active_number);

	}

	public void fillFullNameForm5() throws InterruptedException {
		// BaseClass.clearOneFiled(email); Thread.sleep(2000);
		// System.out.println("Phone-->"+phone.getAccessibleName());
		baseclass = new BaseClass();
		Thread.sleep(4000);
		baseclass.clearThreeFiled(email, company, no_of_employees);
		Thread.sleep(2000);

		baseclass.FillFullNamewithfourfieldForm(fullname, email, company, no_of_employees);
		Thread.sleep(2000);
		baseclass.scroll(no_of_employees);
		Thread.sleep(6000);
	}

	public void fillFullNameForm8() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(4000);
		baseclass.clearTwoFiled(email, company);
		Thread.sleep(2000);

		baseclass.FillFullNameWithThreefieldAndCountryForm(fullname, email, company);
		Thread.sleep(2000);
	}

	public void fillForm21() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(3000);
		baseclass.fillFullField(fullname);
		Thread.sleep(2000);
		baseclass.selectFromList(demo_date, demo_date_Item21);
		Thread.sleep(2000);
		baseclass.scroll(company);

	}

	public void emptyformsubmission() throws InterruptedException {
		Thread.sleep(3000);
	}

	public void fillForm24() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(3000);
		baseclass.fillFirstAndLastName(ten, ho);
		Thread.sleep(3000);
		baseclass.scroll(so_luong_nhan_vien);
		Thread.sleep(2000);
		baseclass.fillcompanyField(cong_ty);
		Thread.sleep(2000);
		baseclass.fillNumberOfEmployees(so_luong_nhan_vien);
		// baseclass.FillFullNamewithfourfieldForm(ten, ho, cong_ty,
		// so_luong_nhan_vien);

		Thread.sleep(3000);
		baseclass.selectFromList(country24, countryItem);
		Thread.sleep(3000);
	}

	public void fillemailAndCountryForm() throws InterruptedException {
		System.out.println("No Implementation Required----");

		// baseclass=new BaseClass();
		Thread.sleep(4000);
		// baseclass.clearOneFiled(email);
		// baseclass.FillEmailAndCountryRegionForm(email);
		// baseclass.selectFromList(country_region, countryItem);
		// Thread.sleep(1000);
	}

	public void fillFullNamewithcountryForm() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(4000);
		baseclass.selectFromList(ca_demo_date, ca_demo_date_Item);
		Thread.sleep(2000);
		baseclass.clearFiveFiled(fullname, email, phone, company, no_of_employees);

		Thread.sleep(2000);
		baseclass.FillFullNameForm(fullname, email, phone, company, no_of_employees);

		Thread.sleep(2000);
		baseclass.scroll(no_of_employees);

		// System.out.println("Value of time from List After Click-->"+temp);
		baseclass.selectFromList(country, countryItem);
		Thread.sleep(5000);
	}

	public void fillFullNamewithcountryForm14() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(4000);
		baseclass.clearFiveFiled(fullname, email, phone, company, no_of_employees);

		Thread.sleep(2000);
		baseclass.FillFullNameForm(fullname, email, phone, company, no_of_employees);

		Thread.sleep(2000);
		baseclass.selectFromList(demo_date, demo_date_Item1);
		System.out.println("Hello from method 14");
		Thread.sleep(2000);
		baseclass.scroll(no_of_employees);

		// System.out.println("Value of time from List After Click-->"+temp);
		baseclass.selectFromList(country, countryItem);
		System.out.println("----Method 14 Ended----");

	}

	public void fillFullNamewithcountryForm15() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(4000);
		baseclass.clearFiveFiled(fullname, email, phone, company, no_of_employees);

		Thread.sleep(2000);
		baseclass.FillFullNameForm(fullname, email, phone, company, no_of_employees);

		Thread.sleep(3000);
		baseclass.selectFromList(demo_date, demo_date_Item2);

		Thread.sleep(2000);
		baseclass.scroll(no_of_employees);

		// System.out.println("Value of time from List After Click-->"+temp);
		baseclass.selectFromList(country, countryItem);
	}

	public void fill4TextField() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(4000);
		fname.sendKeys("First");
		lname.sendKeys("Last Name");
		Thread.sleep(2000);
		baseclass.scroll(country_region);
		Thread.sleep(2000);
		estimated_monthly_active_user.sendKeys("100");
		prepare_for_call.sendKeys("Are you calling?");
	}

	public void fill2TextField() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(4000);
		fullname.sendKeys("User Full Name");
		no_of_employees.sendKeys("500");

	}

	public void fillfullname() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(4000);
		fullname.sendKeys("User Full Name");
		Thread.sleep(2000);
		baseclass.selectFromList(demo_date, demo_date_Item21);
		// no_of_employees.sendKeys("500");

	}

	public void fillfullnamewithScrolltoCompany() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(4000);
		fullname.sendKeys("User Full Name");
		Thread.sleep(2000);
		baseclass.scroll(company);
		Thread.sleep(2000);

	}

	public void fillFirstAndLastName() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(4000);
		baseclass.fillFirstAndLastName(fname, lname);
		Thread.sleep(2000);
		baseclass.scroll(country_region);

	}

	public void fillPhoneNumberAndMessage() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(4000);
		baseclass.fillphoneField(phonenumber);
		Thread.sleep(2000);
		baseclass.scroll(country_region);
		Thread.sleep(2000);
		baseclass.selectInterest(interest, interestItem);
		Thread.sleep(2000);
		baseclass.fillGeneralTextField(message);
	}

	public void submitform() throws InterruptedException {
		BaseClass.clickonbutton(submitbutton);

	}

	public void verifyMessage() throws InterruptedException {
		baseclass = new BaseClass();
		// baseclass.httpResponseCodeViaPost(onePageUrl);
		// String actual = successmessage.getText();
		String expected = "Thank you for your interest";
		// if (actual.equals(expected)) {
		// System.out.println("Condition passed");

		// }
		// System.out.println("Expected-->" + expected + "\n" + "Actual-->" + actual +
		// "\n");
		// Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
	}

	public void getReseponseCodefrompreview() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(3000);

		// String responsoCode=baseclass.httpResponseCodeViaPost(marketoUrl);
		// System.out.println("Response Code from preview is-->\t"+responsoCode);
		// int responsoCode2=baseclass.httpResponseCodeViaPost(marketoUrl);

	}

	public void getcodeTest() {
		baseclass = new BaseClass();
		baseclass.getResponseCode();
	}

	// -----------RAQ FORM VALIDATION STARTS HERE-----------//
	public void generateReqErrorForEmail() throws InterruptedException {
		baseclass = new BaseClass();
		baseclass.ClickInEmailFieldAndLable(emailField, emaillable);
	}
	
	public void generateReqErrorForNameAndPhone() throws InterruptedException {
		baseclass = new BaseClass();
		baseclass.ClickInEmailFieldAndLable(reqfname, reqfnameLable);
		baseclass.ClickInEmailFieldAndLable(reqlname, reqlnameLable);
		baseclass.ClickInEmailFieldAndLable(reqphone, reqphoneLable);
	}
	
	public void generateReqErrorForCompanyAndNOE() throws InterruptedException {
		baseclass = new BaseClass();
		baseclass.ClickInEmailFieldAndLable(reqcompany, reqcompanyLable);
		Thread.sleep(2000);
		baseclass.ClickInEmailFieldAndLable(reqNoOfEmployees, reqNoOfEmployeesLable);
		//baseclass.ClickInEmailFieldAndLable(reqphone, reqphoneLable);
	}

	public void errorPresenceForEmail() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(2000);
		baseclass.dispalyError(emailrequiredError);
	}
	
	public void errorPresenceForSecondStepper() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(2000);
		baseclass.dispalyError(reqfnameReqError);
		Thread.sleep(2000);
		baseclass.dispalyError(reqlnameReqError);
		Thread.sleep(2000);
		baseclass.dispalyError(reqphoneReqError);
		
	}
	
	public void errorPresenceForThirdStepper() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(2000);
		baseclass.dispalyError(reqComReqError);
		Thread.sleep(2000);
		baseclass.dispalyError(reqNOEReqError);
		//Thread.sleep(2000);
		//baseclass.dispalyError(reqphoneReqError);
		
	}
	

	public void clickonNextButtonReqError() throws InterruptedException {
		baseclass = new BaseClass();
		baseclass.clickonButton(reqNextButton);
	}

	public void enterBusinessEmailInField() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(2000);
		reqEmail.sendKeys(Keys.CONTROL + "a");
		emaillable.click();
		Thread.sleep(2000);
		baseclass.fillBusinessemailfield(reqEmail);
		Thread.sleep(2000);
		System.out.println("-----STATUS of Next button On second Steper-----" + reqNextButton.isEnabled());
		if (baseclass.nextButtonStatus(reqNextButton)) {
			Assert.assertEquals(true, true);
		} 
//		else {
//			System.out.println("-----STATUS of Next button-----" + reqNextButton.isEnabled());
//		}
	}

	public void enterPersonelEmailInField() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(2000);
		reqEmail.sendKeys(Keys.CONTROL + "a");
		emaillable.click();
		Thread.sleep(2000);
		baseclass.fillemailfield(reqEmail);
		Thread.sleep(2000);

		if (baseclass.nextButtonStatus(reqNextButton)) {
			Assert.assertEquals(true, true);
		} else {
			System.out.println("-----STATUS of Next button-----" + reqNextButton.isEnabled());
		}
	}

	public void getfirstNextbuttonstatus() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(2000);
		baseclass.nextButtonStatus(reqNextButton);
		//System.out.println("Submit button Status at Third Steper on Navigation-->"+reqNextButton.isEnabled());
		//Assert.assertEquals(false, reqNextButton.isEnabled());
	}
	
	public void getsecondNextbuttonstatus() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(2000);
		baseclass.nextButtonStatus(reqSecondNextButton);
		//Assert.assertEquals(false, reqSecondNextButton.isEnabled());
	}
	
	public void getSubmitbuttonStatusOnThirdSteper() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(2000);
		baseclass.nextButtonStatus(reqsubmitButton);
		Assert.assertEquals(false, reqsubmitButton.isEnabled());
		//System.out.println("Submit button Status at Third Steper on Navigation-->"+reqsubmitButton.isEnabled());
		
	}

	public void fillemailWithinvalidData() {
		baseclass = new BaseClass();
		baseclass.fillGeneralTextField(reqEmail);
	}
	public void fillemailWithBlankSpace() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(2000);
		//baseclass.clearField(emailField);
		reqEmail.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);
		baseclass.ClickOnLable(emaillable);
		Thread.sleep(2000);
		baseclass.fillemailfieldWithBlankSpace(reqEmail);
		Thread.sleep(2000);
		baseclass.ClickOnLable(emaillable);
		Thread.sleep(2000);
		if (baseclass.dispalyError(emailrequiredError)) {
			Assert.assertEquals(true, true);
		} else {
			System.out.println("-----Error message not dispalyed-----");
		}
	}
	
	public void fillFirstAndLastNameWithBlankSpace() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(1000);
		reqfname.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
		reqlname.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
		reqphone.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
		Thread.sleep(2000);
		baseclass.fillemailfieldWithBlankSpace(reqfname);
		baseclass.fillemailfieldWithBlankSpace(reqlname);
		baseclass.fillemailfieldWithBlankSpace(reqphone);
		Thread.sleep(2000);
		baseclass.clickonButton(reqSecondNextButton);
		Thread.sleep(2000);
		if (baseclass.dispalyError(reqfnameReqError) && baseclass.dispalyError(reqlnameReqError) && baseclass.dispalyError(reqphoneReqError)) {
			System.out.println("All the required error messages are displaying with Blank spaces");
			//Assert.assertEquals(true, true);
		} else {
			System.out.println("-----Req Error message not dispalyed fpor Blank Spaces-----");
		}
	}
	
	
	public void fillFieldsWithSpecialCharacters() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(1000);
		baseclass.fillFirstAndLastNameWithSpecialCharacters(reqfname, reqlname, reqphone);
		Thread.sleep(2000);
		baseclass.clickonButton(reqSecondNextButton);
		Thread.sleep(2000);
	}
	
	public void fillCompanyAndNOEWithSpecialCharacters() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(1000);
		baseclass.fillCompanyAndNOEWithSpecialCharacters(reqcompany, reqNoOfEmployees);
		Thread.sleep(2000);
		baseclass.clickonButton(reqsubmitButton);
		Thread.sleep(2000);
		if (baseclass.dispalyError(reqNOEReqError)) {
			System.out.println("Special Characters not Allowed message displaying");
			Assert.assertEquals(baseclass.dispalyError(reqNOEReqError), true);
		} else {
			System.out.println("-----Number of Employees Error messages Displaying-----");
		}
	}
	
	public void fillCompanyAndNOEWithNumericCharacters() throws InterruptedException {
		baseclass = new BaseClass();
		//Thread.sleep(1000);
		Thread.sleep(2000);
		reqcompany.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
		reqNoOfEmployees.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
		Thread.sleep(2000);
		baseclass.fillCompanyAndNOEWithNumericCharacters(reqcompany, reqNoOfEmployees);
		Thread.sleep(2000);
		baseclass.clickonButton(reqsubmitButton);
		Thread.sleep(2000);
		
		if (baseclass.dispalyError(reqNOEReqError)) {
			System.out.println("Special Characters not Allowed message displaying");
			Assert.assertEquals(baseclass.dispalyError(reqNOEReqError), true);
		} else {
			System.out.println("-----Number of Employees Error messages Displaying-----");
		}
		
	}
	
	
	public void fillFirstAndLastNameWithNumericCharacters() throws InterruptedException {
		baseclass = new BaseClass();
		
		//Thread.sleep(2000);
		reqfname.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
		reqlname.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
		Thread.sleep(2000);
		baseclass.fillFieldsWithNumericCharacters(reqfname, reqlname, reqphone);
		Thread.sleep(2000);
		baseclass.clickonButton(reqSecondNextButton);
		Thread.sleep(2000);
	}
	
	public void fillFieldsWithEmojis() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(1000);
		reqfname.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
		reqlname.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
		reqphone.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
		Thread.sleep(2000);
		baseclass.fillFieldsWithEmojis(reqfname, reqlname, reqphone);
		//Thread.sleep(2000);
		//baseclass.fillphoneField(reqphone);
		Thread.sleep(2000);
		baseclass.clickonButton(reqSecondNextButton);
		Thread.sleep(2000);
//		if (baseclass.dispalyError(reqSpecialChNotAllowedErrorfName) && baseclass.dispalyError(reqSpecialChNotAllowedErrorfName)) {
//			System.out.println("Special Characters not Allowed message displaying");
//			//Assert.assertEquals(true, true);
//		} else {
//			System.out.println("-----Special Characters not Allowed message displaying-----");
//		}
	}
	
	
	public void fillCompanyAndNOEFieldsWithEmojis() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(1000);
		reqcompany.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
		reqNoOfEmployees.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
		Thread.sleep(2000);
		baseclass.fillCompanyAndNOEWithEmojis(reqcompany, reqNoOfEmployees);
		//Thread.sleep(2000);
		//baseclass.fillphoneField(reqphone);
		Thread.sleep(2000);
		baseclass.clickonButton(reqsubmitButton);
		Thread.sleep(2000);
		if (baseclass.dispalyError(reqNOEReqError)) {
			System.out.println("NOE Required error for emojis is displaying");
			Assert.assertEquals(baseclass.dispalyError(reqNOEReqError), true);
		} else {
			System.out.println("-----Special Characters not Allowed message displaying-----");
		}
	}
	
	
	public void fillFieldsWithEmojisAndValidPhone() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(1000);
		reqfname.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
		reqlname.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
		reqphone.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
		Thread.sleep(2000);
		baseclass.fillFieldsWithEmojisAndValidPhone(reqfname, reqlname);
		Thread.sleep(2000);
		baseclass.fillphoneField(reqphone);
		Thread.sleep(2000);
		baseclass.clickonButton(reqSecondNextButton);
		Thread.sleep(2000);
		
		if (baseclass.dispalyError(reqSpecialChNotAllowedErrorfName) && baseclass.dispalyError(reqSpecialChNotAllowedErrorfName)) {
			System.out.println("Special Characters not Allowed message displaying");
			Assert.assertEquals(baseclass.dispalyError(reqSpecialChNotAllowedErrorfName), true);
		} else {
			System.out.println("-----Special Characters not Allowed message displaying-----");
		}
		
	}
	
	public void fillFieldsWithEmojisSpecialCharactersAndValidPhone() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(1000);
		reqfname.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
		reqlname.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
		reqphone.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
		Thread.sleep(2000);
		baseclass.fillFieldsWithEmojisSpecialCharactersAndValidPhone(reqfname, reqlname);
		Thread.sleep(2000);
		baseclass.fillphoneField(reqphone);
		Thread.sleep(2000);
		baseclass.clickonButton(reqSecondNextButton);
		Thread.sleep(2000);
		if (baseclass.dispalyError(reqSpecialChNotAllowedErrorfName) && baseclass.dispalyError(reqSpecialChNotAllowedErrorfName)) {
			System.out.println("Special Characters not Allowed message displaying");
			Assert.assertEquals(baseclass.dispalyError(reqSpecialChNotAllowedErrorfName), true);
		} else {
			System.out.println("-----Special Characters not Allowed message displaying-----");
		}
	}
	
	
	public void fillComAndNOEWithEmojisSpecialCharacters() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(1000);
		reqcompany.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
		reqNoOfEmployees.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
		//reqphone.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
		Thread.sleep(2000);
		baseclass.fillFieldsWithEmojisSpecialCharactersAndValidPhone(reqcompany, reqNoOfEmployees);
		Thread.sleep(2000);
		baseclass.clickonButton(reqsubmitButton);
		Thread.sleep(2000);
		if (baseclass.dispalyError(reqNOEReqError)) {
			System.out.println("Company And NOE With Emojis And Special Characters");
			Assert.assertEquals(baseclass.dispalyError(reqNOEReqError), true);
		} else {
			System.out.println("-----Special Characters not Allowed message displaying-----");
		}
	}
	
	//--------
	public void fillComWithEmojisSpecialCharactersWithAllOtherValidData() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(1000);
		//reqcompany.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
		reqNoOfEmployees.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
		//reqphone.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
		Thread.sleep(2000);
		reqNoOfEmployees.sendKeys("1234");
		//baseclass.fillCompanyWithEmojisSpecialCharactersAndOtherValidData(reqcompany, reqNoOfEmployees);
		selectReqCountry_Canada();
		Thread.sleep(2000);
		selectInterest();
		Thread.sleep(2000);
		baseclass.clickonButton(reqsubmitButton);
		Thread.sleep(2000);
		if (baseclass.dispalyError(reqCompanySpecialCharacterError)) {
			System.out.println("Company Special Character Message Displayed---");
			Assert.assertEquals(baseclass.dispalyError(reqCompanySpecialCharacterError), true);
		} else {
			System.out.println("-----Special Characters not Allowed message displaying-----");
		}
		Thread.sleep(3000);
		reqcompany.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
	}
	
	
	
	
	
	public void navigateToThirdSteper() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(1000);
		reqfname.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
		reqlname.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
		reqphone.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
		Thread.sleep(2000);
		baseclass.navigateToThirdSteper(reqfname, reqlname,reqphone);
		Thread.sleep(2000);
		baseclass.clickonButton(reqSecondNextButton);
		Thread.sleep(2000);
	}
	
	public void fillComAndNOEWithSpaces() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(2000);
		baseclass.fillemailfieldWithBlankSpace(reqcompany);
		baseclass.fillemailfieldWithBlankSpace(reqNoOfEmployees);
		baseclass.clickonButton(reqsubmitButton);
		Thread.sleep(2000);
		if (baseclass.dispalyError(reqComReqError) && baseclass.dispalyError(reqNOEReqError)) {
			System.out.println("All the required error messages are displaying with Blank spaces");
			Assert.assertEquals(baseclass.dispalyError(reqComReqError), true);
		} else {
			System.out.println("-----Req Error message not dispalyed fpor Blank Spaces-----");
		}
	}
	

	public void fillemailWithBlockDomains1() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(2000);
		reqEmail.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);
		reqEmail.sendKeys(Keys.BACK_SPACE);
		//baseclass.ClickInEmailLable(emaillable);
		Thread.sleep(2000);
		baseclass.fillBlcokedEmail1(reqEmail);
		Thread.sleep(2000);
		baseclass.clickonButton(reqNextButton);
		//baseclass.ClickInEmailLable(emaillable);
		Thread.sleep(2000);
		if (baseclass.dispalyError(blockEmailError)) {
		//System.out.println("Status--->"+baseclass.dispalyError(blockEmailError));
			Assert.assertEquals(baseclass.dispalyError(blockEmailError), true);
			System.out.println("Testcase is passed--->");
		} 		
	}
	
	public void fillemailWithBlockDomains2() throws InterruptedException {
		baseclass=new BaseClass();
		Thread.sleep(2000);
		reqEmail.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);
		reqEmail.sendKeys(Keys.BACK_SPACE);

		//baseclass.ClickInEmailLable(emaillable);
		Thread.sleep(4000);
		baseclass.fillBlcokedEmail2(reqEmail);
		Thread.sleep(4000);
		baseclass.clickonButton(reqNextButton);
		//baseclass.ClickInEmailLable(emaillable);
		Thread.sleep(4000);
		//baseclass.findElementWithRetry(blockEmailError, 10, 5000);
		if (baseclass.dispalyError(blockEmailError2)) {
			System.out.println("Status--->"+baseclass.dispalyError(blockEmailError));
			Assert.assertEquals(baseclass.dispalyError(blockEmailError2), true);
			System.out.println("Testcase is passed--->");
		}

		
	}
public void FillCompanyAndPI() throws InterruptedException {
	BaseClass baseClass=new BaseClass();
	reqcompany.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
	reqNoOfEmployees.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
	Thread.sleep(2000);
	baseClass.fillCompnayAndNOE(reqcompany, reqNoOfEmployees);
}
	public void getCountryCount() throws InterruptedException {
		BaseClass baseClass=new BaseClass();
		reqCountries.click();
		
		List<WebElement> list=reqCountries.findElements(By.xpath("//div[@class='dropdown-content']/child::a[1]/following-sibling::a"));
		if(list.size()==232) {
			System.out.println("No of Countries are---->"+list.size());
			Assert.assertEquals(list.size(), 232);	
		}
		
		System.out.println("No Of Countries-->"+list.size());
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
		}
		baseClass.ClickOnLable(reqNoOfEmployeesLable);
		

	}
	
	public void getStateCount() throws InterruptedException {
		BaseClass baseClass=new BaseClass();
		reqState.click();
		
		List<WebElement> list=reqState.findElements(By.xpath("//div[@class='dropdown-content']/child::a[1]/following-sibling::a"));
		System.out.println("No Of States-->"+list.size());
		if(list.size()==50) {
			Assert.assertEquals(list.size(), 50);	
		}
		for (WebElement webElement : list) {
			System.out.println("Total States Are Displaying-->"+webElement.getText());
		}
		baseClass.ClickOnLable(reqNoOfEmployeesLable);
	}
	
	public void getPICount() throws InterruptedException {
		BaseClass baseClass=new BaseClass();
		reqPrimaryInterest.click();
		
		List<WebElement> list=reqPrimaryInterest.findElements(By.xpath("//div[@class='dropdown-content']/child::a[1]/following-sibling::a"));
		if(list.size()==5) {
			System.out.println("No of Primary Interest are---->"+list.size());
			Assert.assertEquals(list.size(), 5);	
		}
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
		}
		baseClass.ClickOnLable(reqStateLable);
	}

	public void submitreqForm() throws InterruptedException {
		baseclass=new BaseClass();
		Thread.sleep(4000);
		baseclass.clickonButton(reqsubmitButton);
	}
	
}
