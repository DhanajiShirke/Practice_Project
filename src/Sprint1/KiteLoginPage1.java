package Sprint1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage1 
{
//Step1. Declaration of variables
  @FindBy(id = "userid") private WebElement UserID;
  
  @FindBy(id = "password") private WebElement PWD;
  
  @FindBy(xpath = "//button[@class='button-orange wide']") private WebElement LoginButton;
  
  @FindBy(xpath = "//p[@class='error text-center']") private WebElement ErrorMsg;
  
  @FindBy(xpath = "//span[text()='Password should be minimum 6 characters.']") private WebElement ErrorMsgForPWD;
  
  @FindBy(xpath = "//span[text()='User ID should be minimum 6 characters.']") private WebElement ErrorMsgForUserID;
  
//Step2. Initialize variables using Constructor-->PageFactory class and initElements static method
   public KiteLoginPage1(WebDriver driver) 
   {
	PageFactory.initElements(driver, this);
   }
   
//Step3. variable usage--> using Methods
   public void enterUserID (String Userid) 
   {
	UserID.sendKeys(Userid);
   }
   
   public void enterPassword(String Password) 
   {
	PWD.sendKeys(Password);
   }
   
   public void clickOnLoginButton()
   {
	LoginButton.click();
   }
   
   public String getErrorMsg1()
   {
	String ActualErrorMsg = ErrorMsg.getText();
	return ActualErrorMsg;
   }
   
   public String getErrorMsgforUserID() 
   {
	 String ActualErrorMsgForUserID = ErrorMsgForUserID.getText();
	return ActualErrorMsgForUserID;
   }
   
   public String getErrorMsgForPWD() 
   {
	String ActualErrorMsgForPWD = ErrorMsgForPWD.getText();
	return ActualErrorMsgForPWD;
   }
}
