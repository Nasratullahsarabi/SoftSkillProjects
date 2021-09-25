package com.jUnit.userStory7;

import com.selenium.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AcNumberTwo extends TestBase {

//    Given user is on the homePage
//    When user click Books module
//    And user click book category dropdown
//    Then verify there are 21 options

    @Test
    public void userClicksBookModule() throws InterruptedException {
        driver.get("https://library2.cybertekschool.com/login.html");
        String user = "librarian51@library";
        String password = "Sdet2022*";

        driver.findElement(By.id("inputEmail")).sendKeys(user);
        driver.findElement(By.id("inputPassword")).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[.='Sign in']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='Books']")).click();
        Thread.sleep(2000);
        WebElement book_categories = driver.findElement(By.id("book_categories"));
        book_categories.click();
        Thread.sleep(2000);
        Select select = new Select(book_categories);
        select.selectByVisibleText("Drama");
        Thread.sleep(5000);

    }
}
