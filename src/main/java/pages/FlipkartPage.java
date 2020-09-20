package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlipkartPage extends Base implements ShoppingSite{
    By itemPrice= By.xpath("//div[@class='_1vC4OE _3qQ9m1']");

    public String getItemPrice(WebDriver driver) {
        String price="";
        price=driver.findElement(itemPrice).getAttribute("value");
        return price;
    }
}
