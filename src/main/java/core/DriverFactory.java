package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	private static WebDriver driver;

	private DriverFactory() {
	}

	public static WebDriver getDriver() {
		if (driver == null) {
			switch (Propriedades.browser) {
			case CHROME:
				String extensao = "";
				if (System.getProperty("os.name").startsWith("Win")) {
					extensao = ".exe";
				}
				System.setProperty("webdriver.chrome.driver", "drivers/chromedriver" + extensao);
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				break;
			case FIREFOX:
				driver = new FirefoxDriver();
				break;

			}
		}
		return driver;
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
