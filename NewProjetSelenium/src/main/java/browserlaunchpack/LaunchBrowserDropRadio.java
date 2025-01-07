package browserlaunchpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserDropRadio {
	public WebDriver driver;

	public void launchBrowserDropRadio() {
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com");
		driver.manage().window().maximize();// for maximizing
		// driver=new EdgeDriver();
		// driver=new FirefoxDriver();
	}

	public void quitandclose()// method to close
	{
		driver.close();// closes only the last open window
		// driver.quit();//closes all windows
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LaunchBrowserDropRadio  lb1 = new LaunchBrowserDropRadio ();
		lb1.launchBrowserDropRadio();
		lb1.quitandclose();

	}

}
