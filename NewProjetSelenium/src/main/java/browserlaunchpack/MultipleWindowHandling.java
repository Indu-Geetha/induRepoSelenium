package browserlaunchpack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
	
	public WebDriver driver;

	public void launchBrowser1() {
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();// for maximizing
		// driver=new EdgeDriver();
		// driver=new FirefoxDriver();
	}
	
	public void multipleWindow()
	{
		WebElement contactus=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contactus.click();
		WebElement login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		login.click();
		String parent=driver.getWindowHandle();
		System.out.println("Parent:"+parent);//parent handled id
		Set<String> childwindows=driver.getWindowHandles();
		System.out.println("Child windows:");
		String title="";
		for(String newchild:childwindows) {
			if(!newchild.equals(parent)) {
				System.out.println(newchild);
				driver.switchTo().window(newchild);
				//System.out.println(driver.getTitle());
				title=driver.getTitle();
			}
			if(title.equals("WebDriver | Login Portal")) {
				WebElement name=driver.findElement(By.xpath("//input[@id='text']"));
				name.click();
				name.sendKeys("Indu");
				WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
				pwd.click();
				pwd.sendKeys("abcd@123");
				WebElement loginbtn=driver.findElement(By.xpath("//button[text()='Login']"));
				loginbtn.click();
				
			}
			if(title.equals("WebDriver | Contact Us")) {
				
				WebElement fname=driver.findElement(By.xpath("//input[@name='first_name']"));
				fname.sendKeys("Indu");
				WebElement sname=driver.findElement(By.xpath("//input[@name='last_name']"));
				sname.sendKeys("Geetha");
				
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleWindowHandling multiplewindow=new MultipleWindowHandling();
		multiplewindow.launchBrowser1();
		multiplewindow.multipleWindow();

	}

}
