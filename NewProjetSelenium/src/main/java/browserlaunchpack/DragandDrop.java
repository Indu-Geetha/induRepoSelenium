package browserlaunchpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop extends LaunchBrowser {
	
	public void dragandDrop()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		Actions action=new Actions(driver);
		action.moveToElement(drag).click();
		action.doubleClick(drag).perform();
		WebElement drop=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		action.dragAndDrop(drag, drop).build().perform();//actions build and perform--build and perform are methods in Actions class
		
		

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragandDrop dragdrop=new DragandDrop();
		dragdrop.launchBrowser();
		dragdrop.dragandDrop();

	}

}
