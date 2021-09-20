package com.jUnit.userStory1;

import com.selenium.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentLogsIn extends TestBase {

    //Given student is on the loginPage
// Then verify that the URL is “https://library2.cybertekschool.com/login.html”
// When student enters valid email address and password
// And student click sign in button
// Then verify that there are 2 models on the page

    @Test
    public void studentLogsIn1() {
        driver.get("https://library2.cybertekschool.com/login.html");

        String actualResult = "https://library2.cybertekschool.com/login.html";
        String expectedResult = driver.getCurrentUrl();
        Assertions.assertEquals(actualResult,expectedResult);

    }

    @Test
    public void studentLogsIn2() throws InterruptedException {
        driver.get("https://library2.cybertekschool.com/login.html");
        String email1 = "student38@library";
        String email2 = "student39@library";
        String email3 = "student40@library";

        String password = "Sdet2022*";

        List<String> users = new ArrayList<>(Arrays.asList(email1,email2,email3));

        for (String eachUser : users) {
            driver.findElement(By.xpath("//input[@type='email']")).sendKeys(eachUser);
            driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@class='nav-link dropdown-toggle']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='dropdown-item']")).click();
            Thread.sleep(1000);
        }
    }

}
