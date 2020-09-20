package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MySmartPriceHome extends Base{

    By item=By.xpath("//h1[@itemprop='name']");
    By itemPrice=By.xpath("//span[@class='prdct-dtl__prc-val']");
    By shoppingSites=By.xpath("//div[@class='prc-tbl__row-wrpr ']");
    static List<WebElement> shoppingList= new ArrayList<WebElement>();

    ////div[@*='flipkart']/div/div[@class='prc-tbl__btn']

    public String getSmartPrice(WebDriver driver) {
        String price="";
        WebElement priceEle=driver.findElement(itemPrice);
        price=priceEle.getText();
        return price;
    }

    public List<WebElement> getShoppoingSites(WebDriver driver) {
        shoppingList=driver.findElements(shoppingSites);
        return shoppingList;
    }
    public int getShoppoingSiteCount(WebDriver driver) {
        int count=0;
        if (shoppingList.isEmpty())
            shoppingList=getShoppoingSites(driver);
        count=shoppingList.size();
        return count;
    }

    public String getShoppingSiteName(WebDriver driver, int i) {
        String site="";
        if (shoppingList.isEmpty())
            shoppingList=getShoppoingSites(driver);
        site=shoppingList.get(i).getAttribute("data-storename");
        return site;
    }

    public void goToShoppingSite(WebDriver driver, String siteName) {
        driver.findElement(By.xpath("//div[@*='"+siteName+
                "']/div/div[@class='prc-tbl__btn']")).click();
    }

}
