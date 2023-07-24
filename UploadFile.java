package uploadDownload;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class UploadFile {

	public static void main(String[] args) {


		// declaration and instantiation of objects/variables		
				System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");					
		        WebDriver driver = new ChromeDriver();
		        
		        
		        
		        String baseUrl = "https://demo.guru99.com/test/upload/";
		        driver.get(baseUrl);
		        driver.manage().window().maximize();
		        
/*
 * UPLOAD FILE WEB
 * 
 * 
 * */		        
		        
		        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
		       
		        // enter the file path onto the file-selection input field
		        uploadElement.sendKeys("D:\\Python\\bsaic.py");

		        // check the "I accept the terms of service" check box
		        driver.findElement(By.id("terms")).click();

		        // click the "UploadFile" button
		        driver.findElement(By.name("send")).click();
		        
		        /*
		         *dOWWNLOAD FILE FROM WEB
		         *1. FIRST DOWNLOAD wGET.EXE IN D DRIVE
		         * 	RUN ON CMD FOR VALIDATION
		         * 
		         * */	        
		        
		        
                String baseUrl1 = "https://demo.guru99.com/test/yahoo.html";
       

        driver.get(baseUrl1);
//        WebElement downloadButton = driver.findElement(By .id("messenger-download"));
       
//        String sourceLocation = downloadButton.getAttribute("href");
//        String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation;
/*
        try {
//            Process exec = Runtime.getRuntime().exec(wget_command);
//            int exitVal = exec.waitFor();
//            System.out.println("Exit value: " + exitVal);
//            } catch (InterruptedException | IOException ex) {
            System.out.println(ex.toString());
            }
            driver.close();*/
		        
		        
//        exec(wget_command
//        		InterruptedException | IOException
	}

	

}
