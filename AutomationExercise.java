package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AutomationExercise {
    static WebDriverWait wait;
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.findElement(By.linkText("Signup / Login")).click();

        driver.findElement(By.name("name")).sendKeys("Tony");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("tony123@example.com");
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.id("password")).sendKeys("Test1234!");
        driver.findElement(By.id("first_name")).sendKeys("Tony");
        driver.findElement(By.id("last_name")).sendKeys("Sun");
        driver.findElement(By.id("address1")).sendKeys("Washington, USA");
        driver.findElement(By.id("state")).sendKeys("Seattle");
        driver.findElement(By.id("city")).sendKeys("Washington");
        driver.findElement(By.id("zipcode")).sendKeys("98039");
        driver.findElement(By.id("mobile_number")).sendKeys("+1-424-231-6794");
        driver.findElement(By.xpath("//button[@data-qa='create-account']")).submit();
        driver.findElement(By.xpath("//button[@data-qa='continue']")).submit();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("tonytest123@example.com");
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("Test1234!");
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


        driver.findElement(By.xpath("//a[@href=\"/products\"]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.findElement(By.xpath("(//[normalize-space() ='Add to cart'])")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.findElement(By.linkText("Cart")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


        List<WebElement> cartItems = driver.findElements(By.className("cart_description"));
        if (!cartItems.isEmpty()) {
            System.out.println("Item have been added to basket");
        } else {
            System.out.println("Item could not added to basket");
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.findElement(By.xpath("//a[normalize-space()=\"Proceed To Checkout\"]")).submit();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.findElement(By.className("Place Order")).submit();

        driver.quit();
    }
}


