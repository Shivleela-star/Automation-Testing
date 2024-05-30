package Magnus.SeleniumFrameworkDesign;

import java.time.Duration;
//import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Standalone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://magnus.jalatechnologies.com/");	
		
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.name("Password")).sendKeys("jobprogram");
		driver.findElement(By.className("btn")).click();
		
		//List<WebElement> totalLnks = driver.findElements(By.tagName("a"));
		
		//dropdown = wait.until(EC.visibility_of_element_locator(By.xpath("https://magnus.jalatechnologies.com/Home/Index#")).click();
		
		//WebElement link = driver.findElement(By.className("fa-users"));
		//String url = link.getAttribute("href");
		
		
		
		//WebElement e = driver.findElement(By.xpath("/Employee/Create"));
				//Select s = new Select(e);
				//s.selectByValue("option 1");
		driver.findElement(By.xpath("//i[@class='fa fa-users']")).click();
		driver.findElement(By.xpath("//i[@class='fa fa-pencil-square-o']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Shivleela");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Dattatrya");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='EmailId']")).sendKeys("shivleela024@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='MobileNo']")).sendKeys("8884879258");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='DOB']")).sendKeys("10/09/1996");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='rdbFemale']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//textarea[@id='Address']")).sendKeys("Bangalore");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//select[@id='CountryId']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement e = driver.findElement(By.xpath("//select[@id='CountryId']"));
		Select dropdown = new Select(e);
		dropdown.selectByIndex(5);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//select[@id='CityId']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[@class='checkmark']")).click();
		driver.findElement(By.xpath("//input[@id='OtherCity']")).sendKeys("Bangalore");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//div[@class='col-md-12 form-group m-t-lg']")).click();
		driver.findElement(By.xpath("//input[@id='chkSkill_1']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
		driver.findElement(By.xpath("//input[@id='Name']")).sendKeys("Shivleela");
		driver.findElement(By.xpath("//input[@id='MobileNo']")).sendKeys("8884879258");
		driver.findElement(By.xpath("//button[@id='btnSearch']")).click();
		//driver.findElement(By.xpath("//div[@class='box-body box-body-list']"));
		driver.findElement(By.xpath("(//a[normalize-space()='Add Employee'])[1]")).click();
		
		driver.findElement(By.xpath("//i[@class='fa fa-th-list']")).click();
		driver.findElement(By.xpath("//i[@class='fa fa-hand-o-right']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Plan to Succeed']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='UnLearning']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Ways of Unlearning']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[normalize-space()='Menu']")).click();
		driver.findElement(By.xpath("(//a[@id='b1'])[1]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Sub Menus']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Autocomplete']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Collapsible Content']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[normalize-space()='Images']")).click();
		driver.findElement(By.xpath("//i[@class='fa fa-cogs']")).click();
		driver.findElement(By.xpath("//footer[@class='main-footer']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[@href='/Account/SignOut']")).click();
		
		
		
		
		
	   }
	
	}


