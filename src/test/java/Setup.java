
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Setup {



    public WebDriver driver;
    @BeforeTest
    public void setup(){

        System.setProperty("webdriver.chrome.driver","C:\\Automation Project\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\hp\\Downloads\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
        //WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


    }
    @AfterTest
    public void quit(){
        //driver.close();
    }
}
