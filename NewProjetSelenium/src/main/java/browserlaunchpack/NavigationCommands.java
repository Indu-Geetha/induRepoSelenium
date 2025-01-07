package browserlaunchpack;

public class NavigationCommands extends LaunchBrowser {
	
	public void navigationCommands()
	{
		driver.navigate().to("https://www.amazon.in");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigationCommands nvg=new NavigationCommands();
		nvg.launchBrowser();
		nvg.navigationCommands();

	}

}
