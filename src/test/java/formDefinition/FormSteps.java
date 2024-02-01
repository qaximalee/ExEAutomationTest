package formDefinition;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import Req.REQPOM;
import Utilities.BaseClass;
import formPOM.FormPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FormSteps extends BaseClass {

	@org.junit.Test
	@Given("Launch the browser")
	public void launch_the_browser() {

		//WebDriverManager.firefoxdriver().setup();
		//driver = new ChromeDriver();
//		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.addArguments("--headless");
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.addArguments("--headless");

		driver = new FirefoxDriver(firefoxOptions);

	}

	//-----Start of  RAQ FORM Step method Definition-------
	@When("Open URL for RAQ Form {string}")
	public void open_raq_url(String url) throws InterruptedException {
		driver.get(url);
		//System.out.println("Given URL--->" + url);
		Thread.sleep(5000);
	}
	
	@When("Click on Request a Demo button")
	public void click_on_request_a_demo_button() throws InterruptedException {
	//reqPOM=new REQPOM(driver);
		System.out.println();
		form = new FormPOM(driver);
		form.clickondemoButton();
		//form.reqCTA.click();
		Thread.sleep(2000);
	}
	
	@When("Verify next button status of first steper")
	public void verify_email_next_button_status() throws InterruptedException {
		form = new FormPOM(driver);
		form.getfirstNextbuttonstatus();
		
	}
	
	@When("Verify Required messages for email")
	public void verify_email_req_error() throws InterruptedException {
		form = new FormPOM(driver);
		form.generateReqErrorForEmail();
		form.errorPresenceForEmail();
		//form.reqCTA.click();
		Thread.sleep(2000);
	}
	
	@When("Verify error message when enter plain text and click on next button")
	public void fill_plain_text_in_email() throws InterruptedException {
		form = new FormPOM(driver);
		form.fillemailWithinvalidData();
		Thread.sleep(2000);
		form.generateReqErrorForEmail();
		Thread.sleep(2000);
		form.clickOnNextButton();
		Thread.sleep(2000);
		form.errorPresenceForEmail();
	}
	
	
	@When("Verify that next button status when user enter Business email")
	public void fill_email_with_business_email() throws InterruptedException {
		form = new FormPOM(driver);
		form.enterBusinessEmailInField();
	}
	
	@When("Verify that next button status when user enter valid Personal email")
	public void fill_email_with_personal_email() throws InterruptedException {
		form = new FormPOM(driver);
		form.enterPersonelEmailInField();
	}
	
	@When("Verify email field with single space and multiple space only")
	public void fill_email_with_Blank_Spaces() throws InterruptedException {
		form = new FormPOM(driver);
		form.fillemailWithBlankSpace();
	}
	
	@When("Verify email field with Blocked Domains like -@foxmail.com")
	public void fill_email_with_Blocked_Emails1() throws InterruptedException {
		form = new FormPOM(driver);
		form.fillemailWithBlockDomains1();
	}
	
	@When("Verify email field with Blocked Domains like -@qq.com")
	public void fill_email_with_Blocked_Emails2() throws InterruptedException {
		form = new FormPOM(driver);
		form.fillemailWithBlockDomains2();
	}
	
	@When("Navigate To Second Step for Navigation")
	public void fill_email_with_business_email_tonavigate_next_step() throws InterruptedException {
		form = new FormPOM(driver);
		form.enterBusinessEmailInField();
		form.clickOnNextButton();
		
	}
	
	@When("Verify next button status of second steper for First Name Last Name and Phone Number")
	public void verify_email_next_button_status_for_second_steper() throws InterruptedException {
		form = new FormPOM(driver);
		form.getsecondNextbuttonstatus();
		
	}
	
	@When("Verify Required messages for First Name Last Name and Phone Number")
	public void verify_name_phone_error() throws InterruptedException {
		form = new FormPOM(driver);
		form.generateReqErrorForNameAndPhone();
		Thread.sleep(2000);
		form.errorPresenceForSecondStepper();
		//form.reqCTA.click();
		Thread.sleep(2000);
	}
	@When("Verify single space and multiple space for First Name Last Name and Phone fields")
	public void fill_First_And_Last_Name_with_Blank_Spaces() throws InterruptedException {
		form = new FormPOM(driver);
		form.fillFirstAndLastNameWithBlankSpace();
	}
	
	@When("Verify First Name Last Name Phone fields with Special Characters")
	public void fill_Fields_with_Special_Characters() throws InterruptedException {
		form = new FormPOM(driver);
		form.fillFieldsWithSpecialCharacters();
	}
	
	@When("Verify First Name Last Name phone fields with Numeric Characters")
	public void fill_First_And_Last_Name_with_Numeric_Characters() throws InterruptedException {
		form = new FormPOM(driver);
		form.fillFirstAndLastNameWithNumericCharacters();
	}
	
	@When("Verify First Name Last Name Phone fields with emojis")
	public void fill_First_And_Last_phone_with_emojis() throws InterruptedException {
		form = new FormPOM(driver);
		form.fillFieldsWithEmojis();
	}
	
	@When("Verify First Name Last Name with emojis and valid phone number")
	public void fill_Emojis_with_valid_phone() throws InterruptedException {
		form = new FormPOM(driver);
		form.fillFieldsWithEmojisAndValidPhone();
	}
	
	@When("Verify First Name Last Name with emojis and Special Characters and valid phone number")
	public void fill_Emojis_with_Special_characters_valid_phone() throws InterruptedException {
		form = new FormPOM(driver);
		form.fillFieldsWithEmojisSpecialCharactersAndValidPhone();
	}
	
	@When("Navigate to third Steper")
	public void navigateToThirdSteper() throws InterruptedException {
		form = new FormPOM(driver);
		form.navigateToThirdSteper();
	}
	
	@When("Verify submit button status of Third steper With All empty Fields")
	public void verify_submit_button_status_on_third_steper() throws InterruptedException {
		form = new FormPOM(driver);
		form.getSubmitbuttonStatusOnThirdSteper();
		
	}
	
	@When("Verify single space and multiple space for Company and No: of Employees fields")
	public void fill_company_And_NOE_with_Blank_Spaces() throws InterruptedException {
		form = new FormPOM(driver);
		form.fillComAndNOEWithSpaces();
	}
	
	@When("Verify Required messages for Company and No: of Employees")
	public void verify_company_NOE_error() throws InterruptedException {
		form = new FormPOM(driver);
		form.generateReqErrorForCompanyAndNOE();
		Thread.sleep(2000);
		form.errorPresenceForThirdStepper();
		//form.reqCTA.click();
		Thread.sleep(2000);
	}
	
	
	@When("Verify Compnay and NOE with Special Characters")
	public void fill_Company_NOE_with_Special_Characters() throws InterruptedException {
		form = new FormPOM(driver);
		form.fillCompanyAndNOEWithSpecialCharacters();
	}
	@When("Verify Compnay and NOE with Numeric Characters")
	public void fill_Company_NOE_with_Numeric_Characters() throws InterruptedException {
		form = new FormPOM(driver);
		form.fillCompanyAndNOEWithNumericCharacters();
	}
	
	@When("Verify Company and NOE fields with emojis")
	public void fill_Company_And_NOE_with_emojis() throws InterruptedException {
		form = new FormPOM(driver);
		form.fillCompanyAndNOEFieldsWithEmojis();
	}
	
	@When("Verify Company and NOE with emojis and Special Characters")
	public void fill_Com_NOE_with_Emojis_And_Special_characters() throws InterruptedException {
		form = new FormPOM(driver);
		form.fillComAndNOEWithEmojisSpecialCharacters();
	}
	
	//-------
	@When("Verify Company with Special Characters and Other Form With Valid Data")
	public void fill_Com_with_Emojis_And_Special_characters_with_All_Valid_Data() throws InterruptedException {
		form = new FormPOM(driver);
		form.fillComWithEmojisSpecialCharactersWithAllOtherValidData();
		Thread.sleep(3000);
	}
	
	
	@When("Verify submit button status of Third steper For Country and Primary Interest with valid Data in Text Fields")
	public void verify_submit_button_status_on_third_steper_for_PI_Country() throws InterruptedException {
		form = new FormPOM(driver);
		form.getSubmitbuttonStatusOnThirdSteper();
		
	}
	
	@When("Verify Selection of State Dropdown when Selcet Country as United Stated")
	public void verify_dependent_dropDown() throws InterruptedException {
		form = new FormPOM(driver);
		form.FillCompanyAndPI();
		Thread.sleep(3000);
		form.selectReqCountry();
		Thread.sleep(3000);
		form.selectState();
		//Thread.sleep(3000);
		//form.scrollTilState();
		Thread.sleep(3000);
		form.selectInterest();
		//Thread.sleep(3000);
		
	}
	
	@When("Verify the Count of Country")
	public void verify_County_Count_() throws InterruptedException {
		form = new FormPOM(driver);
		form.getCountryCount();
		
	}
	
	@When("Verify the Count of State")
	public void verify_State_Count_() throws InterruptedException {
		form = new FormPOM(driver);
		form.getStateCount();
		
	}
	
	@When("Verify the Count of Primary Interest")
	public void verify_PI_Count_() throws InterruptedException {
		form = new FormPOM(driver);
		form.getPICount();		
	}
	
	@When("Submit the RAQ Form")
	public void submitReqForm() throws InterruptedException {
		form = new FormPOM(driver);
		form.submitreqForm();		
	}
	
//	@When("Verify the State DropDown should not empty")
//	public void verify_State_Count_() throws InterruptedException {
//		form = new FormPOM(driver);
//		form.getStateCount();
//		
//	}
//	@When("Verify the Primary Interest DropDowns should not empty")
//	public void verify_PI_Count_() throws InterruptedException {
//		form = new FormPOM(driver);
//		form.getPICount();
//		
//	}
	
	
	
	
//	@When("Fillout email and click On Next button")
//	public void fillout_and_click_on_next_button() throws InterruptedException {
//	//reqPOM=new REQPOM(driver);
//	form = new FormPOM(driver);
//	form.fillFirstDivAndClickOnNextButton();
//	Thread.sleep(3000);
//	}
//
//	@When("Fillout First Name, Last Name, Phone Fields and click on next button")
//	public void fillout_first_name_last_name_phone_fields_and_click_on_next_button() throws InterruptedException {
//		form = new FormPOM(driver);
//		//reqPOM=new REQPOM(driver);
//		form.fillSecondDivAndClickOnNextButton();
//		Thread.sleep(3000);
//	}
//	
//	@When("Fillout Company, Employees, Country, Interest Fields and click on Submit button")
//	public void fillout_company_employees_country_interest_fields_and_click_on_submit_button() throws InterruptedException {
//		//reqPOM=new REQPOM(driver);
//		form = new FormPOM(driver);
//		form.fillThirdDivAndClickOnSubmittButton();
//		Thread.sleep(3000);
//	}
	
	
	//------- End of RAQ Step Step Definition method
	
	
//	@When("Open URL {string}")
//	public void open_url(String url) throws InterruptedException {
//		driver.get(url);
//		System.out.println("Given URL--->" + url);
//		Thread.sleep(5000);
//	}
//
//	@When("Fill First Form")
//	public void fill_first_form() {
//
//		form = new FormPOM(driver);
//		try {
//			Thread.sleep(5000);
//			form.fillFirsNameForm();
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@When("Fill Second Form")
//	public void fill_FullName_form() {
//		
//		form = new FormPOM(driver);
//		try {
//			Thread.sleep(5000);
//			form.fillFullNameForm();
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@When("Fill Third Form")
//	public void fill_Full_Name_withcountry() {
//
//		form = new FormPOM(driver);
//		try {
//			Thread.sleep(5000);
//			form.fillFullNamewithcountryForm();
//			Thread.sleep(5000);
//			// BaseClass.selectFromList(FormPOM.time, FormPOM.timeItem);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@When("Fill Fourth Form")
//	public void fill_fourth_form() {
//
//		form = new FormPOM(driver);
//		try {
//			Thread.sleep(5000);
//			form.fillFirstNameForm4();
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@When("Fill Fifth Form")
//	public void fill_fifth_form() throws InterruptedException {
//		Thread.sleep(3000);
//		form = new FormPOM(driver);
//		try {
//			Thread.sleep(5000);
//			form.fillFullNameForm5();
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	@When("Fill Sixth Form")
//	public void fill_sixth_form() {
//
//		form = new FormPOM(driver);
//		try {
//			Thread.sleep(5000);
//			form.fillemailAndCountryForm();
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	
//	@When("Fill Seventh Form")
//	public void fill_seventh_form() {
//
//		form = new FormPOM(driver);
//		try {
//			Thread.sleep(5000);
//			form.fillFirsNameFormWithCoutryAndState();
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	@When("Fill Eight Form")
//	public void fill_eight_form() {
//
//		form = new FormPOM(driver);
//		try {
//			Thread.sleep(5000);
//			form.fillFullNameForm8();
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	@When("Fill Ninth Form")
//	public void fill_Niht_form() {
//
//		form = new FormPOM(driver);
//		try {
//			Thread.sleep(5000);
//			form.fillemailAndCountryForm();
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@When("Fill Tenth Form")
//	public void fill_Tenth_form() {
//
//		form = new FormPOM(driver);
//		try {
//			Thread.sleep(5000);
//			form.fillFirsNameForm10();
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	@When("Fill Eleventh Form")
//	public void fill_Eleventh_form() {
//
//		form = new FormPOM(driver);
//		try {
//			Thread.sleep(5000);
//			form.fillFullNameForm5();
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	@When("Fill Twelth Form")
//	public void fill_Twelth_form() {
//
//		form = new FormPOM(driver);
//		try {
//			Thread.sleep(5000);
//			form.fillFirsNameForm();
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	
//	@When("Fill Thirteenth Form")
//	public void fill_Thirteenth_form() {
//
//		form = new FormPOM(driver);
//		try {
//			Thread.sleep(5000);
//			form.fillFirsNameForm();
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	@When("Fill Fourteenth Form")
//	public void fill_Full_Name_withcountry14() {
//
//		form = new FormPOM(driver);
//		try {
//			Thread.sleep(5000);
//			form.fillFullNamewithcountryForm14();
//			Thread.sleep(5000);
//			// BaseClass.selectFromList(FormPOM.time, FormPOM.timeItem);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	
//	@When("Fill Fiftheenth Form")
//	public void fill_Full_Name_withcountry15() {
//
//		form = new FormPOM(driver);
//		try {
//			Thread.sleep(5000);
//			form.fillFullNamewithcountryForm15();
//			Thread.sleep(5000);
//			// BaseClass.selectFromList(FormPOM.time, FormPOM.timeItem);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	@When("Fill Sixteenth Form")
//	public void fill_first_and_last_name_form15() {
//
//		form = new FormPOM(driver);
//		try {
//			Thread.sleep(5000);
//			form.fillFirstAndLastNameForm15();
//			Thread.sleep(5000);
//			// BaseClass.selectFromList(FormPOM.time, FormPOM.timeItem);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	@When("Fill Seventeenth Form")
//	public void fill_first_and_last_name_form17() {
//
//		form = new FormPOM(driver);
//		try {
//			Thread.sleep(5000);
//			form.fill4TextField();
//			Thread.sleep(5000);
//			// BaseClass.selectFromList(FormPOM.time, FormPOM.timeItem);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//				
//	}
//	
//	@When("Fill Eighteenth Form")
//	public void full_name_form18() {
//
//		form = new FormPOM(driver);
//		try {
//			Thread.sleep(5000);
//			form.fill2TextField();
//			Thread.sleep(5000);
//			// BaseClass.selectFromList(FormPOM.time, FormPOM.timeItem);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	@When("Fill Ninteenth Form")
//	public void first_last_name_form19() {
//
//		form = new FormPOM(driver);
//		try {
//			Thread.sleep(5000);
//			form.fillFirstAndLastName();
//			Thread.sleep(5000);
//			// BaseClass.selectFromList(FormPOM.time, FormPOM.timeItem);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	
//	@When("Fill Twenteenth Form")
//	public void first_last_name_phone_form20() {
//
//		form = new FormPOM(driver);
//		try {
//			Thread.sleep(5000);
//			form.fillPhoneNumberAndMessage();
//			Thread.sleep(5000);
//			
//			// BaseClass.selectFromList(FormPOM.time, FormPOM.timeItem);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@When("Fill Twenty one Form")
//	public void form21() {
//
//		form = new FormPOM(driver);
//		try {
//			Thread.sleep(5000);
//			form.fillForm21();
//			Thread.sleep(5000);
//			
//			// BaseClass.selectFromList(FormPOM.time, FormPOM.timeItem);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	@When("Fill Twenty two Form")
//	public void form22() {
//
//		form = new FormPOM(driver);
//		try {Thread.sleep(5000);
//			form.emptyformsubmission();
//			Thread.sleep(5000);
//			
//			// BaseClass.selectFromList(FormPOM.time, FormPOM.timeItem);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	
//	@When("Fill Twenty three Form")
//	public void form23() {
//
//		form = new FormPOM(driver);
//		try {
//			Thread.sleep(5000);
//			form.emptyformsubmission();
//			Thread.sleep(5000);
//			
//			// BaseClass.selectFromList(FormPOM.time, FormPOM.timeItem);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//	
//
//	 
//	
//	@When("Fill Twenty four Form")
//	public void form24() {
//
//		form = new FormPOM(driver);
//		try {
//			Thread.sleep(5000);
//			form.fillForm24();
//			Thread.sleep(5000);
//			
//			// BaseClass.selectFromList(FormPOM.time, FormPOM.timeItem);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//	  
//	@When("Fill Twenty fifth Form")
//	public void form25() {
//
//		form = new FormPOM(driver);
//
//		try {
//			Thread.sleep(5000);
//			form.fillfullnamewithScrolltoCompany();
//			Thread.sleep(5000);
//			
//			// BaseClass.selectFromList(FormPOM.time, FormPOM.timeItem);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	-- -------------------------------------------------------
	// Start of Validation method
	
	
	//-------------------------------------------------------

	
	@When("Submit Form")
	public void submit_form() throws InterruptedException {
		form = new FormPOM(driver);
		form.submitform();
	}

	@When("Verify message")
	public void verify_message() throws InterruptedException {
		form = new FormPOM(driver);
		//form.verifyMessage();
		// System.out.println("Verify not implemented");

	}

	@Then("Verify Response of form code")
	public void verify_response_code() throws InterruptedException {
		form=new FormPOM(driver);
		form.getcodeTest();
		Thread.sleep(5000);
		//form.getReseponseCodefromMarketo();
		//form.getResponse();
		//form.getcode();
		//int responseCode = BaseClass.httpResponseCodeViaPost(
				//"https://deploy-preview-2552--legendary-monstera-200afd.netlify.app/.netlify/functions/post-marketo-lead");
		//System.out.println("Hello From Response Code method--->");
		//System.out.println("Form Id is-->" + FormPOM.formId.getAccessibleName());
		// BaseClass.teardowon();

	}

}
