package test;

import homePageAmazon.SearchBox;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchBoxTest extends SearchBox {

    @Test
    public void testSearchBoxCheck(){
      searchRoadBike();
      String actualText=driver.findElement(By.xpath(roadBikeActualText)).getText();
        Assert.assertEquals(actualText,roadBikeExpectedText);
    }
    @Test
    public void testBestSellerCheck(){
        bestSeller();
        String actualText=driver.findElement(By.xpath(bestSellerActualText)).getText();
        Assert.assertEquals(actualText,bestSellerExpectedText);
    }
    @Test
    public void testCustomerServiceCheck(){
        customerService();
        String actualText=driver.findElement(By.xpath(customerServiceActualText)).getText();
        Assert.assertEquals(actualText,customerServiceExpectedText);
    }
    @Test
    public void testTodayDealCheck(){
        todayDeal();
        String actualText=driver.findElement(By.xpath(todayDealActualText)).getText();
        Assert.assertEquals(actualText,todayDealExpectedText);

    }
    @Test
    public void testNewReleasesCheck(){
        newReleases();
        String actualText=driver.findElement(By.xpath(newReleasesActualText)).getText();
        Assert.assertEquals(actualText,newReleasesExpectedText);

    }
    @Test
    public void testFindGiftCheck(){
        findGift();
        String actualText=driver.findElement(By.xpath(findAGiftActualText)).getText();
        Assert.assertEquals(actualText,findAGifExpectedText);

    }
    @Test
    public void testWholeFoodsCheck(){
        wholeFoods();
        String actualText=driver.findElement(By.xpath(wholeFoodsActualText)).getText();
        Assert.assertEquals(actualText,wholeFoodsExpectedText);


    }
    @Test
    public void testGiftFoodCheck(){
        giftCard();
        String actualText=driver.findElement(By.xpath(giftCardsActualText)).getText();
        Assert.assertEquals(actualText,giftCardExpectedText);

    }
    @Test
    public void testFreeShippingCheck(){
        freeShipping();
        String actualText=driver.findElement(By.xpath(freeShippingActualText)).getText();
        Assert.assertEquals(actualText,freeShippingExpectedText);

    }
    @Test
    public void testRegistryCheck() {
        registry();
        String actualText = driver.findElement(By.xpath(registryActualText)).getText();
        Assert.assertEquals(actualText, registryExpectedText);

    }
    @Test
    public void testSellCheck(){
        sell();
        String actualText = driver.findElement(By.xpath(sellActualText)).getText();
        Assert.assertEquals(actualText, sellExpectedText);

    }
    @Test
    public void testCouponsCheck(){
        coupons();
        String actualText = driver.findElement(By.xpath(couponsActualText)).getText();
        Assert.assertEquals(actualText, couponsExpectedText);

    }
    @Test
    public void testAmazonBasicsCheck(){
        amazonBasics();
        String actualText = driver.findElement(By.xpath(amazonBasicsActualText)).getText();
        Assert.assertEquals(actualText, amazonBasicsExpectedText);
    }
    @Test
    public void testGryllStoreCheck(){
        gryllStore();
        String actualText = driver.findElement(By.xpath(theGryllsStoreActualText)).getText();
        Assert.assertEquals(actualText, theGryllsStoreExpectedText);

    }
    @Test
    public void testShoppingCartCheck(){
        shoppingCart();
        String actualText = driver.findElement(By.xpath(shoppingCartActualText)).getText();
        Assert.assertEquals(actualText, shoppingCartActualText);
    }




}
