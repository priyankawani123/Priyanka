package com.apache.maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exeldatadriven {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Anil\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
      //  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.manage().window().maximize();
	}

	@Test(dataProvider="loginData")
	public void loginTest(String Username,String password,String Result) 
		{
		 System.out.println(Username + password+ Result);
		}

    @DataProvider(name="loginData")
	public String[][] getdata()
	{
		String loginData[][]= {
				                  {"waniriyanka@05gmail.com","7841909041","valid"},
				                  {"priyankawani1994@gmail.com","@Anil7822","invalid"},
				                  {"Anilsagar@gmail.com","Sagar","invalid"}
				
				  };
		return loginData;
	}
//    @AfterClass
//    void tearDown()  
//    {
//    	driver.close();
//    }
	
}

