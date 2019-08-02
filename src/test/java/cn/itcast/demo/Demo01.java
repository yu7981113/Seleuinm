package cn.itcast.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo01 {

    @Test
    public void oppenFF(){
        WebDriver webDriver=new FirefoxDriver();
    }
    @Test
    //打开火狐浏览器
    public void oppenff2(){
        System.setProperty("webdriver.firefox.bin","D:\\Firefox\\firefox.exe");
        WebDriver webDriver=new FirefoxDriver();

    }
    @Test
    //打开谷歌浏览器
    public void closedChrome(){
        System.setProperty("webdriver.chrome.driver","E:\\DaiMa\\Seleuinm\\dirvers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.quit();


    }
}
