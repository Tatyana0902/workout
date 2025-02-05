package com.smirnov.workout;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.*;

public class LoginAndRegistrationTest {
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver-win32\\chromedriver.exe");
        // Инициализация драйвера
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*"); // Allow all origins
        driver = new ChromeDriver(options);
        //driver.manage().window().maximize(); // Разворачиваем окно браузера
    }

    @Test
    public void testLogin() {
        driver.get(getClass().getClassLoader().getResource("qa-test.html").toString());
        WebElement emailField = driver.findElement(By.id("loginEmail"));
        emailField.sendKeys("test@protei.ru");

        WebElement passwordField = driver.findElement(By.id("loginPassword"));
        passwordField.sendKeys("test");

        WebElement loginButton = driver.findElement(By.id("authButton"));
        loginButton.click();
//Email
        // Ожидаемый текст после входа
        String expectedEmailText = "E-Mail:"; // Замените на ожидаемый текст
        //Получение фактического текста элемента после входа
        WebElement dataEmail = driver.findElement(By.xpath("//*[contains(@class, 'uk-form-label') and @for='dataEmail']"));
        String actualEmailText = dataEmail.getText();
        // Проверка равенства ожидаемого и фактического текста
        assertEquals("The current field must be on the page", expectedEmailText, actualEmailText);

        WebElement emailFieldTwo = driver.findElement(By.id("dataEmail"));
        // Получаем текущее значение поля ввода
        String emailValue = emailFieldTwo.getAttribute("value");
        
        // Проверяем, что поле ввода пустое
        assertEquals("emailFieldTwo field should be empty", "", emailValue);
//Name
        // Ожидаемый текст после входа
        String expectedNameText = "Имя:"; // Замените на ожидаемый текст
        //Получение фактического текста элемента после входа
        WebElement dataName = driver.findElement(By.xpath("//*[contains(@class, 'uk-form-label') and @for='dataName']"));
        String actualNameText = dataName.getText();
        // Проверка равенства ожидаемого и фактического текста
        assertEquals("The current field must be on the page", expectedNameText, actualNameText);

        WebElement NameField = driver.findElement(By.id("dataName"));
        // Получаем текущее значение поля ввода
        String NameValue = NameField.getAttribute("value");
        // Проверяем, что поле ввода пустое
        assertEquals("NameField field should be empty", "", NameValue);
//Gender
        // Ожидаемый текст после входа
        String expectedGenderText = "Пол:"; // Замените на ожидаемый текст
        //Получение фактического текста элемента после входа
        WebElement dataGender = driver.findElement(By.xpath("//*[contains(@class, 'uk-form-label') and @for='dataGender']"));
        String actualGenderText = dataGender.getText();
        // Проверка равенства ожидаемого и фактического текста
        assertEquals("The current field must be on the page", expectedGenderText, actualGenderText);

        // Находим элемент select по ID
        WebElement selectElement = driver.findElement(By.id("dataGender"));
        // Создаем объект Select
        Select select = new Select(selectElement);

        // Получаем все доступные опции
        List<WebElement> options = select.getOptions();

        Assert.assertEquals("Мужской", options.get(0).getText());
        Assert.assertEquals("Женский", options.get(1).getText());

        WebElement checkbox1 = driver.findElement(By.id("dataCheck11"));
        // Проверяем, что чекбокс не отмечен (пустой)
        assertFalse("Checkbox should be unchecked", checkbox1.isSelected());
        WebElement checkbox2 = driver.findElement(By.id("dataCheck12"));
        assertFalse("Checkbox should be unchecked", checkbox2.isSelected());

        WebElement radio1 = driver.findElement(By.id("dataSelect21"));
        // Проверяем, что чекбокс не отмечен (пустой)
        assertFalse("Checkbox should be unchecked", radio1.isSelected());
        WebElement radio2 = driver.findElement(By.id("dataSelect22"));
        assertFalse("Checkbox should be unchecked", radio2.isSelected());
        WebElement radio3 = driver.findElement(By.id("dataSelect23"));
        assertFalse("Checkbox should be unchecked", radio3.isSelected());

        WebElement add = driver.findElement(By.id("dataSend"));
        assertTrue("Button should be is active", add.isEnabled());
//Table
        WebElement table = driver.findElement(By.id("dataTable"));
        WebElement thead = table.findElement(By.tagName("thead"));
        List<WebElement> rows = thead.findElements(By.tagName("tr"));
        WebElement row1 = rows.get(0);
        List<WebElement> list = row1.findElements(By.tagName("th"));

        assertEquals("The current field must be on the page", "E-Mail", list.get(0).getText());
        assertEquals("The current field must be on the page", "Имя", list.get(1).getText());
        assertEquals("The current field must be on the page", "Пол", list.get(2).getText());
        assertEquals("The current field must be on the page", "Выбор 1", list.get(3).getText());
        assertEquals("The current field must be on the page", "Выбор 2", list.get(4).getText());

        emailFieldTwo.sendKeys("test@protei.ru");
        NameField.sendKeys("test");
        WebElement checkbox = driver.findElement(By.id("dataCheck11"));
        checkbox.click();
        WebElement radioGroup = driver.findElement(By.id("dataSelect22"));
        radioGroup.click();
        add.click();

        // Create WebDriverWait instance
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds timeout

        // Wait for the alert to be present
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("uk-modal-dialog")));

        // Проверяем, что модальное окно отображается
        driver.findElement(By.xpath("//*[contains(@class, 'uk-margin uk-modal-content')]")); // Замените на CSS-селектор вашего текста

        // Проверка текста в модальном окне
        wait.until(ExpectedConditions.textToBe(By.xpath("//*[contains(@class, 'uk-margin uk-modal-content')]"), "Данные добавлены."));

        // Закрытие модального окна (например, нажатием на кнопку "OK")
        WebElement closeButton = driver.findElement(By.xpath("//button[@class=\"uk-button uk-button-primary uk-modal-close\"]")); // Замените на селектор вашей кнопки закрытия
        closeButton.click();


        // Проверка, что модальное окно закрыто
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("uk-modal-dialog")));
        //Table
        WebElement tbody = table.findElement(By.tagName("tbody"));
        List<WebElement> addedUsers = tbody.findElements(By.tagName("tr"));
        WebElement user1 = addedUsers.get(0);
        List<WebElement> user1Td = user1.findElements(By.tagName("td"));
        assertEquals( "test@protei.ru", user1Td.get(0).getText());
        assertEquals( "test", user1Td.get(1).getText());
        assertEquals( "Мужской", user1Td.get(2).getText());
        assertEquals( "1.1", user1Td.get(3).getText());
        assertEquals( "2.2", user1Td.get(4).getText());
    }

    @AfterClass
    public static void tearDown() {
        // Закрытие браузера после завершения тестов
        if (driver != null) {
            driver.quit();
        }
    }

}


