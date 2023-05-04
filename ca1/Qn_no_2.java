package ca1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Qn_no_2 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriverManager.edgedriver().setup();
      EdgeOptions co=new EdgeOptions();
      co.addArguments("--remote-allow-origins=*");
      WebDriver driver=new EdgeDriver(co);
      driver.get("https://www.amazon.in");
      driver.manage().window().maximize();
      String tit=driver.getTitle();
      System.out.println(tit);
      Assert.assertEquals(tit, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nail cutter");
      driver.findElement(By.id("nav-search-submit-button")).click();
      System.out.println(driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span")).getText());
      System.out.println(driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[1]/h2")).getText());
      System.out.println(driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span")).getText());
      System.out.println(driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span")).getText());
//      JavascriptExecutor js1=(JavascriptExecutor)driver;
//	   js1.executeScript("window.scrollBy(0,200)","");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
      driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_1\"]")).click();
    
      //System.out.println(driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span")).getText());

	}
}
