package amazonPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.servlet.Holder;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Amazon1 {
    public WebDriver driver;
    public String chromeDriver="webdriver.chrome.driver";
    public String chromeDriverPath="lib/browserDriver/chromedriver";
    public String url="https://www.amazon.com/ref=nav_logo";
    public String searchBox="//*[@id=\"twotabsearchtextbox\"]";
    public String productSearch="Road Bike";
    public String searchButton="//*[@id=\"nav-search\"]/form/div[2]/div/input";
    public String roadBike="//span[@class='a-size-medium a-color-base a-text-normal' and text()='Trinx TEMPO1.0 700C Road Bike Shimano 21 Speed Racing Bicycle 53cm 56cm']";
    public String expectedText="Trinx TEMPO1.0 700C Road Bike Shimano 21 Speed Racing Bicycle 53cm 56cm";
    public String bestSeller="//*[@id=\"nav-xshop\"]/a[1]";
    public String customerService="//*[@id=\"nav-xshop\"]/a[2]";
    public String todayDeal="//*[@id=\"nav-xshop\"]/a[3]";
    public String newReleases="//*[@id=\"nav-xshop\"]/a[4]";
    public String findAGift="//*[@id=\"nav-xshop\"]/a[5]";
    public String wholeFoods="//*[@id=\"nav-xshop\"]/a[6]";
    public String giftCards="//*[@id=\"nav-xshop\"]/a[7]";
    public String freeShipping="//*[@id=\"nav-xshop\"]/a[8]";
    public String registry="//*[@id=\"nav-xshop\"]/a[9]";
    public String sell="//*[@id=\"nav-xshop\"]/a[10]";
    public String coupons="//*[@id=\"nav-xshop\"]/a[11]";
    public String amazonBasics="//*[@id=\"nav-xshop\"]/a[12]";
    public String theGryllsStore="//*[@id=\"nav-swmslot\"]/a";
    public String shoppingCart="//*[@id=\"nav-cart\"]/span[2]";
    public String tryPrime="//*[@id=\"nav-link-prime\"]/span";
    public String language="//*[@id=\"icp-nav-flyout\"]/span/span[1]/span";
    public String saveEnglish="//*[@id=\"icp-btn-save\"]/span/input";
    public String homePage="//*[@id=\"nav-logo\"]/a/span[1]";
    public String menuButton="//*[@id=\"nav-hamburger-menu\"]/i";
    public String primeVideo="//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a";
    public String getTryPrimeKids="//*[@id=\"hmenu-content\"]/ul[2]/li[14]/a";
    public String signInButton="//*[@id=\"hmenu-customer-name\"]";
    public String emailBox="//*[@id=\"ap_email\"]";
    public String email="ame.ramo1985@gmail.com";
    public String continueButton="//*[@id=\"continue\"]";
    public String passwordBox="//*[@id=\"ap_password\"]";
    public String password="aaaaaaaaaaaa";

    @BeforeMethod
    public void setUp(){
        System.out.println("Welcome To Amazon Automation Word");
        System.setProperty(chromeDriver,chromeDriverPath);
        driver=new ChromeDriver();
        driver.get(url);

    }
    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
    public void searchRoadBike(){

        driver.manage().window().maximize();
        driver.findElement(By.xpath(searchBox)).sendKeys(productSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        //driver.findElement(By.xpath(searchButton)).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(roadBike)).getText();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }
     public void amazon1Check() throws InterruptedException {
        setUp();
        driver.findElement(By.xpath(searchBox)).sendKeys(productSearch);
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.manage().deleteAllCookies();
        driver.findElement(By.xpath(searchButton)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(roadBike)).getText();
        Assert.assertEquals(roadBike,expectedText);
        Thread.sleep(2000);
        driver.findElement(By.xpath(bestSeller)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(customerService)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(todayDeal)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(newReleases)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(findAGift)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(wholeFoods)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(giftCards)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(freeShipping)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(registry)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(sell)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(coupons)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(amazonBasics)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(theGryllsStore)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(shoppingCart)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(tryPrime)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(language)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(saveEnglish)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(homePage)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(menuButton)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(primeVideo)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(getTryPrimeKids)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(menuButton)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(signInButton)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(emailBox)).sendKeys(email);
        Thread.sleep(2000);
        driver.findElement(By.xpath(continueButton)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(passwordBox)).sendKeys(password);
        Thread.sleep(2000);

    }


}
