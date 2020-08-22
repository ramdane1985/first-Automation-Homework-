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
        String actualText1=driver.findElement(By.xpath(bestSellerActualText)).getText();
        Assert.assertEquals(actualText1,bestSellerExpectedText);
    }




}
