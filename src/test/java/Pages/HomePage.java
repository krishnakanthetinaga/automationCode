package Pages;

import Driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.accessibility.AccessibleStateSet;
import javax.swing.text.html.CSS;

public class HomePage extends DriverManager {

    @FindBy(xpath = "//*[@id=\"search-console-form\"]/search-console-form-location/search-console-form-location-input/div/input")
    private WebElement location;

    @FindBy (id = "search-console-form-button")
    private WebElement searchBtn;

    @FindBy (css = "div.pi-hero-heading-container")
    private WebElement bookHotel;

    public void searchLocation()
    {
    location.sendKeys("London");
    }
    public void clickSearchBtn(){
    searchBtn.click();
    }
    public boolean isDisplayed(){
       return bookHotel.isDisplayed();
    }

}
