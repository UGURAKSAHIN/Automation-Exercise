package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AutomationExercise {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test(priority = 1)
    public void signUpTest() {
        driver.get("https://automationexercise.com/");
        driver.findElement(By.cssSelector("a[href='/login']")).click();

        driver.findElement(By.name("name")).sendKeys("Timur");
        driver.findElement(By.cssSelector("input[data-qa='signup-email']")).sendKeys("timus1903@gmail.com");
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();

        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("password")).sendKeys("Test1234?");
        driver.findElement(By.id("days")).sendKeys("18");
        driver.findElement(By.id("months")).sendKeys("04");
        driver.findElement(By.id("years")).sendKeys("1995");
        driver.findElement(By.id("first_name")).sendKeys("Timur");
        driver.findElement(By.id("last_name")).sendKeys("Stark");
        driver.findElement(By.id("company")).sendKeys("Projector");
        driver.findElement(By.id("address1")).sendKeys("Capitol Hill");
        driver.findElement(By.id("country")).sendKeys("USA");
        driver.findElement(By.id("state")).sendKeys("Washington");
        driver.findElement(By.id("city")).sendKeys("Seattle");
        driver.findElement(By.id("zipcode")).sendKeys("98039");
        driver.findElement(By.id("mobile_number")).sendKeys("+1-424-235-7390");
    }

    @Test(priority = 2)
    public void loginTest() {
        driver.get("https://automationexercise.com/");
        driver.findElement(By.cssSelector("a[href='/login']")).click();

        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("timus1903@gmail.com");
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("Test1234?");
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Cart"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cart_description")));

        List<WebElement> cartItems = driver.findElements(By.className("cart_description"));
        Assert.assertFalse(cartItems.isEmpty(), "Could not added product");

    }
    

    public void addProductToCart(String productId) {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[data-product-id='" + productId + "']"))).click();
    }


    @Test(priority = 4)
    public void checkoutTest() {
        driver.findElement(By.xpath("//a[normalize-space()='Proceed To Checkout']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Place Order']"))).click();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}


