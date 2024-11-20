package com.smirnov.workout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;

public class SimpleSeleniumExample {
    public static void main(String[] args) throws IOException {
        // Set system property for ChromeDriver if not added to PATH
        System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver-win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*"); // Allow all origins
        WebDriver driver = new ChromeDriver(options);

        driver.get("file:///C:/Users/tania/Documents/%D0%A0%D0%B0%D0%B1%D0%BE%D1%82%D0%B0/%D1%82%D0%B5%D1%81%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5/qa-test.html");
        System.out.println("Page title is: " + driver.getTitle());

        // login form
        WebElement emailField = driver.findElement(By.id("loginEmail"));
        emailField.sendKeys("test@protei.ru");

        WebElement passwordField = driver.findElement(By.id("loginPassword"));
        passwordField.sendKeys("test");

        WebElement loginButton = driver.findElement(By.id("authButton"));
        loginButton.click();

        // add user form
        WebElement email1Field = driver.findElement(By.id("dataEmail"));
        email1Field.sendKeys("test@protei.ru");

        WebElement dataField = driver.findElement(By.id("dataName"));
        dataField.sendKeys("test");

        WebElement dropdownElement = driver.findElement(By.id("dataGender"));

        // Create a Select object
        Select dropdown = new Select(dropdownElement);

        // Select an option by visible text
        dropdown.selectByVisibleText("Женский");

        WebElement checkbox = driver.findElement(By.id("dataCheck11"));
        checkbox.click();

        WebElement radioGroup = driver.findElement(By.id("dataSelect22"));
        radioGroup.click();

        WebElement dataSend = driver.findElement(By.id("dataSend"));
        dataSend.click();

        //uk-button uk-button-primary uk-modal-close
        WebElement okButton = driver.findElement(By.xpath("//button[@class=\"uk-button uk-button-primary uk-modal-close\"]"));
        okButton.click();

        WebElement table = driver.findElement(By.id("dataTable"));
        WebElement tbody = table.findElement(By.tagName("tbody"));
        List<WebElement> rows = tbody.findElements(By.tagName("tr"));
        WebElement row1 = rows.get(0);
        List<WebElement> columns = row1.findElements(By.tagName("td"));
        WebElement column1 = columns.get(0);
        System.out.println(column1.getText());

        System.in.read();
        driver.quit();
    }
}