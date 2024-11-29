/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author maisu
 */
public class KumonTest {
    
  private WebDriver driver;
  private String baseUrl;
    
    public KumonTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    
    System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
    driver = new ChromeDriver();
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
        driver.close();
    }
    
    @Test
  public void testKumonTestCase() throws Exception {
    driver.get("https://www.kumon.com/");
    driver.findElement(By.linkText("FIND A CENTER")).click();
    driver.findElement(By.xpath("//div[@id='divSearchHeader']/div/div/div")).click();
    driver.findElement(By.id("mapautocomplete")).clear();
    driver.findElement(By.id("mapautocomplete")).sendKeys("94513");
    
  }
    
}
