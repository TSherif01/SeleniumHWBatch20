package E1_0920;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.syntaxprojects.com/");

        driver.manage().window().maximize();

        String url = driver.getCurrentUrl();

        String title = driver.getTitle();

        System.out.println("The title of the webpage:" + title);
        System.out.println("The url of the webpage:" + url);

        driver.quit();
        }
    }



