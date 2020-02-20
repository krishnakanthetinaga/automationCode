package Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverManager{
  public static WebDriver driver;
  public DriverManager() { PageFactory .initElements(driver, this);  }

  public void openBrowser(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://www.premierinn.com/gb/en/home.html");
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }
  public void closeBrowser() {driver.quit(); }

  public String getCurrentUrl() { return driver.getCurrentUrl(); }

}
