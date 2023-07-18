package remosys.remosys;

//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class test1 {

//	public static void main(String[] args) {
//
//		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\remosys\\Driver");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple");
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		
//		List<WebElement> productElements = driver.findElements(By.cssSelector(".s-result-item"));
//
//        // Print the product names
//		  for (int i = 0; i < productElements.size(); i++) {
//	            WebElement productElement = productElements.get(i);
//	            WebElement productNameElement = productElement.findElement(By.cssSelector(".a-text-normal"));
//	            System.out.println(productNameElement.getText());
//	        }
//            
//}
	
@BeforeClass 
	

	
	    public static void main(String[] args) throws InterruptedException {
	        WebDriverManager.chromedriver().setup();

	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.amazon.in/");
	        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 12");
	        driver.findElement(By.id("nav-search-submit-button")).click();

	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

	        List<WebElement> productTitleElements = driver.findElements(By.cssSelector(".a-size-medium.a-color-base.a-text-normal"));

	        for (WebElement x : productTitleElements) {
	            System.out.println(x.getText());
	        }
	        
	        WebElement ele = driver.findElement(By.xpath("(//span[text()='Apple iPhone 12 (64GB) - Purple'])[1]"));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
	        

	      Set<String> allWin=   driver.getWindowHandles();
	    Iterator<String>itr=  allWin.iterator();
	   String id1= itr.next();
	   System.out.println(id1);
	   
	   String id2= itr.next();
	   System.out.println(id2);
	   driver.switchTo().window(id2);
	            
	      
        WebElement ele2= driver.findElement(By.xpath("//input[@name='submit.add-to-cart']"));
        ele2.click();
        
       
     
        
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele2);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele2);
//			
//			driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")).click();
////	        
//	WebElement ddl =driver.findElement(By.cssSelector(".a-icon.a-icon-dropdown"));
//	Select slt = new Select(ddl);
//	slt.deselectByValue("8");
//			
//			
//			
//			driver.quit();
	    }
	}
	




