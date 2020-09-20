package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonHome;
import pages.MySmartPriceHome;

public class Test1 extends Setup{

    MySmartPriceHome sp=new MySmartPriceHome();
    AmazonHome amazon= new AmazonHome();

    @Test
    public void testFlow(){
        String smartPrice=sp.getSmartPrice(driver);
        for(int i=0;i<sp.getShoppoingSiteCount(driver);i++){
            String siteName=sp.getShoppingSiteName(driver, i);
            sp.goToShoppingSite(driver, siteName);
            String home=driver.getWindowHandle();
            for (String x: driver.getWindowHandles()) {
                if(x.contains(siteName))
                    driver.switchTo().window(x);
            }
            String itemPrice=amazon.getItemPrice(driver);
            Assert.assertEquals(smartPrice, itemPrice);
        }

    }

}
