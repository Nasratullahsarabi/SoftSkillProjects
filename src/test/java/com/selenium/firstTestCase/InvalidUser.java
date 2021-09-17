package com.selenium.firstTestCase;

import com.selenium.utility.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class InvalidUser extends TestBase {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://library2.cybertekschool.com/login.html");

        String userName1 = "student38@library";
        String userName2 = "studentK39@library";
        String userName3 = "studentM40@library";

        String pass1 = "Sdet2022";
        String pass2 = "Sdet2022*";
        String pass3 = "Sdet2023";

        ArrayList<String> users = new ArrayList<>();
        users.add(userName1);
        users.add(userName2);
        users.add(userName3);

        ArrayList<String> passwordList = new ArrayList<>();
        passwordList.add(pass1);
        passwordList.add(pass2);
        passwordList.add(pass3);

        for (int i = 0; i < users.size(); i++) {
            WebElement userName = driver.findElement(By.id("inputEmail"));
            userName.sendKeys(users.get(i));
            WebElement password = driver.findElement(By.id("inputPassword"));
            password.sendKeys(passwordList.get(i));
            password.submit();
            Thread.sleep(1000);
            userName.clear();
            password.clear();
            Thread.sleep(1000);
        }

    }
    @Test
    public void test(){
        String actualMsg = "Sorry, Wrong Email or Password";
        WebElement message = driver.findElement(By.cssSelector("div>div[class='alert alert-danger']"));


    }
}
