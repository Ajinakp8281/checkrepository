package maven_tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class login1 {
	WebDriver driver;
    @Test(dataProvider = "logindata")
    public void login(String username, String password) {
    	System.setProperty("WebDriver.chrome.driver","C:\\Users\\avina\\OneDrive\\Documents\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		driver= new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(username);
	    driver.findElement(By.id("password")).sendKeys(password);
	    WebElement button  =driver.findElement(By.xpath("//*[@id=\"submit\"]"));
	    button.click();
    }
    
    @AfterClass
     public void login1() {
    	driver.quit();
    }
    
    @DataProvider(name = "logindata")
    public Object[][] login2() {
    	return new Object[][] {
    		{"user2", "pass2"},

        	{"username","password"},
        	
        	{"student","Password123"}
    	};
    	
    	
    }
}
