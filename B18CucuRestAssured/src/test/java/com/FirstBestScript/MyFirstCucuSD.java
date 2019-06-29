package com.FirstBestScript;

 

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MyFirstCucuSD {
	Response rs;
	@Given("user hit the get request")
	public void user_hit_the_get_request()
	{
		rs=RestAssured .given().get("https://www.google.com");
	}
	
	@Then("^user checks the \"([^\"]*)\" status code$")
	public void user_checks_the_status_code(String abc)
	{
		//int status1=rs.statusCode();
		int statusCode=rs.getStatusCode();
		//System.out.println("Status code"+status1) ;
		Assert.assertEquals(abc, Integer.toString(statusCode));
	}

	//@Then("user click on  search")
	//public void user_click_on_search()
	//{
		//WebDriver driver=new  ChromeDriver();
		//WebElement cd=driver.findElement(By.xpath("//input[@name='q']")).click();
		//String status2=cd.getText();
		
	}
	
	
