package Pages;

import Driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class ResultsPage extends DriverManager {

    @FindBy(css = "hotel-core-info>hotel-name>name")
    private List <WebElement> hotels;

    @FindBy(css="div pi-book-now-button")
    private WebElement bookNow;

    public void firstHotel(){
    hotels.get(0).click();

    }
    public boolean isDisplayed (){
        return bookNow.isDisplayed();
    }

}
