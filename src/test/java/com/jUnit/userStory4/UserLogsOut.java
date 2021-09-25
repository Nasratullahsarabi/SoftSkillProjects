package com.jUnit.userStory4;

import com.selenium.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserLogsOut extends TestBase {

//    Given user is on the homePage
//    When user click username on the right top corner
//    And user click Log Out
//    Then verify user navigate back to login page.

    @Test
    public void userLogsOut() throws InterruptedException {
        driver.get("https://library2.cybertekschool.com/login.html");
        String user1 = "librarian51@library",
                user2 = "librarian52@library",
                user3 = "student38@library",
                user4 = "student39@library",
                user5 = "student40@library";
        String password = "Sdet2022*";

        List<String> list = new ArrayList<>(Arrays.asList(user1,user2,user3,user4,user5));
        for (String eachUser : list) {
            driver.findElement(By.id("inputEmail")).sendKeys(eachUser);
            driver.findElement(By.id("inputPassword")).sendKeys(password);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[.='Sign in']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='nav-link dropdown-toggle']")).click(); // log out
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='dropdown-item']")).click(); // log out
            Thread.sleep(1000);
            String actualResult = "Login - Library";
            String expectedResult = driver.getTitle();
            Assertions.assertEquals(actualResult, expectedResult);
        }
    }
}
