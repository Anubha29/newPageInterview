# newPageInterview

Round2---
http://automationpractice.com/index.php?controller=authentication&back=my-account
By firstName=By.xpath("//input[@id='customer_firstname']");
    By lasName=By.xpath("//input[@id='customer_lastname']");
    By email=By.xpath("//input[@id='email']");
    By password=By.xpath("//input[@id='passwd']");
    By addressLine1=By.xpath("//input[@id='address1']");
    By city=By.xpath("//input[@id='city']");
    By state=By.xpath("//select[@id='id_state']");//Select
    By postCode=By.xpath("//input[@id='postcode']");
    By country=By.xpath("//select[@id='id_country']");//Select
    By phone=By.xpath("//input[@id='phone_mobile']");

    public void inputFirstName(WebDriver driver, String firstname){
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(firstname);
    }

    public void inputLastName(WebDriver driver, String lastname){
        driver.findElement(lasName).clear();
        driver.findElement(lasName).sendKeys(lastname);
    }

    public void inputPass(WebDriver driver, String pwd){
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(pwd);
    }

    public void inputAddrL1(WebDriver driver, String addressL1){
        driver.findElement(addressLine1).clear();
        driver.findElement(addressLine1).sendKeys(addressL1);
    }

    public void inputCity(WebDriver driver, String cityName){
        driver.findElement(city).clear();
        driver.findElement(city).sendKeys(cityName);
    }

    public void inputPostal(WebDriver driver, String postal){
        driver.findElement(postCode).clear();
        driver.findElement(postCode).sendKeys(postal);
    }

    public void inputPhone(WebDriver driver, String phoneNum){
        driver.findElement(phone).clear();
        driver.findElement(phone).sendKeys(phoneNum);
    }

    public void selectState(WebDriver driver, String stateName){
        Select stateSelect=new Select(driver.findElement(state));
        stateSelect.selectByValue(stateName);
    }

    public void selectCountry(WebDriver driver, String countryName){
        Select stateSelect=new Select(driver.findElement(country));
        stateSelect.selectByValue(countryName);
    }
    
    By createAccountInput=By.xpath("//input[@id='email_create']");
    By createAccountButton=By.xpath("//button[@id='SubmitCreate']");
    By loginEmail=By.xpath("//input[@id='email']");
    By loginPassword=By.xpath("//input[@id='passwd']");
    By loginSubmitButton=By.xpath("//button[@id='SubmitLogin']");

    public void inputNewEmail(WebDriver driver, String email){
        driver.findElement(createAccountInput).clear();
        driver.findElement(createAccountInput).sendKeys(email);
    }

    public void createNewAccount(WebDriver driver, String email){
        inputNewEmail(driver, email);
        driver.findElement(createAccountButton).click();
    }

    public void inputRegisteredEmail(WebDriver driver, String email){
        driver.findElement(loginEmail).clear();
        driver.findElement(loginEmail).sendKeys(email);
    }

    public void inputRegisteredPass(WebDriver driver, String email){
        driver.findElement(loginPassword).clear();
        driver.findElement(loginPassword).sendKeys(email);
    }
    public void loginExistingUser(WebDriver driver, String email, String pass){
        inputRegisteredEmail(driver, email);
        inputRegisteredPass(driver, email);
        driver.findElement(loginSubmitButton).click();
    }
    
    By userName=By.xpath("//a[@class='account']/span");

    public String getLoggedInUserName(){
        String username="";
        return username;
    }
    
