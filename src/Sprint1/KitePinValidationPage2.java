package Sprint1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinValidationPage2 
{
  @FindBy( id = "pin") private WebElement Pin;
  
  @FindBy(xpath = "//button[@class='button-orange wide']") private WebElement ContinueButton;
  
  
  public KitePinValidationPage2(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  
  public void enterPin(String pin) 
  {
	Pin.sendKeys(pin);
  }
  
  public void clickOnContinueButton() 
  {
	ContinueButton.click();
  }
}
