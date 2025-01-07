package browserlaunchpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandle extends LaunchBrowser {
	
	
	public void fulltable()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
		
	}
	public void selectrow() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tablerow=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]"));
		System.out.println(tablerow.getText());
				//take the same xpath and find it===in control +f and give//table[@id='dtBasicExample']/tbody/tr[4]
		
	}
	public void selectdata() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement data=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]/td[2]"));
		System.out.println(data.getText());
	}
	
	public void selectcolumn() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> column=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement col:column )
		{
			System.out.println(col.getText());
		}
	}
	public void checkelement()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String input="Ashton Cox";
		List<WebElement> check=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement chk:check)
		{
			if(chk.getText().equals(input))
			{
			
				System.out.println(chk.getText());
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandle tablehandle=new TableHandle();
		tablehandle.launchBrowser();
		tablehandle.fulltable();
		System.out.println("************************************************************");
		tablehandle.selectrow();
		System.out.println("*------------*********************************************************---------------*");
		tablehandle.selectdata();
		System.out.println("*------------*********************************************************---------------*");
		tablehandle.selectcolumn();
		System.out.println("*------------*********************************************************---------------*");
		tablehandle.checkelement();


	}

}
