package browserlaunchpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public WebDriver driver;

	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
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
		LaunchBrowser lb = new LaunchBrowser();
		lb.launchBrowser();
		lb.quitandclose();

	}

}
