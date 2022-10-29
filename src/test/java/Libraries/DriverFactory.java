package Libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Libraries.FileExtensions.BrowserDirectory;

public class DriverFactory {
    public static String ChromeDriverKey = "webdriver.chrome.driver";
    public static String ChromeDriverPath = BrowserDirectory() + "\\chromedriver.exe";
    public static WebDriver Driver;

    public static WebDriver CreateChromeDriver()
    {
        System.setProperty(ChromeDriverKey, ChromeDriverPath);
        return Driver = new ChromeDriver();
    }
}
