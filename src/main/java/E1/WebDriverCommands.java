package E1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://google.com");

        driver.navigate().to("https://www.syntaxprojects.com/");

        driver.navigate().back();

        driver.navigate().refresh();

        driver.quit();

    }
}
