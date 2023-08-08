package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ujianmingguan {
    public static void main(String[] args) {
        String path = "D:\\MyTools\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", "C:\\MyTools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get(" https://shop.demoqa.com");
        driver.manage().window().fullscreen();
        System.out.println("Open Browser, Open URL");

      String titlePage = driver.findElement(By.className("main-header")).getText();
        System.out.println(titlePage);
        String titleHeader = driver.getTitle();
       System.out.println(titleHeader);
        driver.findElement(By.name("username")).sendKeys("Juara Coding");
        driver.findElement(By.name("Email")).sendKeys("Infor@JuaraCoding");
        driver.findElement(By.name("Password")).sendKeys("Juaracoding123");
        driver.findElement(By.xpath("//input [@Class = 'noo-container-shop noo-shop-wrap']")).sendKeys("noo-container-catalog");
        driver.findElement(By.xpath("//button [@Class = 'noo-container-catalog]")).click();
        // driver.findElement(By.id("permanentAddress")).sendKeys("Jakarta");
        js.executeScript("windows.scrollBy(0,500)"); // scroll vertical 500px

        driver.findElement(By.name("log in")).click();

        // buat assert menggunakan if//

        if (titlePage.equalsIgnoreCase("Text Box")) {
            System.out.println("Status : Pass");
        } else{
            System.out.println("Status Testing");
        }
        delay();

         driver.quit();
        System.out.println("Quit Browser"); }

    public static void delay (){
        try {
            Thread.sleep(3000); // untuk delay close selama 3detik
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}