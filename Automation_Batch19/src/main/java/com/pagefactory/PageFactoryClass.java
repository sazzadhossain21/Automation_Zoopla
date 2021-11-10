package com.pagefactory;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.SuperLogin;

public class PageFactoryClass {
public WebDriver driver;
	public PageFactoryClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='Sign in'])[2]")
	private WebElement signinbtn;

	@FindBy(xpath = "//*[@id='input-email-address']")
	private WebElement username;

	@FindBy(xpath = "//*[@id='input-password']")
	private WebElement pwd;
	@FindBy(xpath = "//*[@data-testid='signin-button']")
	private WebElement lstsigninbtn;
	@FindBy(xpath = "//a[@class='myaccount-email']")
	private WebElement verifyname;

	public WebElement getSigninbtn() {
		signinbtn.click();
		return signinbtn;
	}

	public WebElement getusername(String email) {
		username.sendKeys(email);
		return username;
	}

	public WebElement getPwd(String password) {
		pwd.sendKeys(password);
		return pwd;
	}

	public WebElement getLstsigninbtn() {
		lstsigninbtn.click();
		return lstsigninbtn;
	}

	public WebElement getVerifyname() {
		verifyname.getText();
		System.out.println(verifyname);
		return verifyname;
	}
	

}
