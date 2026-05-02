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

            WebElement input_id = driver.findElement( //(Вернёт один элемент через id
            By.id("gws-output-pages-elements-homepage_additional_languages__als")
            );

            WebElement input_xpath = driver.findElement( //(Вернёт один элемент через xpath
                    By.xpath("//a[contains(text(),'Реклама')]")
            );

            WebElement input_class = driver.findElement( //(Вернёт один элемент через класс
                    By.xpath("//div[@class='gb_z']")
            );


            WebElement input_class_plus = driver.findElement( //(Вернёт один элемент через класс с доп проверкой
                    By.xpath("//*[contains(@class,'gb_')]")
            );
            WebElement input_class_css = driver.findElement( //(Вернёт один элемент по id через css selector
                    By.cssSelector("#main")
            );
            WebElement input_class_css_not = driver.findElement( //(Вернёт всё кроме выбранного через css selector
                    By.cssSelector("div.not(#Main)"));

}
}