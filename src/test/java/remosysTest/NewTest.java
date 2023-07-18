package remosysTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {


	@BeforeClass
	  public void setup() {
	
		
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\remosys\\Driver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> productElements = driver.findElements(By.cssSelector(".s-result-item"));

        // Print the product names
		  for (int i = 0; i < productElements.size(); i++) {
	            WebElement productElement = productElements.get(i);
	            WebElement productNameElement = productElement.findElement(By.cssSelector(".a-text-normal"));
	            System.out.println(productNameElement.getText());
	        }
            
   
		
//        for (WebElement productElement : productElements) {
//            WebElement productNameElement = productElement.findElement(By.cssSelector(".a-text-normal"));
//            System.out.println(productNameElement.getText());
//        }
		
		driver.findElement(By.xpath("//span[text()='Apple iPhone 12 (128GB) - White']")).click();
		
		
		
	}

	  @Test
	  public void loginTest() {
	    // Test step 1: Login to the e-commerce website
	    // Write code to perform login
	  }

	  @Test(dependsOnMethods = "loginTest")
	  public void searchItemTest() {
	    // Test step 2: Search for an item
	    // Write code to search for an item
	  }

	  @Test(dependsOnMethods = "searchItemTest")
	  public void printProductsTest() {
	    // Test step 3: Print all products on the first page
	    // Write code to print all products on the first page
	  }

	  @Test(dependsOnMethods = "printProductsTest")
	  public void addProductTest() {
	    // Test step 4: Add a product
	    // Write code to add a product
	  }

	  @Test(dependsOnMethods = "addProductTest")
	  public void updateProductTest() {
	    // Test step 5: Update a product
	    // Write code to update a product
	  }

	  @Test(dependsOnMethods = "updateProductTest")
	  public void deleteProductTest() {
	    // Test step 6: Delete a product
	    // Write code to delete a product
	  }

	  @Test(dependsOnMethods = "deleteProductTest")
	  public void logoutTest() {
	    // Test step 7: Logout from the e-commerce website
	    // Write code to perform logout
	  }

	  @AfterClass
	  public void tearDown() {
	    // Code for tearing down the test, e.g., closing the browser
	  }
	

 


}
