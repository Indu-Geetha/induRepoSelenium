package browserlaunchpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorClass extends LaunchBrowser {

	public void locator() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showmsgbutton = driver.findElement(By.id("button-one"));
		WebElement msgbtntwo = driver.findElement(By.id("button-two"));

		WebElement msgfield = driver.findElement(By.className("form-control"));
		WebElement btnclass = driver.findElement(By.className("btn btn-primary"));

		WebElement valuefield = driver.findElement(By.tagName("input"));
		WebElement valufield = driver.findElement(By.tagName("link"));

		// The LinkText locator identifies links by their exact visible text.
		WebElement linktext = driver.findElement(By.linkText("Checkbox Demo"));
		WebElement linktexttwo = driver.findElement(By.linkText("Radio Buttons Demo"));

		// If the full text of the link is too long or dynamic,
		// you can use the PartialLinkText locator strategy to match part of the visible
		// text.
		WebElement partiallinktext = driver.findElement(By.partialLinkText("Check"));
		WebElement partiallinktexttwo = driver.findElement(By.partialLinkText("Radio"));

		WebElement name = driver.findElement(By.name("viewport"));
		WebElement nametwo = driver.findElement(By.name("keywords"));
		// tagname[attribute=’value’]---css selector
	}

	public void cssselector() {

		// Locate an input field using ID
		WebElement msgfld = driver.findElement(By.cssSelector("input#single-input-field"));
		// locate a checkbox using id
		WebElement chkbox = driver.findElement(By.cssSelector("input#gridCheck"));

		// Locate a button using class
		WebElement showMsg = driver.findElement(By.cssSelector("button.btn.btn-primary"));
		// locate a text area using class
		WebElement txtarea = driver.findElement(By.cssSelector("textarea.form-control"));

		// Locate a button using ID and explicitly giving the value
		WebElement showMsgById = driver.findElement(By.cssSelector("button[id=button-one]"));
		// locate a dropdown field using id and explicitly giving the value
		WebElement dropdwn = driver.findElement(By.cssSelector("select[id=single-input-field]"));

		// tag.class[attributetype=value]
		// Locate an input field using a combination of tag, class, and attribute
		WebElement enterMsg = driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));
		// locate a button by using a combination of tag ,class and attribute
		WebElement buttons = driver.findElement(By.cssSelector("button.btn.btn-primary[id=button-first]"));

	}

	/*
	 * XPath is a language used to navigate through elements and attributes in an
	 * XML document. Since HTML is a type of XML, we can use XPath to locate HTML
	 * elements in a web page.
	 * 
	 * There are two main types of XPath:
	 * 
	 * Absolute XPath: Starts from the root of the document (i.e., the <html> tag)
	 * and specifies the full path to the element. Relative XPath: Starts from a
	 * specific element or a more targeted starting point in the document, making it
	 * shorter and more flexible.
	 */

	public void absolutexpath() {

		WebElement samplexpath = driver
				.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
		/*
		 * The XPath used here is an absolute XPath, meaning it starts from the root
		 * element (/html) and traverses down the hierarchy of the document to locate
		 * the target element.
		 */
		/*
		 * * how to get the path::Right-click on the HTML element in the Developer
		 * Tools: Once the HTML element highlighted, right-click on the code in the
		 * Elements panel. Select “Copy”:
		 */
		WebElement butn1path = driver
				.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/button[1]"));

	}

	/*
	 * //RELATIVE XPATH--// denotes current node...it is not a long elemnt. it can
	 * locate any element in a page with the relative xpath 1 of 1 mainly
	 * //tagname[@attribute='attributevalue']
	 */
	public void relativexpath() {
		WebElement relxpath = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement relxpathsample2 = driver.findElement(By.xpath("//div[@id='message-one']"));
	}

	/*
	 * // dynamic xpath:contains(),text()----
	 * tagname[contains(@attributetype,'value')]----- contains():if attribute value
	 * is changing dynamically // we can use contains()....if the attribute value is
	 * given partially also it will take. text()----//tagname[text()='value']
	 */
	public void dynamicxpath() {
		WebElement dynpath = driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));// contains
		WebElement dynpath2 = driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
		WebElement dynpathtext = driver.findElement(By.xpath("//div[text()='Your Message : ']"));// text
		WebElement dynpathtext2 = driver.findElement(By.xpath("////div[text()='Total A + B :']"));

	}

	// axes methods
	public void axesmethod() {
		WebElement logo = driver.findElement(By.xpath("//a[@href='índex.php']//child::img"));// child of logo
		WebElement buttonparent = driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));// parent of
		WebElement btnFollow = driver
				.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']"));// FOLLOWING
		WebElement shwmsgbtn = driver.findElement(By.xpath("//button[id@='button-one']//preceeding::label"));// preceeding

		// button
		// preceeding

		WebElement btnancestor = driver
				.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='row']"));// ancestor
		WebElement entrmsgfld = driver.findElement(By.xpath("(//input[@type='text'])[1]"));// index
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocatorClass locator = new LocatorClass();
		locator.launchBrowser();
		locator.locator();
		locator.quitandclose();

	}

}
