package pages;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class websiteUrl {
    WebDriver driver;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        
    }

    @Test
    public void urlOpen(){
        driver.get("https://www.google.co.in/");
    }

    @After
    public void tearDown()
    {
        driver.close();
        driver.quit();
    }
}
