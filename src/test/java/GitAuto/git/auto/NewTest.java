package GitAuto.git.auto;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  System.out.println("Initialiasing driver");
	  FirefoxProfile p = new FirefoxProfile();
		FirefoxBinary bin = new FirefoxBinary(new File("D:/Program Files (x86)/Mozilla Firefox/firefox.exe"));	
		driver = new FirefoxDriver(bin, p);
	  driver.get("https://www.google.co.in");
  }
  
  @AfterTest
  public void tearDown(){
	  System.out.println("Quitting driver");
	  driver.quit();
  }
}
