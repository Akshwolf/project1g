package Package2;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractise {

	public static void main(String args[])
    {
		System.setProperty("webdriver.chrome.driver","E:\\Acceleration\\WorkSpace\\Selenium\\Executable\\chromedriver.exe");
		ChromeDriver cdriver= new ChromeDriver();
		cdriver.get("https://www.amazon.com");
		cdriver.findElementById("twotabsearchtextbox").sendKeys("Alexa home decor");
	cdriver.findElementById("nav-search-submit-button").click();
	cdriver.findElementById("nav-global-location-popover-link").click();
   cdriver.get("https://www.flipkart.com");
    }
}
