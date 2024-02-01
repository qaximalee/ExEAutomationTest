package Utilities;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Optional;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Req.REQPOM;
import formPOM.FormPOM;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;


public class BaseClass {

	public static WebDriver driver;
	//public static ChromeDriver driver;

	public REQPOM reqPOM;


	public FormPOM form;
	public static Actions action;
	
	
	

	public void waitforElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
	}

	public void clickonButton(WebElement element) {
		try {
			Thread.sleep(2000);
			element.click();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
		}
	}

	public void performMouseActionIfElementNotClickable(WebElement element) throws InterruptedException {
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(element).click().perform();

	}

	public boolean retryingFindClick(By by) {
        boolean result = false;
        int attempts = 0;
        while(attempts < 2) {
            try {
                driver.findElement(by).click();
                result = true;
                break;
            } catch(NoSuchElementException e) {
            }
            attempts++;
        }
        return result;
}
	
	
	public void scroll(WebElement element) throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		System.out.println("Scroll from Base class Called---" + element.getText().toString());
	}

	public void selectFromList(WebElement country_region, WebElement countryItem) throws InterruptedException {
		action = new Actions(driver);
		Thread.sleep(3000);
		System.out.println("Hello from select list method");
		// action.moveToElement(country_region).click().build().perform();
		country_region.click();
		Thread.sleep(2000);
		action.moveToElement(countryItem).click().build().perform();
		// countryItem.click();
	}

	public void clearOneFiled(WebElement first) throws InterruptedException {
		first.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		first.sendKeys(Keys.DELETE);
	}

	public void clearTwoFiled(WebElement first, WebElement second) throws InterruptedException {
		first.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		first.sendKeys(Keys.DELETE);
		second.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		second.sendKeys(Keys.DELETE);
	}

	public void clearThreeFiled(WebElement first, WebElement second, WebElement third) throws InterruptedException {
		first.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);
		first.sendKeys(Keys.DELETE);
		second.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		second.sendKeys(Keys.DELETE);
		third.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		third.sendKeys(Keys.DELETE);
	}

	public void clearFourFiled(WebElement first, WebElement second, WebElement third, WebElement fourth)
			throws InterruptedException {
		first.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		first.sendKeys(Keys.DELETE);
		second.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		second.sendKeys(Keys.DELETE);
		third.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		third.sendKeys(Keys.DELETE);
		fourth.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		fourth.sendKeys(Keys.DELETE);
	}

	public void clearsixFiled(WebElement first, WebElement second, WebElement third, WebElement fourth,
			WebElement fifth, WebElement sixth) throws InterruptedException {
		first.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		first.sendKeys(Keys.DELETE);
		second.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		second.sendKeys(Keys.DELETE);
		third.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		third.sendKeys(Keys.DELETE);
		fourth.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		fourth.sendKeys(Keys.DELETE);
		fifth.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		fifth.sendKeys(Keys.DELETE);
		sixth.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		sixth.sendKeys(Keys.DELETE);
	}

	public static void clearSevenFiled(WebElement first, WebElement second, WebElement third, WebElement fourth,
			WebElement fifth, WebElement sixth, WebElement seventh) throws InterruptedException {
		first.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		first.sendKeys(Keys.DELETE);
		second.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		second.sendKeys(Keys.DELETE);
		third.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		third.sendKeys(Keys.DELETE);
		fourth.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		fourth.sendKeys(Keys.DELETE);
		fifth.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		fifth.sendKeys(Keys.DELETE);
		sixth.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		sixth.sendKeys(Keys.DELETE);
		seventh.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		seventh.sendKeys(Keys.DELETE);
	}

	public static void clearEightFiled(WebElement first, WebElement second, WebElement third, WebElement fourth,
			WebElement fifth, WebElement sixth, WebElement seventh, WebElement eight) throws InterruptedException {
		first.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		first.sendKeys(Keys.DELETE);
		second.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		second.sendKeys(Keys.DELETE);
		third.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		third.sendKeys(Keys.DELETE);
		fourth.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		fourth.sendKeys(Keys.DELETE);
		fifth.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		fifth.sendKeys(Keys.DELETE);
		sixth.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		sixth.sendKeys(Keys.DELETE);
		seventh.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		seventh.sendKeys(Keys.DELETE);
		eight.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		eight.sendKeys(Keys.DELETE);
	}

	public void clearFiveFiled(WebElement first, WebElement second, WebElement third, WebElement fourth,
			WebElement fifth) throws InterruptedException {
		first.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		first.sendKeys(Keys.DELETE);
		second.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		second.sendKeys(Keys.DELETE);
		third.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		third.sendKeys(Keys.DELETE);
		fourth.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		fourth.sendKeys(Keys.DELETE);
		fifth.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		fifth.sendKeys(Keys.DELETE);
	}

	public void selectInterest(WebElement interest, WebElement interestItem) throws InterruptedException {
		Thread.sleep(5000);
		interest.click();
		Thread.sleep(5000);
		try {
			interestItem.click();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", interestItem);
		}

	}

	public static void elementVissiblity(WebElement element) throws InterruptedException {
		Thread.sleep(6000);
		try {
			element.click();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
		}

	}

	public static void clickonbutton(WebElement element) throws InterruptedException {

		try {
			element.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
		}
	}

	public void fillFirstAndLastName(WebElement element1, WebElement element2) throws InterruptedException {
		Thread.sleep(3000);
		element1.sendKeys("First");
		element2.sendKeys("User");
	}
	
	public void fillCompnayAndNOE(WebElement element1, WebElement element2) throws InterruptedException {
		Thread.sleep(3000);
		element1.sendKeys("8x8");
		element2.sendKeys("5000");
	}
	public int countDropDownValues(WebElement element1) {
		Select select=new Select(element1);
		List<WebElement> options=select.getOptions();
		int count=options.size();
		return count;
		
	}
	public void fillemailfield(WebElement element1) {
		element1.sendKeys("test@Vinncorp.com");
	}
		
	public void fillFullField(WebElement element1) {
		element1.sendKeys("Full" +" " +"Name");
	}
	
	public void fillphoneField(WebElement element1) {
		element1.sendKeys("0333-3333333");
	}
	
	public void fillcompanyField(WebElement element1) {
		element1.sendKeys("htt://www.google.com");
	}
	
	public void fillGeneralTextField(WebElement element1) {
		element1.sendKeys("Anything else that can help us prepare for the call?");
	}
	
	public void fillNumberOfEmployees(WebElement element1) {
		element1.sendKeys("500");
	}
	
	public void fillLastNameNamefield(WebElement Firstname) {
		Firstname.sendKeys("");
	}
	
	public static void teardowon() {
		driver.close();
	}

	public void FillFirstLastNameForm(WebElement fname, WebElement lname, WebElement email, WebElement phonenumber,
			WebElement companyName, WebElement no_of_employees) throws InterruptedException {
		fname.sendKeys("Fist name");
		lname.sendKeys("Last name");
		email.sendKeys("test@vinncorp.com");
		phonenumber.sendKeys("123456789");
		companyName.sendKeys("google");
		no_of_employees.sendKeys("123");

	}

	public void FillFirstLastNameWithoutPhoneForm(WebElement fname, WebElement lname, WebElement email,
			WebElement companyName, WebElement no_of_employees) throws InterruptedException {
		fname.sendKeys("Fist name");
		lname.sendKeys("Last name");
		email.sendKeys("test@vinncorp.com");
		// phonenumber.sendKeys("123456789");
		companyName.sendKeys("google");
		no_of_employees.sendKeys("123");

	}

	public void FillFirstAndLastNameForm16_1(WebElement full_and_lastname, WebElement email,
			WebElement contact_phone_number, WebElement legal_company_name, WebElement doing_business_as) {
		//full_and_lastname.sendKeys("Full and name Name");
		//email.sendKeys("test@vinncorp.com");
		//contact_phone_number.sendKeys("123456789");
		legal_company_name.sendKeys("google");
		doing_business_as.sendKeys("Trader");
	}

	public void FillFirstAndLastNameForm16_2(WebElement street_address, WebElement city, WebElement zip_code,
			WebElement employee_number) {
		street_address.sendKeys("Address for Tetsing purpose");
		city.sendKeys("California");
		zip_code.sendKeys("1234523");
		employee_number.sendKeys("123-ABC");

	}

	public void FillFirstAndLastNameForm16_3(WebElement stock_symbol, WebElement stock_exchange, WebElement website,
		WebElement active_number) throws InterruptedException {
		stock_symbol.sendKeys("Permenent");
		stock_exchange.sendKeys("Stock Exchange");
		website.sendKeys("http://www.google.com");
		active_number.sendKeys("123456789");
	}

	public void FillFullNameForm(WebElement fullname, WebElement email, WebElement phone, WebElement company,
			WebElement no_of_employees) throws InterruptedException {
		fullname.sendKeys("Full name");
		// lname.sendKeys("Last name");
		email.sendKeys("test@vinncorp.com");
		phone.sendKeys("123456789");
		company.sendKeys("google");
		no_of_employees.sendKeys("123");

	}

	public static void FillFullNamewithCountryForm(WebElement fullname, WebElement email, WebElement phone,
			WebElement company, WebElement no_of_employees) throws InterruptedException {
		fullname.sendKeys("Full name");
		// lname.sendKeys("Last name");
		email.sendKeys("test@vinncorp.com");
		phone.sendKeys("123456789");
		company.sendKeys("google");
		no_of_employees.sendKeys("123");

	}
	

	public void FillFullNamewithfourfieldForm(WebElement fullname, WebElement email, WebElement company,
			WebElement no_of_employees) throws InterruptedException {
		fullname.sendKeys("Full name");
		email.sendKeys("test@vinncorp.com");
		company.sendKeys("google");
		no_of_employees.sendKeys("123");

	}

	public void FillFullNameWithThreefieldAndCountryForm(WebElement fullname, WebElement email, WebElement company)
			throws InterruptedException {
		fullname.sendKeys("Full name");
		email.sendKeys("test@vinncorp.com");
		company.sendKeys("google");
		// no_of_employees.sendKeys("123");

	}

	public void FillEmailAndCountryRegionForm(WebElement email) throws InterruptedException {
		email.sendKeys("test@vinncorp.com");
	}
	

	public static void selectDate(WebElement date) throws InterruptedException {

		Actions action = new Actions(driver);
		action.moveToElement(date).click().perform();
		Thread.sleep(3000);
		System.out.println("Hello From select Date time method");
	}
	
	public void getResponseCode() {
		try {
            // establish, open connection with URL
            HttpURLConnection cn = (HttpURLConnection) new URL(driver.getCurrentUrl()).openConnection();
            // set HEADER request
            cn.setRequestMethod("POST");
            // connection initiate
            cn.connect();
            //get response code
            int res = cn.getResponseCode();
            if(res==200) {
            	System.out.println("PASSED");
            }
            else {
				System.out.println("FAILED");
			}
            //Display
            //System.out.println("Http response code: " + res);
            System.out.println("Http response code: " + cn.getResponseMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	// Validation methods starts
	public void ClickInEmailFieldAndLable(WebElement field, WebElement label) throws InterruptedException {
		 field.click();
		 Thread.sleep(2000);
		 label.click();
		 Thread.sleep(2000);
		 
	 }
	
	public void ClickOnLable(WebElement label) throws InterruptedException {
		 label.click();
		 Thread.sleep(2000);
		 
	 }
	 public boolean dispalyError(WebElement requiredError) {
		 boolean dispaly=requiredError.isDisplayed();
		 return dispaly;
	 }
	 
		public void fillBusinessemailfield(WebElement element1) {
			element1.sendKeys("test123@pof.gov.pk");
		}
		
		public void fillBlcokedEmail1(WebElement element1) {
			element1.sendKeys("test123@foxmail.com");
		}
		
		public void fillBlcokedEmail2(WebElement element1) {
			element1.sendKeys("test123@qq.com");
		}
		
		public boolean nextButtonStatus(WebElement button) {
			boolean status=button.isEnabled();
			//System.out.println("Button value is-->"+status);
			return status;
		}
		
		public void fillFirstAndLastNameWithSpecialCharacters(WebElement element1, WebElement element2, WebElement element3) throws InterruptedException {
			Thread.sleep(2000);
			element1.sendKeys("!@#$%^~");
			element2.sendKeys("!@#$%^~");
			element3.sendKeys("!@#$%^~");
			Thread.sleep(2000);
		}
		
		public void clearField(WebElement field) throws InterruptedException {
			Thread.sleep(2000);
			field.sendKeys(Keys.DELETE);
			Thread.sleep(2000);
			//Thread.sleep(2000);
			//label.sendKeys(Keys.CONTROL + "a");
			//Thread.sleep(2000);
//			if (field.getAttribute("value").isEmpty()) {
//				System.out.println("Field cleared--->");
//				//Assert.assertThat("Field should be empty", field.getAttribute("value"), isEmptyString());
//
//			}
		}
		
		public void fillFieldsWithNumericCharacters(WebElement element1, WebElement element2, WebElement element3) throws InterruptedException {
			Thread.sleep(2000);
			element1.sendKeys("TEST123_$@");
			element2.sendKeys("TEST123_$@");
			element3.sendKeys("TEST123_$@");
			Thread.sleep(2000);
		}
		
		public void fillCompanyAndNOEWithSpecialCharacters(WebElement element1, WebElement element2) throws InterruptedException {
			Thread.sleep(2000);
			element1.sendKeys("!#%!#%!@#");
			element2.sendKeys("!#$%!#$%");
			Thread.sleep(2000);
		}
		
		public void fillCompanyAndNOEWithNumericCharacters(WebElement element1, WebElement element2) throws InterruptedException {
			Thread.sleep(2000);
			element1.sendKeys("TEST123_$@");
			element2.sendKeys("TEST123_$@");
			Thread.sleep(2000);
		}
		
		public void fillFieldsWithEmojis(WebElement element1, WebElement element2, WebElement element3) throws InterruptedException {
			Thread.sleep(3000);
			String fname="⚪📢😆";
			String lname="😉😀😄😁";
			String phone= fname +""+lname;
			//System.out.println("First Name-->\t"+element1+"\t Last Name"+element2+"\t Phone"+element3);
			Thread.sleep(2000);
			element1.sendKeys(fname);
			element2.sendKeys(lname);
			element3.sendKeys(phone);
			Thread.sleep(2000);
		}
		
		public void fillCompanyAndNOEWithEmojis(WebElement element1, WebElement element2) throws InterruptedException {
			Thread.sleep(3000);
			String fname="⚪📢😆";
			String lname="😉😀😄😁";
			//System.out.println("First Name-->\t"+element1+"\t Last Name"+element2+"\t Phone"+element3);
			Thread.sleep(2000);
			element1.sendKeys(fname);
			element2.sendKeys(lname);
			Thread.sleep(2000);
		}
		
		
		
		
		public void fillFieldsWithEmojisAndValidPhone(WebElement element1, WebElement element2) throws InterruptedException {
			Thread.sleep(3000);
			String fname="⚪📢😆";
			String lname="😉😀😄😁";
			//System.out.println("First Name-->\t"+element1+"\t Last Name"+element2+"\t Phone"+element3);
			Thread.sleep(2000);
			element1.sendKeys(fname);
			element2.sendKeys(lname);
			Thread.sleep(2000);
		}
		
		public void fillFieldsWithEmojisSpecialCharactersAndValidPhone(WebElement element1, WebElement element2) throws InterruptedException {
			Thread.sleep(3000);
			String fname="!@#$⚪📢😆!@#$";
			String lname="!@#$😉😀😄😁!@#";
			//System.out.println("First Name-->\t"+element1+"\t Last Name"+element2+"\t Phone"+element3);
			Thread.sleep(2000);
			element1.sendKeys(fname);
			element2.sendKeys(lname);
			Thread.sleep(2000);
		}
		
		public void fillCompanyWithEmojisSpecialCharactersAndOtherValidData(WebElement element1, WebElement element2) throws InterruptedException {
			Thread.sleep(3000);
			element1.sendKeys("@#$⚪📢😆!@#$");
			element2.sendKeys("03333333333");
			Thread.sleep(2000);
		}
		
		
		public void navigateToThirdSteper(WebElement element1, WebElement element2, WebElement element3) throws InterruptedException {
			Thread.sleep(3000);
			String fname="First Name";
			String lname="Last Name";
			String phone= "03333333333";
			//System.out.println("First Name-->\t"+element1+"\t Last Name"+element2+"\t Phone"+element3);
			Thread.sleep(2000);
			element1.sendKeys(fname);
			element2.sendKeys(lname);
			element3.sendKeys(phone);
			Thread.sleep(2000);
		}
		
		
		
		public void fillemailfieldWithBlankSpace(WebElement element1) {
			element1.sendKeys(Keys.BACK_SPACE +" "+Keys.BACK_SPACE);
		}
		public WebElement findElementWithRetry(WebElement locator, int maxAttempts, int delayInSeconds) throws InterruptedException {
		    int attempts = 0;
		    while (attempts < maxAttempts) {
		    	System.out.println("In While Loop");
		        try {
		            return locator;
		        } catch (StaleElementReferenceException e) {
		            // Handle exception or just log it
		        }
		        attempts++;
		        System.out.println("Attempt No:--->"+attempts);
		        Thread.sleep(delayInSeconds); // You may need to implement a sleep method
		    }
		    throw new NoSuchElementException("Element not found even after " + maxAttempts + " attempts");
		}

	 // End Of validation Methods
	

}
