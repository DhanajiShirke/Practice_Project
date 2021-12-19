package Sprint1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage3 
{
  @FindBy(xpath = "//span[@class='user-id']") private WebElement UserId;
  
  @FindBy(xpath = "//span[@class='icon icon-exit']") private WebElement LogoutButton;
  
  
  public KiteHomePage3(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  
  public String UserIDValidation() 
  {
	String ActualUserID = UserId.getText();
	return ActualUserID;
  }
  
  public void clickOnUserID() 
  {
	UserId.click();
  }
  
  public void clickOnLogoutButton() 
  {
	LogoutButton.click();
  }
}
