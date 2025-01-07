package browserlaunchpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckRadioDemo extends LaunchBrowser {

	public void checkradiodemo() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		//System.out.println(checkbox.isSelected());
		checkbox.click();
		System.out.println(checkbox.isSelected());//to check if its selected --returns true if selected else false
	}
	public void radiodemo() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radiobtn=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		radiobtn.click();
		WebElement shwmsg=driver.findElement(By.xpath("//button[@id='button-one']"));
		shwmsg.click();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckRadioDemo chkradio=new CheckRadioDemo();
		chkradio.launchBrowser();
		chkradio.checkradiodemo();
		chkradio.radiodemo();

	}

}
