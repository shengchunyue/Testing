package soft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BaseUrl {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\demo\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin","D:\\Program Files(X86)\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.baidu.com";
		driver.get(baseUrl);
		System.out.println(driver.getTitle());
		driver.quit();
		}
	}

