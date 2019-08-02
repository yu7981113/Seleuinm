package cn.itcast.demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dakaibd {
    @Test
    //打开谷歌浏览器
    public void closedChrome() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","E:\\DaiMa\\Seleuinm\\dirvers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com/");
        Thread.sleep(3000);
        String title = driver.getCurrentUrl();
        System.out.println(title);
        driver.quit();

    }
}
