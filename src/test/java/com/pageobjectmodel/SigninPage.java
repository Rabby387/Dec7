package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage{
	
	public WebDriver driver;

       public SigninPage(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	   
	  
	   
	  }

  @FindBy(xpath="//a[@id='nav-link-accountList']")
  public WebElement signin;
  public WebElement getsign() {
	  signin.click();
	  return signin;
	 
  }

@FindBy(xpath="//input[@id='ap_email']")
public WebElement email;
public void getemail() {
email.sendKeys("mrrabby87@gmail.com"); 

}
@FindBy(xpath="//input[@id='continue']")
public WebElement enter;
public void getenter() {
	enter.click();
}

@FindBy(xpath="//*[@id=\"ap_password\"]")
public WebElement continuebutton;
public void getcontinuebutton() {
	continuebutton.sendKeys("sharp12345");
}

@FindBy(xpath="//*[@id=\"signInSubmit\"]")
public WebElement submitbutton;
public void getsubmitbutton() {
	submitbutton.click();
}

}
