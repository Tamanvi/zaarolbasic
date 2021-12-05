package com.zaarolbasic.testCases.SmokeSuite;

import com.zaarolbasic.pageObjects.LoginPage;
import com.zaarolbasic.pageObjects.PromoCodes;
import com.zaarolbasic.testCases.BaseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_20_PromoCodes extends BaseClass {
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
    public void TC_01_Clicking_PromoCodes_Pages_Working_Fine() throws InterruptedException {
        PromoCodes promoCodes=new PromoCodes(driver);
                promoCodes.PromoCodesPageCheck();
    }
}
