package browserlaunchpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandle extends LaunchBrowser{
	
	public void alertHandle() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		/*
		 * WebElement
		 * alert1=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		 * alert1.click();//we cannot inspect an alert
		 * driver.switchTo().alert().accept(); WebElement
		 * alert2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		 * alert2.click(); //driver.switchTo().alert().accept();
		 * driver.switchTo().alert().dismiss();
		 */
		WebElement alert3=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alert3.click();
		driver.switchTo().alert().sendKeys("Indu");
		driver.switchTo().alert().accept();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertHandle alerthandle=new AlertHandle();
		alerthandle.launchBrowser();
		alerthandle.alertHandle();
	}

}
