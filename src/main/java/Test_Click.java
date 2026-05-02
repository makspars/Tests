import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test_Click {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lostfilm.tv/");
        WebElement element = driver.findElement (By.xpath("/html/body/div[3]/div[1]/div/div[1]/div/a[2]"));
        Thread.sleep(4000);
        element.click();
}
}