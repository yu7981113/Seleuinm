package cn.itcast.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class 获取文本 {
    ChromeDriver driver =null;

    @BeforeMethod
    //设置谷歌路径
    public void closedChrome(){
        System.setProperty("webdriver.chrome.driver","E:\\DaiMa\\Seleuinm\\dirvers\\chromedriver.exe");
         driver = new ChromeDriver();
    }
    @AfterMethod
    //关闭浏览器
    public void quit(){
        driver.quit();
    }
    @Test
    public void openChrome() throws InterruptedException {

        driver.get("file://C:/Users/Ylq/Desktop/selenium_html/index.html");
        Thread.sleep(3000);

    }
    @Test
    //输入
    public void Input() throws InterruptedException {

        driver.get("file://C:/Users/Ylq/Desktop/selenium_html/index.html");

        WebElement element = driver.findElement(By.xpath("//*[@id='input']/input"));
        element.sendKeys("渤海大晒照");
        Thread.sleep(3000);

    }
    @Test
    //点击
    public void Link() throws InterruptedException {

        driver.get("file://C:/Users/Ylq/Desktop/selenium_html/index.html");

        WebElement element = driver.findElement(By.xpath("//*[@id='link']/a"));
        element.click();
        Thread.sleep(3000);
    }
    @Test
    //点击
    public void Alert() throws InterruptedException {

        driver.get("file://C:/Users/Ylq/Desktop/selenium_html/index.html");

        WebElement element = driver.findElement(By.xpath("//*[@id='alert']/input"));
        element.click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);

        alert.accept();

    }
    @Test
    public void Iframe() throws InterruptedException {

        driver.get("file://C:/Users/Ylq/Desktop/selenium_html/index.html");
        WebElement element = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(element);
        driver.findElement(By.xpath("//*[@id=\"link\"]/a")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
    }
    @Test
    public void RadioBox() throws InterruptedException {

        driver.get("file://C:/Users/Ylq/Desktop/selenium_html/index.html");
        driver.findElement(By.xpath("//*[@id=\"link\"]/a")).click();
        String handle = driver.getWindowHandle();
        for (String handles :driver.getWindowHandles()){
            if (handles.equals(handle)){
                continue;
            }else {
                driver.switchTo().window(handles);
            }

            }
        String title = driver.getTitle();
        System.out.println(title);
    }



}
