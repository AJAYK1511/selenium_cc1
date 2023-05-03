package cc2_qns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class qnno1 {
	@Test
	public static void main( String[] args ) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(1000);
        //String cartCount = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")).getText();
        
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
        Thread.sleep(1000);
        String product1 = "Sauce Labs Backpack";
        Thread.sleep(1000);
        driver.findElement(By.id("checkout")).click();
        
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Ajay");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("K");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("621713");
        Thread.sleep(1000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(1000);
        String tit="Swag Labs";
        Assert.assertEquals(tit,driver.getTitle());
        String url="https://www.saucedemo.com/checkout-step-two.html";
        Assert.assertEquals(url, driver.getCurrentUrl());
        Thread.sleep(1000);
        System.out.println("Name : " + driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div")).getText());
        System.out.println("Price : " + driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div")).getText());
        
        driver.findElement(By.id("finish")).click();
    } 
}