package tests;

import pages.Base;

public class Setup extends Base {
    @BeforeSuite
    public void init(){
        System.out.println("Inside init");
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://www.mysmartprice.com/mobile/apple-iphone-7-msp10208");
        System.out.println("Exiting init");
    }

    @AfterSuite
    public void cleanup(){
        driver.quit();
    }
}
