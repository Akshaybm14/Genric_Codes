
package main1.generic;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchList {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/wildjasmine/Desktop/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.google.com");
        driver.findElement(By.id("lst-ib")).sendKeys("java");
       
        String index="//div[contains(text(),'java')]";
        List<WebElement> lst = driver.findElements(By.xpath(index));
      
        int count=lst.size();
        System.out.println("total number of count is ="+count);
          WebElement clk=lst.get(2);//select the element in the 5th position 
          String text=clk.getText();//get the text value and store in in a variable
          System.out.println("The selected text is= "+text);//print the stored text
          clk.click();//click on the selected webelement 
        /*//this loop is to get all the text displayed 
        for(int i=0;i<=count-1;i++){
            WebElement ast=lst.get(i);
            String text=ast.getText();
            System.out.println("");
            System.out.println(text);
            
        }*/
       
        
    }
}
