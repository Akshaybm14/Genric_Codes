package main1.generic;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreen {
public static WebDriver driver;

public static void TakeScreen(String name) throws IOException{
    String folder="/home/wildjasmine/NetBeansProjects/MAVEN1/snapshot";
    DateFormat date=new SimpleDateFormat("dd-mm-yyyy "+"="+"h-m-s");
    Date d=new Date();
    String path=folder+name+date.format(d)+".png";
    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File(path));
}


 /*   public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "/home/wildjasmine/Desktop/chromedriver");
        driver=new ChromeDriver();
        driver.get("http://www.google.com");
    try {
        Thread.sleep(5000);
    } catch (InterruptedException ex) {
        System.out.println("Screenshot successfullly captures");
    }
        TakeScreen("Test");
               
    }*/
}

    

