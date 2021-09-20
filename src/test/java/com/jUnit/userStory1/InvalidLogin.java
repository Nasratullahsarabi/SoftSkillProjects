package com.jUnit.userStory1;

import com.selenium.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InvalidLogin extends TestBase {

 //   Given user is on the loginPage
 //   When user enters invalid email address or password
 //   And student click sign in button
 //   Then verify the error message “Sorry, Wrong Email or Password”

    @Test
   public void invalidUser() throws InterruptedException {
    driver.get("https://library2.cybertekschool.com/login.html");
    String email1 = "student38@library";
    String email2 = "student49@library";
    String email3 = "student50@library";

    String password1 = "Sdet2022";
    String password2 = "Sdet2022*";
    String password3 = "Sdet222*";

        List<String> emails = new ArrayList<>(Arrays.asList(email1,email2,email3));
        List<String> password = new ArrayList<>(Arrays.asList(password1,password2,password3));

        for (int i = 0; i < emails.size(); i++) {

            driver.findElement(By.xpath("//input[@type='email']")).sendKeys(emails.get(i));
            driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password.get(i));
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@type='email']")).clear();
            driver.findElement(By.cssSelector("input[type='password']")).clear();

            WebElement msg = driver.findElement(By.xpath("//div[.='Sorry, Wrong Email or Password']"));
            String expectedResult = msg.getText();
            String actualResult = "Sorry, Wrong Email or Password";

            Assertions.assertEquals(actualResult,expectedResult);

        }

    }
}
