package BaseLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Baseclass {
	public static Properties prop;
	public static WebDriver driver;

	public Baseclass() {

		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\ConfigLayer\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void initlization() {

		String BrowserName = prop.getProperty("Browsername");
		if (BrowserName.equalsIgnoreCase("Chrome")) {
			System.out.println("Chromedriver Selected");
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver109.exe");
			driver = new ChromeDriver();
		} else {

			if (BrowserName.equalsIgnoreCase("eged")) {
				System.setProperty("webdriver.chrome.driver", "‪C:\\SeleniumDrivers\\egededriver.exe");
				driver = new EdgeDriver();

			}

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(prop.getProperty("url"));

	}

}