package com.jUnit.userStory5;

import com.selenium.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class LibrarianSelectUserGroup extends TestBase {

//    Given librarian is on the homePage
//    When librarian click Users module
//    And librarian click user group dropdown
//    Then verify librarian have 3 options
    @Test
    public void librarianSelectUserGroup() throws InterruptedException {
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
        driver.findElement(By.id("user_groups")).click(); // User Group button
        Thread.sleep(3000);

    }
}
