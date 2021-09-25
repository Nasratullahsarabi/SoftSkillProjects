package com.jUnit.userStory6;

import com.selenium.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class LibrarianSelectUserStatus extends TestBase {

//    Given librarian is on the homePage
//    When librarian click Users module
//    And librarian click Status dropdown
//    Then verify there are 2 status options
    @Test
    public void librarianSelectUserStatus() throws InterruptedException {
        driver.get("https://library2.cybertekschool.com/login.html");
        String user = "librarian51@library";
        String password = "Sdet2022*";

        driver.findElement(By.id("inputEmail")).sendKeys(user);
        driver.findElement(By.id("inputPassword")).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[.='Sign in']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[.='Users']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("user_status")).click(); // User Status button
        Thread.sleep(3000);
    }
}
