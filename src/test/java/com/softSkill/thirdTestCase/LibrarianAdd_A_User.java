package com.softSkill.thirdTestCase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibrarianAdd_A_User {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://library2.cybertekschool.com/login.html");

        WebElement userName = driver.findElement(By.id("inputEmail"));
        userName.sendKeys("librarian51@library");
        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("Sdet2022*");
        password.submit();
        Thread.sleep(3000);
        WebElement userBtn = driver.findElement(By.linkText("Users"));
        Thread.sleep(2000);
        userBtn.click();
        Thread.sleep(2000);
        WebElement addUser = driver.findElement(By.linkText("Add User"));
        Thread.sleep(2000);
        addUser.click();
        Thread.sleep(2000);
        WebElement fullName = driver.findElement(By.name("full_name"));
        fullName.sendKeys("Ben Hash");
        Thread.sleep(2000);
        WebElement password2 = driver.findElement(By.name("password"));
        password2.sendKeys("Kar12%9lj");
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("ben_hash@gmail.com");

        Thread.sleep(4000);
        driver.manage().window().maximize();
        WebElement scrolDown = driver.findElement(By.className("modal-footer"));
        Thread.sleep(2000);
        scrolDown.click();
        Thread.sleep(2000);
        WebElement saveChange = driver.findElement(By.cssSelector("button[type='submit']"));
        saveChange.click();
    }
}
