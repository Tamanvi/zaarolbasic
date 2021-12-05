package com.zaarolbasic.testCases.SmokeSuite;

import com.zaarolbasic.pageObjects.LoginPage;
import com.zaarolbasic.pageObjects.ProductPage;
import com.zaarolbasic.testCases.BaseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_07_Product extends BaseClass {

    @BeforeMethod
    public void init(){
        driver.get(baseURL);
        LoginPage lp = new LoginPage(driver);
        lp.setUserName(username);
        logger.info("...Provided User Name");
        lp.setPassword(password);
        logger.info("...Provided Password");
        lp.clickLogin();
    }
    @Test(priority = 1)
    public void TC_01_Clicking_on_Products_Page_is_working_fine() throws InterruptedException {
        ProductPage productPage = new ProductPage(driver);
        productPage.ProductPageCheck();
    }
}
