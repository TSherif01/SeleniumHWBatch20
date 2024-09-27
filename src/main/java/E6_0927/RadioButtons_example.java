package E6_0927;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons_example {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        WebElement maleRB = driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
        boolean stateofRB = maleRB.isSelected();
        if (!stateofRB) {
            maleRB.click();
        }

        boolean selectionofmaleRB = maleRB.isSelected();
        System.out.println("the male radio button is selected " + selectionofmaleRB);

        List<WebElement> ageGroup = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        for (WebElement age : ageGroup) {
            if (age.getAttribute("value").equals("15 - 50")) {
                age.click();
            } else {

                age.click();
                Thread.sleep(2000);

            }
        }
    }
}