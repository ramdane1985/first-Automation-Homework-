package amazonPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Amazon {
    public static void main(String[] args) throws InterruptedException {

        //1-open chrome browser
        String chromeDriver = "webdriver.chrome.driver";
        String chromeDriverPath = "lib/browserDriver/chromedriver";
        String url = "https://www.amazon.com/ref=nav_logo";
        String searchBox="//*[@id=\"twotabsearchtextbox\"]";
        String productSearch="Road Bike";
        String searchButton="//*[@id=\"nav-search\"]/form/div[2]/div/input";
        String RoadBikeActualText="//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[5]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span";
        String expectedText="Hiland Road Hybrid Bike 700C Wheels with Single-Speed";
        String menuButton="//*[@id=\"nav-hamburger-menu\"]/i";
        String PrimeVideo="//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a/div";
        String Exit="//*[@id=\"hmenu-canvas-background\"]/div";
        String BestSellers="//*[@id=\"nav-xshop\"]/a[1]";
        String CustomerService="//*[@id=\"nav-xshop\"]/a[2]";
        String TodayDeal="//*[@id=\"nav-xshop\"]/a[3]";
        String NewReleases="//*[@id=\"nav-xshop\"]/a[4]";
        String FindAGift="//*[@id=\"nav-xshop\"]/a[5]";
        String wholeFoods="//*[@id=\"nav-xshop\"]/a[6]";
        String GiftCard="//*[@id=\"nav-xshop\"]/a[7]";
        String HomePage="//*[@id=\"nav-logo\"]/a/span[1]";
        String ShoppingCard="//*[@id=\"nav-cart\"]/span[2]";
        String TryPrime="//*[@id=\"nav-link-prime\"]/span";
        String Language="//*[@id=\"icp-nav-flyout\"]/span";
        String SaveLanguage="//*[@id=\"icp-btn-save\"]/span/input";
        String HelloSignIn="//*[@id=\"hmenu-customer-name\"]";
        String EmailBox="//*[@id=\"ap_email\"]";
        String Email="ame.ramo1985@gmail.com";
        String ContinueButton="//*[@id=\"continue\"]";
        String PassWordBox="//*[@id=\"ap_password\"]";
        String password="abchgfdreec";
        String SignInButton="//*[@id=\"signInSubmit\"]";
        String ForgetPassWord="//*[@id=\"auth-fpp-link-bottom\"]";




        System.setProperty(chromeDriver, chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(3000);

        //searchBox
        driver.findElement(By.xpath(searchBox)).sendKeys(productSearch);
        Thread.sleep(2000);

        //search Button
        driver.findElement(By.xpath(searchButton)).click();
        Thread.sleep(2000);
//        String text = driver.findElement(By.xpath(RoadBikeActualText)).getText();
//        Assert.assertEquals(RoadBikeActualText,expectedText);
//        Thread.sleep(3000);

        //menu button
        driver.findElement(By.xpath(menuButton)).click();
        Thread.sleep(2000);

        //PRIME VIDEO
        driver.findElement(By.xpath(PrimeVideo)).click();
        Thread.sleep(2000);

        //Exit
        driver.findElement(By.xpath(Exit)).click();
        Thread.sleep(2000);

        //BestSellers
        driver.findElement(By.xpath(BestSellers)).click();
        Thread.sleep(2000);

        //customer Service
        driver.findElement(By.xpath(CustomerService)).click();
        Thread.sleep(2000);

        //TodayDeal
        driver.findElement(By.xpath(TodayDeal)).click();
        Thread.sleep(2000);

        //New Releases
        driver.findElement(By.xpath(NewReleases)).click();
        Thread.sleep(2000);

        //Find a gift
        driver.findElement(By.xpath(FindAGift)).click();
        Thread.sleep(2000);

        //whole Food
        driver.findElement(By.xpath(wholeFoods)).click();
        Thread.sleep(2000);

        //Gift Cards
        driver.findElement(By.xpath(GiftCard)).click();
        Thread.sleep(2000);

        //Homepage
        driver.findElement(By.xpath(HomePage)).click();
        Thread.sleep(3000);

        //Shopping Card
        driver.findElement(By.xpath(ShoppingCard)).click();
        Thread.sleep(2000);

        //Try prime
        driver.findElement(By.xpath(TryPrime)).click();
        Thread.sleep(2000);

        //Language
        driver.findElement(By.xpath(Language)).click();
        Thread.sleep(2000);

        //Save Language
        driver.findElement(By.xpath(SaveLanguage)).click();
        Thread.sleep(2000);

        //menu button
        driver.findElement(By.xpath(menuButton)).click();
        Thread.sleep(2000);

        //21-Hello Sign in
        driver.findElement(By.xpath(HelloSignIn)).click();
        Thread.sleep(2000);

        //Email Box
        driver.findElement(By.xpath(EmailBox)).sendKeys(Email);
        Thread.sleep(2000);

        //Continue button
        driver.findElement(By.xpath(ContinueButton)).click();
        Thread.sleep(2000);

        //PassWord
        driver.findElement(By.xpath(PassWordBox)).sendKeys(password);
        Thread.sleep(2000);

        //SinIn Button
        driver.findElement(By.xpath(SignInButton)).click();
        Thread.sleep(2000);

        //Forget passWord

        driver.findElement(By.xpath(ForgetPassWord)).click();
        Thread.sleep(2000);



        driver.close();



    }



}
