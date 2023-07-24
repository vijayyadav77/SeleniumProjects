package actions;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {


		// declaration and instantiation of objects/variables		
		System.setProperty("webdriver.gecko.driver","C:\\driver\\geckodriver.exe");					
        WebDriver driver = new FirefoxDriver();
        
        driver.manage().window().maximize();
        
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        
        driver.get(baseUrl);
        
        WebElement link_Home = driver.findElement(By.linkText("Home"));
        WebElement td_Home = driver.findElement(By .xpath("//html/body/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr"));
                        
                        
          
         
        Actions builder = new Actions(driver);
        Action mouseOverHome = builder.moveToElement(link_Home).build();
                
                
         
        String bgColor = td_Home.getCssValue("background-color");
        System.out.println("Before hover: " + bgColor);
        
        mouseOverHome.perform(); 
        
        bgColor = td_Home.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);
//        driver.close();
        
// ===========================================================================
//        Series of Actions Builder
//============================================================================        
		
        
        String baseUrl1 = "http://www.facebook.com/"; 
       

        driver.get(baseUrl1);
        WebElement txtUsername = driver.findElement(By.id("email"));
        
        Actions builder1 = new Actions(driver);
        Action seriesOfActions = builder1.moveToElement(txtUsername).click()
        	
        	
        	.keyDown(txtUsername, Keys.SHIFT).sendKeys(txtUsername, "hello")
        	
        	.keyUp(txtUsername, Keys.SHIFT)
        	.doubleClick(txtUsername)
        	.contextClick()
        	.build();
        	
        seriesOfActions.perform() ;
        
        
        
	}

}




	