package homePageAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.DoubleSummaryStatistics;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.DoubleAccumulator;

public class SearchBox {
    public WebDriver driver;
    public String chromeDriver = "webdriver.chrome.driver";
    public String chromeDriverPath = "lib/browserDriver/chromedriver";
    public String url = "https://www.amazon.com/";
    public String searchBox = "//*[@id=\"twotabsearchtextbox\"]";
    public String productSearch = "Road Bike";
    public String searchButton = "//*[@id=\"nav-search\"]/form/div[2]/div/input";
    public String roadBikeActualText = "//span[@class='a-size-medium a-color-base a-text-normal' and text()='Trinx TEMPO1.0 700C Road Bike Shimano 21 Speed Racing Bicycle 53cm 56cm']";
    public String roadBikeExpectedText = "Trinx TEMPO1.0 700C Road Bike Shimano 21 Speed Racing Bicycle 53cm 56cm";
    public String bestSellerActualText = "//*[@id=\"zg_left_col1\"]/div[1]/div[2]/div/div[2]/a/div[2]";
    public String bestSellerExpectedText = "Crayola Twistables Crayons Coloring Set, Kids Indoor Activities at Home, 24 Count";
    public String customerServiceActualText = "//*[@id=\"nav-xshop\"]/a[2]";
    public String customerServiceExpectedText = "Customer Service";
    public String todayDealActualText = "//*[@id=\"nav-xshop\"]/a[3]";
    public String todayDealExpectedText = "Today's Deals";
    public String newReleasesActualText = "//*[@id=\"nav-xshop\"]/a[4]";
    public String newReleasesExpectedText = "New Releases";
    public String findAGiftActualText = "//*[@id=\"nav-xshop\"]/a[5]";
    public String findAGifExpectedText = "Find a Gift";
    public String wholeFoodsActualText = "//*[@id=\"nav-xshop\"]/a[6]";
    public String wholeFoodsExpectedText = "Whole Foods";
    public String giftCardsActualText = "//*[@id=\"nav-xshop\"]/a[7]";
    public String giftCardExpectedText = "Gift Cards";
    public String freeShippingActualText = "//*[@id=\"nav-xshop\"]/a[8]";
    public String freeShippingExpectedText = "Free Shipping";
    public String registryActualText = "//*[@id=\"nav-xshop\"]/a[9]";
    public String registryExpectedText = "Registry";
    public String sellActualText = "//*[@id=\"nav-xshop\"]/a[10]";
    public String sellExpectedText = "Sell on Amazon";
    public String couponsActualText="//*[@id=\"nav-xshop\"]/a[11]";
    public String couponsExpectedText="Amazon Coupons";
    public String amazonBasicsActualText="//*[@id=\"nav-xshop\"]/a[12]";
    public String amazonBasicsExpectedText="Amazon Basics";
    public String theGryllsStoreActualText="//*[@id=\"nav-swmslot\"]/a";
    public String theGryllsStoreExpectedText="the gryll stoe";
    public String shoppingCartActualText="//*[@id=\"nav-cart\"]/span[2]";
    public String shoppingCartExpectedText="cart";



    @BeforeMethod
    public void setUp() {
        System.out.println("Welcome To Amazon WebAutomation");
        System.setProperty(chromeDriver, chromeDriverPath);
        driver = new ChromeDriver();
        driver.get(url);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }

    public void searchRoadBike() {
        driver.manage().window().maximize();
        driver.findElement(By.xpath(searchBox)).sendKeys(productSearch);
        driver.findElement(By.xpath(searchButton)).submit();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(roadBikeActualText)).getText();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    public void bestSeller() {
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(bestSellerActualText)).getText();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);


    }

    public void customerService() {
        driver.manage().window().maximize();
        driver.findElement(By.xpath(customerServiceActualText)).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(customerServiceActualText)).getText();

    }

    public void todayDeal() {
        driver.manage().window().maximize();
        driver.findElement(By.xpath(todayDealActualText)).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(todayDealActualText)).getText();

    }

    public void newReleases() {
        driver.findElement(By.xpath(newReleasesActualText)).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(newReleasesActualText)).getText();

    }

    public void findGift() {
        driver.findElement(By.xpath(findAGiftActualText)).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(findAGiftActualText)).getText();

    }

    public void wholeFoods() {
        driver.findElement(By.xpath(wholeFoodsActualText)).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(wholeFoodsActualText)).getText();
    }

    public void giftCard() {
        driver.findElement(By.xpath(giftCardsActualText)).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(giftCardsActualText)).getText();

    }

    public void freeShipping() {
        driver.manage().window().maximize();
        driver.findElement(By.xpath(freeShippingActualText)).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(freeShippingActualText)).getText();

    }

    public void registry() {
        driver.manage().window().maximize();
        driver.findElement(By.xpath(registryActualText)).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(registryActualText)).getText();
    }

    public void sell() {
        driver.manage().window().maximize();
        driver.findElement(By.xpath(sellActualText)).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(sellActualText)).getText();

    }
    public void coupons(){
        driver.manage().window().maximize();
        driver.findElement(By.xpath(couponsActualText)).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(couponsActualText)).getText();

    }
    public void amazonBasics(){
        driver.manage().window().maximize();
        driver.findElement(By.xpath(amazonBasicsActualText)).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(amazonBasicsActualText)).getText();

    }
    public void gryllStore(){
        driver.manage().window().maximize();
        driver.findElement(By.xpath(theGryllsStoreActualText)).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(theGryllsStoreActualText)).getText();

    }
    public void shoppingCart(){
        driver.manage().window().maximize();
        driver.findElement(By.xpath(shoppingCartActualText)).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(shoppingCartActualText)).getText();

    }

}

