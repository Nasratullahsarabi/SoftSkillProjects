package com.jUnit.userStory3;

import com.selenium.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibrarianAddBook2 extends TestBase {

 //   Given librarian is on the homePage
    //   When librarian click Books module
    //   And librarian click “+Add Book” button
    //   When librarian enter BookName, ISBN, Year, Author, and Description
    //   And librarian click save changes
    //   Then verify a new book is added

    @Test
    public void librarianAddBook() throws InterruptedException {
        driver.get("https://library2.cybertekschool.com/login.html");

        String emailAdd1 = "librarian51@library";
        String emailAdd2 = "librarian52@library";
        String password = "Sdet2022*";
        int a = 4;
        List<String> users = new ArrayList<>(Arrays.asList(emailAdd1,emailAdd2));

            driver.findElement(By.id("inputEmail")).sendKeys(emailAdd1);
            driver.findElement(By.id("inputPassword")).sendKeys(password);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[.='Sign in']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//span[text()='Books']")).click();
        Thread.sleep(1000);
        System.out.println("before adding = " + driver.findElement(By.xpath("//div[@id='tbl_books_info']")).getText());

            driver.findElement(By.cssSelector("a[class='btn btn-lg btn-outline btn-primary btn-sm add_book_btn']")).click();
            driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Horror");
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("input[name='isbn']")).sendKeys("Horror");
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("input[name='year']")).sendKeys("Horror");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("input[name='author']")).sendKeys("Horror"+a);
            Thread.sleep(1000);
            Select bookCategori = new Select(driver.findElement(By.xpath("//select[@id='book_group_id']")));
            bookCategori.selectByIndex(a++);
            Thread.sleep(1000);
            driver.findElement(By.id("description")).sendKeys("First edition");
            driver.findElement(By.xpath("//button[.='Save changes']")).click();
            Thread.sleep(6000);
            System.out.println("after book added = " + driver.findElement(By.xpath("//div[@id='tbl_books_info']")).getText());
            Thread.sleep(1000);

        }
}
