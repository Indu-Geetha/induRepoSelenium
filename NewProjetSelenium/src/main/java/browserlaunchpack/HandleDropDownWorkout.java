package browserlaunchpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownWorkout extends LaunchBrowserDropRadio {
	
	public void handledropdownwrkout() {
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement handledropdwnwrkout=driver.findElement(By.cssSelector("select#dropdowm-menu-1"));
		Select select1=new Select(handledropdwnwrkout);
		//select1.selectByIndex(2);
		select1.selectByValue("java");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandleDropDownWorkout handledropsample = new HandleDropDownWorkout();
		handledropsample.launchBrowserDropRadio();
		handledropsample.handledropdownwrkout();

	}

}
