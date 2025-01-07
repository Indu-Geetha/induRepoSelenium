package browserlaunchpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown extends LaunchBrowser {

	public void handledropdown() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement handledropdwn = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select = new Select(handledropdwn);// 3 ways to select text using Select class--(inbuilt
													// class)---webelement as parameter
		// by using visible text
		// select.selectByVisibleText("Red");
		
		// by using value---take the value given within the double quotes
		// select.selectByValue("Yellow");
		
		// by index--manually give the value of the index
		select.selectByIndex(3);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandleDropDown handledrop = new HandleDropDown();
		handledrop.launchBrowser();
		handledrop.handledropdown();

	}

}
