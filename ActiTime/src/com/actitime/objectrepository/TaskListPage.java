package com.actitime.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskListPage {

	@FindBy(xpath="//div[.='Add New']")
	private WebElement AddNewBtn;

	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement NewCustomerOption;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement EnterCustomertbx;
	
	@FindBy(xpath="(//textarea[@placeholder='Enter Customer Description']")
	private WebElement EnterCustomerDescription;
	
	public TaskListPage(WebDriver driver) {
		
	}

	public WebElement getAddNewBtn() {
		return AddNewBtn;
	}

	public WebElement getNewCustomerOption() {
		return NewCustomerOption;
	}

	public WebElement getEnterCustomertbx() {
		return EnterCustomertbx;
	}

	public WebElement getEnterCustomerDescription() {
		return EnterCustomerDescription;
	}

	

	public WebElement getEnterCustomer() {
		return EnterCustomer;
	}

	@FindBy(xpath="(//div[.='- Select Customer -'])[2]")
	private WebElement EnterCustomer ;
	
	@FindBy(xpath="(//div[.='Our Company'])[3]")
	private WebElement EnterCustomerDesc ;

	public WebElement getEnterCustomerDesc() {
		return EnterCustomerDesc;
	}
	


}
