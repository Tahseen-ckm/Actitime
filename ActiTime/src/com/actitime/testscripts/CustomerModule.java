package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.FileLib;
import com.actitime.objectrepository.EnterTimeTrackPage;
import com.actitime.objectrepository.TaskListPage;

public class CustomerModule extends BaseClass {
	
@Test
public void testCreateCustomer() throws EncryptedDocumentException, IOException{
	FileLib f= new FileLib();
	String CustomerName = f.getExcelValue("CreateCustomer", 1, 1);
	String CustomerDescription = f.getExcelValue("CreateCustomer", 1, 2);
	EnterTimeTrackPage e= new EnterTimeTrackPage(driver);
	//click on task tab
	e.getTasktab().click();
	
	TaskListPage t = new TaskListPage(driver);
	//click on Add New Button
	t.getAddNewBtn().click();
	//click on Add New Customer Option
	t.getNewCustomerOption().click();
	
	t.getEnterCustomertbx().sendKeys(CustomerName);
	t.getEnterCustomerDescription().sendKeys(CustomerDescription);
	
	
	
	
	
}
	

}
