package seleniumNew1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "F:\\velocity automation\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().window().minimize();

		Options opt = driver.manage();
		Window win = opt.window();
		win.maximize();

		// WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
		// driver.get("https://web.whatsapp.com/");
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(4000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	
//	  String title=driver.getTitle(); 
//	  String url=driver.getCurrentUrl();
//	  System.out.println(title);
//	  System.out.println(url);

		
//		  Dimension dia=new Dimension(1000, 50); 
//		 driver.manage().window().setSize(dia); 
//		 Point po=new Point(300, 300);
//		  driver.manage().window().setPosition(po);
Thread.sleep(2000);
	 
	   
//	  WebElement pass=driver.findElement(By.name("pass"));
//	  pass.sendKeys("1234567890");
	  
//	  WebElement ie=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/div/a/div/div"));
//	  ie.click();
	  
	  WebElement pass=driver.findElement(By.cssSelector("input[type='password']"));
	  pass.sendKeys("1234567890");
	  
	  
//	  WebElement log=driver.findElement(By.tagName("button"));
//	  log.click();
	  
	  //driver.findElement(By.linkText("Forgotten password?")).click();
	  //driver.findElement(By.cssSelector("input[type='text']")).sendKeys("sunil bavache");
	  //driver.findElement(By.linkText("Forgotten account?")).click();
	  //driver.findElement(By.partialLinkText("Forgotten")).click();
	  //driver.findElement(By.xpath("(//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5'])[2]")).click();  //by xpath index
	  
	  driver.findElement(By.xpath("//button[@value='1']")).click();   //by xpath attribute
	  //driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();  //xpath by text
	  driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0 _52e0 _4jy6 _4jy1')]")).click();  //xpath by constins
//	  WebElement pass=driver.findElement(By.className("_6ltj"));
//	  pass.click();
	  
	  Thread.sleep(5000);
	  //driver.close();
	  driver.quit();

	}
	


}
