package com.softSkill.firstTestCase;

import com.softSkill.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class JunitTest extends TestBase {

    @Test
    public void invalidUser(){

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
            userName.clear();
            password.clear();
        }

        String expectedResult = "Sorry, Wrong Email or Password";
        WebElement message = driver.findElement(By.cssSelector("div>div[class='alert alert-danger']"));
        String actualResult = message.getText();
        Assertions.assertEquals(actualResult,expectedResult);
    }
}
