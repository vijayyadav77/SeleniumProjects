package listeners;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


	public class DragnDrop{

		

    @Test		
    public void Dragdrop()					
    {	
    	
    	
    	System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
    	
    	WebDriver driver = new ChromeDriver();
         
    	 driver.manage().window().maximize();  
         driver.get("http://demo.guru99.com/test/drag_drop.html");
         
                
		   																		
      	WebElement From = driver.findElement(By.xpath("//*[@id='credit2']/a"));	//Element which needs to drag. 
         
   		
        WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));		      //Element on which need to drop.	 		
        
        
        WebElement From1 = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[2]/a"));	//Element which needs to drag. 
         
   		
        WebElement To1=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/div/div/ol"));
        
        
        
        
         		
    
         Actions act=new Actions(driver);	                                    //Using Action class for drag and drop.				

		
         act.dragAndDrop(From, To).build().perform();		 	//Dragged and dropped.
         
         act.dragAndDrop(From1, To1).build().perform();
         
	}		
}
