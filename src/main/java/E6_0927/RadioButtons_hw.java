package E6_0927;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons_hw {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo-homework.php");
        driver.manage().window().maximize();

        /*1. Choose Your Favorite Beverage:
        - Select the Juice radio button from the list of favorite beverages. */
        WebElement juice = driver.findElement(By.xpath("//input[@value='Juice' and @name='beverage']"));
        juice.click();

        /*2. Preferred Working Environment:
        - Retrieve all radio buttons in the Preferred Working Environment section.
        - Traverse through the list of radio buttons in code and select the Hybrid option. */
        List<WebElement> work = driver.findElements(By.xpath("//input[@name='working_enviroment']"));
        for (WebElement enviroment : work) {
            if (enviroment.getAttribute("value").equals("hybrid")) {
                enviroment.click();
            }
        }

        /*3. Choose Your Favorite Season:
        - If the Spring radio button is disabled, click on the "Enable Buttons" button.
        - Ensure that the Spring option is now enabled, then select it.
        - By default, the Winter radio button is hidden. Ensure, through code, that it is not displayed initially. Then click on the "Show Buttons" button.
        - Verify that the Winter option is displayed after clicking and is available for selection. */
        WebElement enable = driver.findElement(By.xpath("//button[@id='enabledFruitradio']"));
        enable.click();
        WebElement show = driver.findElement(By.xpath("//button[@id='showRadioButtons']"));
        show.click();

        List<WebElement> season = driver.findElements(By.xpath("//input[@name='season']"));
        for (WebElement fav : season) {
            if (fav.getAttribute("value").equals("winter")) {
                fav.click();
            }
        }

        /*4. Choose Your Favorite Meal:
        - Select the Lunch radio button from the list of favorite meals.
        */
        WebElement lunch = driver.findElement(By.xpath("//input[@value='lunch']"));
        lunch.click();

            }
        }
