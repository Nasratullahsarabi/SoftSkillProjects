package com.jUnit.userStory2;

import com.selenium.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibrarianAddUser extends TestBase {
//    Given librarian is on the homePage
//    When librarian click Users module
//    And librarian click “+Add User” button
//    When librarian enter full name, password, email and
//    address
//    And librarian click save changes
//    Then verify a new user is created
@Test
    public void studentLogin() throws InterruptedException {
    driver.get("https://library2.cybertekschool.com/login.html");

    String emailAdd1 = "librarian51@library";
    String emailAdd2 = "librarian52@library";
    String password = "Sdet2022*";

    List<String> users = new ArrayList<>(Arrays.asList(emailAdd1,emailAdd2));

    int a = 1;
    int j = 0;
    for (String eachUser : users) {
        driver.findElement(By.id("inputEmail")).sendKeys(eachUser);
        driver.findElement(By.id("inputPassword")).sendKeys(password);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Sign in']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div//span[.='Users']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='btn btn-lg btn-outline btn-primary btn-sm']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='full_name']")).sendKeys("Rambo");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Rambo");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("uqky"+a+".@gmail.com");
        a++;
        Select select = new Select(driver.findElement(By.id("user_group_id")));
        select.selectByIndex(j);
        Thread.sleep(2000);

        Select select1 = new Select(driver.findElement(By.id("status")));
        select1.selectByIndex(j);
        j++;
       driver.findElement(By.id("address")).sendKeys("324 4th Ave, San Diego, CA 87659");
        Thread.sleep(3000);
       driver.findElement(By.xpath("//button[text()='Save changes']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@class='nav-link dropdown-toggle']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='dropdown-item']")).click();
        Thread.sleep(1000);

    }
}
}
