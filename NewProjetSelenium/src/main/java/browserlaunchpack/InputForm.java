package browserlaunchpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputForm extends LaunchBrowser {

	public void inputform() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement entermsg = driver.findElement(By.id("single-input-field"));
		entermsg.sendKeys("hello Indu");
		System.out.println("Is it enabled:"+entermsg.isEnabled());//to check if the field is enabled
		System.out.println("Is it displayed:"+entermsg.isDisplayed());
		WebElement showmsgbtn = driver.findElement(By.id("button-one"));
		showmsgbtn.click();
		WebElement entervaluea=driver.findElement(By.id("value-a"));
		entervaluea.sendKeys("123");
		WebElement entervalueb=driver.findElement(By.id("value-b"));
		entervalueb.sendKeys("413");
		WebElement gettotal=driver.findElement(By.id("button-two"));
		gettotal.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputForm inpform = new InputForm();
		inpform.launchBrowser();
		inpform.inputform();

	}

}
