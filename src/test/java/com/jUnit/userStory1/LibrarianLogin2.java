package com.jUnit.userStory1;

import com.selenium.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibrarianLogin2 extends TestBase {

//    Given librarian is on the loginPage
//    Then verify that the title is “Login - Library”

//    When librarian enters valid email address and password
//    And librarian click sign in button
//    Then verify that there are 3 models on the page

    @Test
    public void librarianOnTheHomePage() throws InterruptedException {

        driver.get("https://library2.cybertekschool.com/login.html");

        String actualResult = "Login - Library";
        String expectedResult = driver.getTitle();
        assertEquals(actualResult, expectedResult);
        Thread.sleep(1000);
        String emailAdd1 = "librarian51@library";
        String emailAdd2 = "librarian52@library";
        String password = "Sdet2022*";

        List<String> users = new ArrayList<>(Arrays.asList(emailAdd1,emailAdd2));

        for (String eachUser : users) {
            driver.findElement(By.id("inputEmail")).sendKeys(eachUser);
            driver.findElement(By.id("inputPassword")).sendKeys(password);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[.='Sign in']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='nav-link dropdown-toggle']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='dropdown-item']")).click();
            Thread.sleep(1000);
        }
    }

}
