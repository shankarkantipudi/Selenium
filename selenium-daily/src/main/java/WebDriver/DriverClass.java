package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverClass {
    private  WebDriver driver;

    public DriverClass() {
         driver =new ChromeDriver();
    }
    public WebDriver getDriver(){
        return driver;
    }

}
