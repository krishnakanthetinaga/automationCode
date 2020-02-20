import Driver.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    private DriverManager driverManager = new DriverManager();

    @Before
    public void setup() { driverManager.openBrowser();}

    @After
    public void tearDown() { driverManager.closeBrowser();}
}
