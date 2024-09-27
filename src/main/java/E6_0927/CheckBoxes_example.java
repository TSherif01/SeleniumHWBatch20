package E6_0927;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes_example {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();

    }
}