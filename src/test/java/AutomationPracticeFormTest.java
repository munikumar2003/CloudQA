import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

public class AutomationPracticeFormTest {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://app.cloudqa.io/home/AutomationPracticeForm");
    }

    @AfterMethod
    public void tearDown(){
        if(driver!=null){
            try{
                driver.quit();
            }catch(Throwable ignore){}
        }
    }

    @Test
    public void testFirstName(){
        WebElement firstNameInput = driver.findElement(By.xpath(
                "//label[contains(text(),'First Name')]/following::input[1]"
        ));
        firstNameInput.clear();
        firstNameInput.sendKeys("Muni");
        Assert.assertEquals(firstNameInput.getAttribute("value"), "Muni");
    }

    @Test
    public void testGender(){
        WebElement genderLabel = driver.findElement(By.xpath("//span[text()='Male']"));
        WebElement genderRadioInput = genderLabel.findElement(By.xpath("./preceding-sibling::input"));
        genderRadioInput.click();
        Assert.assertTrue(genderRadioInput.isSelected());
    }

    @Test
    public void testMobileNumber(){
        WebElement mobileInput = driver.findElement(By.xpath(
                "//label[contains(text(),'Mobile')]/following::input[1]"
        ));
        mobileInput.clear();
        mobileInput.sendKeys("9876543210");
        Assert.assertEquals(mobileInput.getAttribute("value"), "9876543210");
    }
}
