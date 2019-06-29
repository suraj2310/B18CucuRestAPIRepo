package com.basic;



import org.junit.Test;
import org.testng.Assert;  
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestingGoogle {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response se=RestAssured.given().get("https://www.google.com");
		
		int status=se.statusCode();
		System.out.println("status code: "+status);
	}
*/		@Test
		public void method1()
		{
			Response rs=RestAssured .given().get("https://www.google.comsss");
			int status1=rs.statusCode();
			System.out.println("Status code"+status1) ;
			Assert.assertEquals(status1, 200);
		}
		

	

}
