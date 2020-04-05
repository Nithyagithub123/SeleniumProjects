package dealsandcoupons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DesidimeLoginTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\nithya\\software\\geckodriver.exe");
	       
			WebDriver driver = new FirefoxDriver();  
		
		 driver.get("https://www.desidime.com/");
		 
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().window().maximize();
		 		 
		/*
		 * driver.findElement(By.xpath("//a[@href='/login']")).click();
		 * 
		 * driver.findElement(By.xpath("//input[@id='login']")).sendKeys("dummytest");
		 * 
		 * driver.findElement(By.xpath("//input[@id='password']")).sendKeys("helloworld"
		 * );
		 * 
		 * driver.findElement(By.xpath("//input[@name='commit']")).click();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * 
		 * boolean
		 * isTrue=driver.findElement(By.xpath("//*[@id=\"user_auth\"]/ul/li[7]/a/span"))
		 * . getText().contains("DUMMYTEST"); if(isTrue) {
		 * System.out.println("Successful login"); }else {
		 * System.out.println("Login failed"); }
		 */
		
		/*
		 * driver.findElement(By.cssSelector("div[class=logo]")).click(); try{
		 * WebElement element = driver.findElement(By.cssSelector("div[class=logo]"));
		 * //The refresh link user clicks element.click(); boolean clicked = true;
		 * System.out.println("page refreshed"); }catch(Exception e){ boolean clicked =
		 * false; System.out.println("page not refreshed"); throw new Exception(); }
		 */
		 
		 //List<WebElement> Homepage_Main_Menus=driver.findElements(By.xpath("//div[@class='nav-inner grid-70 tablet-grid-65 grid-parent']/ul/li "));
		
		/*
		 * List<WebElement> Homepage_Main_Menus=driver.findElements(By.
		 * cssSelector("div[class=nav-inner grid-70 tablet-grid-65 grid-parent] ul li ")
		 * ); System.out.println("No of links : "+ Homepage_Main_Menus.size() );
		 * 
		 * for(WebElement link:Homepage_Main_Menus) {
		 * System.out.println("Homepage_Main_Menus " + link.getText()); }
		 */
		 
		 
		 boolean verify_keyword_srchTF=driver.findElement(By.id("selective_search_field"))
				 .getText().contains("Search For Deals, Coupons, Stores & Forums");
		 
		 if(verify_keyword_srchTF)
		 {
			 
			 System.out.println("Search keywords found with exact match");
		 }else
		 {
			 System.out.println("Search keywords not found or no matching keywords");
		 }
		 Actions action = new Actions(driver);
			WebElement hoover = driver.findElement(By.xpath("//div[@class='nav-inner grid-70 tablet-grid-65 grid-parent']/ul/li"));
			action.moveToElement(hoover).perform();
			
		 
		 
		 List<WebElement> Homepage_categories_menu=driver.findElements(By.xpath("//a[@class='gtm-menu-categories']"));
			
			 System.out.println("No of links : "+ Homepage_categories_menu.size() );
			
			  for(WebElement link:Homepage_categories_menu) {
			  System.out.println("Homepage_Main_Menus_categories " + link.getText()); }
			 
		 
		 
		 driver.close();
		
	}

}
