package alletsTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlertsTest {
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver-win32\\chromedriver.exe");
        // Инициализация драйвера
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*"); // Allow all origins
        driver = new ChromeDriver(options);
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    public void testPageRendered() {
        String expectedText = "JavaScript Alerts";
        String actualText = driver.findElement(By.tagName("h3")).getText();
        assertEquals("The current title should be on the page.", expectedText, actualText);
        List<WebElement> list = driver.findElements(By.tagName("li"));
        assertEquals("Tne current field should be on the page", "Click for JS Alert", list.get(0).getText());
        assertEquals("Tne current field should be on the page", "Click for JS Confirm", list.get(1).getText());
        assertEquals("Tne current field should be on the page", "Click for JS Prompt", list.get(2).getText());
    }

    @Test
    public void testJSAlertButton() {
        //Click for JS Alert button
        List<WebElement> list = driver.findElements(By.tagName("li"));
        list.get(0).findElement(By.tagName("button")).click();// Нажимаем кнопку для вызова alert

        // Явное ожидание появления алерта
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();// Переключаемся на alert
        // Получаем текст алерта
        String alertText = alert.getText();
        assertEquals("I am a JS Alert", alertText);
        // Нажимаем OK
        alert.accept();
        String expectedResultField = "You successfully clicked an alert";
        String actualResultField = driver.findElement(By.id("result")).getText();
        assertEquals("The current message on the RESULT field", expectedResultField, actualResultField);
    }

    @Test
    public void testJSConfirmButton() {
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        // Переключаемся на confirm
        Alert confirm = driver.switchTo().alert();
        String alertConfirmText = confirm.getText();
        assertEquals("I am a JS Confirm", alertConfirmText);
        //нажимаем cancel
        confirm.dismiss();
        String actualResultFieldConfirm = driver.findElement(By.id("result")).getText();
        assertEquals("You clicked: Cancel", actualResultFieldConfirm);
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        confirm.accept();
        String actualResultFieldConfirmAlert = driver.findElement(By.id("result")).getText();
        assertEquals("You clicked: Ok", actualResultFieldConfirmAlert);
    }

    @Test
    public void testJSPrompt() {
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Alert prompt = driver.switchTo().alert();
        String alertPromptText = prompt.getText();
        assertEquals("I am a JS prompt", alertPromptText);
        prompt.dismiss();
        String actualResultFieldPrompt = driver.findElement(By.id("result")).getText();
        assertEquals("You entered: null", actualResultFieldPrompt);
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        prompt.sendKeys("Hello, World!");
        prompt.accept();
        String actualResultFieldPromptAlert = driver.findElement(By.id("result")).getText();
        assertEquals("You entered: Hello, World!", actualResultFieldPromptAlert);
    }

    @AfterClass
    public static void tearDown() {
        // Закрытие браузера после завершения тестов
        if (driver != null) {
            driver.quit();
        }
    }
}
