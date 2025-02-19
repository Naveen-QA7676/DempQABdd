package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("https://demoqa.com/");
Thread.sleep(10000);
driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class='element-list collapse show']/ul/li[5]")).click();
Thread.sleep(2000);
//for(int i=1;i<=5;i++) {
//	
//		String path="//div[@class='rt-tbody']/div["+ i+"]/div/div[1]";
//		System.out.println(path);
//		String name=driver.findElement(By.xpath(path)).getText();
//		if(name.equals("Alden")) {
//			for(int j=1; j<=7; j++) {
//				String path2="//div[@class='rt-tbody']/div["+i+"]/div/div["+j+"]";
//				System.out.println(driver.findElement(By.xpath(path2)).getText());
//			}
//		}
//	
//
//}

driver.findElement(By.xpath("//*[@id=\"addNewRecordButton\"]")).click();
//driver.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys("sjd");

Thread.sleep(2000);
JavascriptExecutor js = (JavascriptExecutor) driver;
WebElement firstname = driver.findElement(By.xpath("//*[@id='firstName']"));
firstname.sendKeys("skdjks");
WebElement lastname = driver.findElement(By.xpath("//*[@id='lastName']"));
lastname.sendKeys("sdfdl");
WebElement useremail = driver.findElement(By.xpath("//*[@id='userEmail']"));
useremail.sendKeys("sdjfk");
WebElement age = driver.findElement(By.xpath("//*[@id='age']"));
age.sendKeys("sdfls");
WebElement salary = driver.findElement(By.xpath("//*[@id='salary']"));
salary.sendKeys("sdkjf");
WebElement dept = driver.findElement(By.xpath("//*[@id='department']"));
dept.sendKeys("sdl");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

String validationMessage = (String) js.executeScript("return arguments[0].validationMessage;", firstname );
String validationMessage1 = (String) js.executeScript("return arguments[0].validationMessage;", lastname );
String validationMessage2 = (String) js.executeScript("return arguments[0].validationMessage;", useremail );
String validationMessage3 = (String) js.executeScript("return arguments[0].validationMessage;", age );
String validationMessage4 = (String) js.executeScript("return arguments[0].validationMessage;", salary );
String validationMessage5 = (String) js.executeScript("return arguments[0].validationMessage;", dept );

System.out.println("Validation Message: " + validationMessage);
System.out.println("Validation Message: " + validationMessage1);
System.out.println("Validation Message: " + validationMessage2);
System.out.println("Validation Message: " + validationMessage3);
System.out.println("Validation Message: " + validationMessage4);
System.out.println("Validation Message: " + validationMessage5);



	}

}
