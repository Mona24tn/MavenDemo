package mavenProject;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenSeleniumLink {

	@Test
	public void test1() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mona\\eclipse-workspace\\Photon\\mavenProject\\src\\test\\resources\\driver\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.seleniumhq.org/download/");
		
		String title=driver.getTitle();
		
		System.out.println("Title of the page is :"+title);
		
		driver.close();
	}

}
