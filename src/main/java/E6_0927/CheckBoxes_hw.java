package E6_0927;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes_hw {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/selenium_commands_selector-homework.php");
        driver.manage().window().maximize();

    }
}