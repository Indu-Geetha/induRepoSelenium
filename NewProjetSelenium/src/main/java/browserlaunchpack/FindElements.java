package browserlaunchpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElements extends LaunchBrowser {
	
	public void findElements() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");////input[@class="check-box-list"]
		List<WebElement> findelemnt=driver.findElements(By.xpath("input[@class='check-box-list']"));//list
		for(WebElement find:findelemnt)
		{
			find.click();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindElements finlements=new FindElements();
		finlements.launchBrowser();
		finlements.findElements();
		

	}

}
