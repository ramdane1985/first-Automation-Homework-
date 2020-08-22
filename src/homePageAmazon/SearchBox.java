package homePageAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class SearchBox {
    public WebDriver driver;
    public String chromeDriver="webdriver.chrome.driver";
    public String chromeDriverPath="lib/browserDriver/chromedriver";
    public String url="https://www.amazon.com/";
    public String searchBox="//*[@id=\"twotabsearchtextbox\"]";
    public String productSearch="Road Bike";
    public String searchButton="//*[@id=\"nav-search\"]/form/div[2]/div/input";
    public String roadBikeActualText="//span[@class='a-size-medium a-color-base a-text-normal' and text()='Trinx TEMPO1.0 700C Road Bike Shimano 21 Speed Racing Bicycle 53cm 56cm']";
    public String roadBikeExpectedText="Trinx TEMPO1.0 700C Road Bike Shimano 21 Speed Racing Bicycle 53cm 56cm";
    public String bestSellerActualText="//*[@id=\"zg_left_col1\"]/div[1]/div[2]/div/div[2]/a/div[2]";
    public String bestSellerExpectedText="Crayola Twistables Crayons Coloring Set, Kids Indoor Activities at Home, 24 Count";
    public String customerServiceActualText="//*[@id=\"nav-xshop\"]/a[2]";




    @BeforeMethod
    public void setUp(){
        System.out.println("Welcome To Amazon WebAutomation");
        System.setProperty(chromeDriver,chromeDriverPath);
        driver=new ChromeDriver();
        driver.get(url);
    }
    @AfterMethod
    public void closeBrowser(){driver.close();}
    public void searchRoadBike(){
        driver.manage().window().maximize();
        driver.findElement(By.xpath(searchBox)).sendKeys(productSearch);
        driver.findElement(By.xpath(searchButton)).submit();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(roadBikeActualText)).getText();
        driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
    }
    public void bestSeller(){
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.xpath(bestSellerActualText)).getText();
        driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }

    }

