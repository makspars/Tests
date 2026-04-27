import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Find_Element {

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get("https://google.com");
           // List<WebElement> input = driver.findElements(); (Вернёт список подходящих элементов)
            WebElement input = driver.findElement( //(Вернёт один элемент)
            By.id("gws-output-pages-elements-homepage_additional_languages__als")
            );
        }
    }

