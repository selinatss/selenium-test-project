import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppTest {

    @Test
    public void loginPageTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\....\\......\\selenium-test-project\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseURL = "https://secure.sahibinden.com/giris";
        driver.get(baseURL);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.manage().window().maximize();
        /*WebElement navBarLogin = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[1]/a"))));
        navBarLogin.click();*/

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("test@gmail.com");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("123456");

        WebElement loginClick = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"userLoginSubmitButton\"]"))));
        loginClick.click();


    }

}
