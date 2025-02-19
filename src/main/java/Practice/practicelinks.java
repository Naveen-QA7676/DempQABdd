package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practicelinks {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("https://demoqa.com/");
Thread.sleep(10000);
driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class='element-list collapse show']/ul/li[6]")).click();
Thread.sleep(2000);
System.out.println(driver.findElement(By.xpath("//div[@id='linkWrapper']")).getText()); 




	}
	
	
	
	
}
