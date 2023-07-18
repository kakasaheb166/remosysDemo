package remosys.remosys;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest 
{

    private WebDriver driver;

    @BeforeClass
    public void setup() {
      
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void eCommerceTest() {
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
       
    }

    @AfterClass
    public void teardown() {
       
            driver.quit();
        
    }
 
}
