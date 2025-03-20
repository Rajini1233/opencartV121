package testCase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	public Properties p;
	WebDriver driver;

	@BeforeClass
	@Parameters({ "os", "browser" })
	public void setup(String os, String br) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\opencartV121\\src\\main\\resources\\config.properties");
         p=new Properties();
        p.load(fis);
		switch (br.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();break;
		case "firefox":
			driver = new FirefoxDriver();break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Invalid");
			return;
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appurl"));

	}

	@AfterClass
	public void close() {
		driver.quit();

	}

	public String randomAlphanumeric() {
		String generatealphanumber = RandomStringUtils.randomAlphanumeric(5);
		return generatealphanumber;
	}

	public String randomString() {
		String generatestring = RandomStringUtils.randomAlphabetic(5);
		return generatestring;
	}

	public String randomNumber() {
		String generatenumber = RandomStringUtils.randomAlphanumeric(10);
		return generatenumber;
	}

}
