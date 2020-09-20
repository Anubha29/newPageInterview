package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonHome extends Base implements ShoppingSite{
    By itemPrice=By.xpath("//span[@id='priceblock_ourprice']");

    public String getItemPrice(WebDriver driver) {
        String price="";
        price=driver.findElement(itemPrice).getText();
        return price.replace("₹","");
    }
}
