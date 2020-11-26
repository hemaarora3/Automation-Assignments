package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MyClass {
	
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		String baseurl = "http://automationpractice.com/index.php";
		driver.get(baseurl);

		  Actions actions=new Actions();
		  WebElement womenTab=driver.findElement(By.linkText("WOMEN"));
		  WebElement TshirtTab=driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul//a[@title='T-shirts']"));
		  actions.moveToElement(womenTab).moveToElement(TshirtTab).click().perform();
		  
		  String ProductName=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]")).getText();
		  System.out.println(ProductName);
		  driver.findElement(By.id("search_query_top")).sendKeys(ProductName);
		  driver.findElement(By.name("submit_search")).click();
		  
		  driver.findElement(By.xpath("//p[@id='add_to_cart']//span[.='Add to cart']")).click();
		  
		  driver.findElement(By.xpath("/html//div[@id='layer_cart']//a[@title='Proceed to checkout']/span")).click();
		  
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();
		  //terms&Conditions
		  driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button/span")).click();

		  //Click on Payby Check
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a")).click();
		  //Confirm the order
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();

	
		  
		  
}

}