package com.selenium.secondTestCase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LibrarianAdd_A_Book {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://library2.cybertekschool.com/login.html");

        String userName1 = "librarian51@library";
        String userName2 = "librarian52@library";
        String password1 = "Sdet2022*";

        WebElement user = driver.findElement(By.cssSelector("input[type='email']"));
        user.sendKeys(userName1);

        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
        password.sendKeys(password1);

        WebElement singIn = driver.findElement(By.cssSelector("button[type='submit']"));
        singIn.click();
        Thread.sleep(4000);
        WebElement books = driver.findElement(By.linkText("Books"));
        Thread.sleep(2000);
        books.click();
        Thread.sleep(2000);
        WebElement addBook = driver.findElement(By.cssSelector(".portlet-title [aria-hidden]"));
        addBook.click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Soft Skill");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='year']")).sendKeys("2021");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='author']")).sendKeys("Christina");
        Thread.sleep(2000);
        WebElement catagori = driver.findElement(By.xpath("//*[@id=\"book_group_id\"]"));
        Select catObj = new Select(catagori);
        catObj.selectByVisibleText("Science Fiction");
        Thread.sleep(3000);
        WebElement saveChanges = driver.findElement(By.xpath("//button[text()='Save changes']"));
        saveChanges.click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='search']")).sendKeys("Soft Skill");

    }
}
