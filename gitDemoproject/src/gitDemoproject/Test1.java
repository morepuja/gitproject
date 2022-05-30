package gitDemoproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\bajad\\Desktop\\SELENIUM\\chromedriver.exe" );
		    WebDriver driver= new ChromeDriver();
		    driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		    Thread.sleep(1000);
	        
		    WebElement d=driver.findElement(By.xpath("//input[@name='submit'])"));
		    d.click();
	        Thread.sleep(3000);
	        
	        Alert alt=driver.switchTo().alert();
	         //alt.dismiss();
	         
	         String h=alt.getText( ); //this method is use to print the text
	         System.out.println(h);
	        		
		}

	


	}


