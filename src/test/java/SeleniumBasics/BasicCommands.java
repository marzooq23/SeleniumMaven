package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Libraries.DriverFactory.CreateChromeDriver;

public class BasicCommands {
    public static void main(String[] args) {
        Setup();
        WebDriverCommands();
        WebElementCommands();
        Teardown();
    }

    public static WebDriver driver;

    public static void Setup()
    {
        driver = CreateChromeDriver();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void Teardown()
    {
        driver.quit();
    }

    public static void WebDriverCommands()
    {
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
    }

    public static void WebElementCommands()
    {
        WebElement LuckyButton = driver.findElement(By
                .xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[2]"));
        System.out.println(LuckyButton.getAttribute("value"));
    }
}
