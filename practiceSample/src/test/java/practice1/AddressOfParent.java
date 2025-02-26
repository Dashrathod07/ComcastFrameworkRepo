package practice1;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddressOfParent 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		String p_id = driver.getWindowHandle();
		System.out.println(p_id);
		driver.quit();
	}
}
