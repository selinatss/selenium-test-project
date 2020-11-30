import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Collections;

public class AppTest {

    @Test
    public void loginPageTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\*******\\********\\selenium-test-project\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));

        WebDriver driver = new ChromeDriver();

        String baseURL = "https://www.sahibinden.com/";
        driver.get(baseURL);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.manage().window().maximize();
        WebElement navBarLogin = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[1]/a"))));
        navBarLogin.click();

        driver.findElement(By.id("username"));
        WebElement username = driver.findElement(By.id("username"));

        driver.findElement(By.id("password"));
        WebElement password = driver.findElement(By.id("password"));

        WebElement loginClick = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"userLoginSubmitButton\"]"))));

        username.sendKeys("********@hotmail.com");
        Thread.sleep(1000);
        password.sendKeys("********");
        Thread.sleep(1000);
        loginClick.click();
    }
}
