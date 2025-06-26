package JavaProgram;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        System.out.println("Title"+driver.getTitle());
        System.out.println("Current url"+driver.getCurrentUrl());

        // getpagesource
       System.out.println(driver.getPageSource());

    }
}
