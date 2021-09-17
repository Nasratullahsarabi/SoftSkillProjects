package com.softSkill.firstTestCase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class LibrarianLogIn {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://library2.cybertekschool.com/login.html");

        if (driver.getTitle().equals("Login - Library")){
            System.out.println("Log in title matches with expected result");
        }else {
            System.out.println("Log in title doesn't match with expected result");
        }

        String userName1 = "librarian51@library";
        String userName2 = "librarian52@library";

        ArrayList<String> users = new ArrayList<>();
        users.add(userName1);
        users.add(userName2);

        for (String eachUser : users) {
            WebElement userName = driver.findElement(By.id("inputEmail"));
            userName.sendKeys(eachUser);
            WebElement password = driver.findElement(By.id("inputPassword"));
            password.sendKeys("Sdet2022*");
            password.submit();
            Thread.sleep(2000);
            WebElement logOutBtn = driver.findElement(By.id("user_avatar"));
            logOutBtn.click();
            Thread.sleep(2000);
            List<WebElement> all = driver.findElements(By.className("title"));
            Thread.sleep(2000);
            System.out.println("number of modules on the page " + all.size());
            WebElement logOut = driver.findElement(By.linkText("Log Out"));
            logOut.click();
            Thread.sleep(2000);
        }

        driver.quit();
    }
}
