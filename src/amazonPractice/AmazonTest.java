package amazonPractice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends Amazon1{


////@Test
//    public void testAmazon1Check() throws InterruptedException {
//    amazon1Check();
//}
    @Test
    public void testSearchRoadBike(){
        searchRoadBike();
        String actualText=driver.findElement(By.xpath(roadBike)).getText();
        Assert.assertEquals(actualText,expectedText);
    }

    }


