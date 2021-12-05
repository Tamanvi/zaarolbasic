package com.zaarolbasic.testCases.SmokeSuite;

import com.zaarolbasic.pageObjects.DriversPage;
import com.zaarolbasic.pageObjects.LoginPage;
import com.zaarolbasic.testCases.BaseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_15_Driver extends BaseClass {
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
    public void TC_01_Clicking_On_DriversPage_Working_Fine() throws InterruptedException {
        DriversPage driversPage = new DriversPage(driver);
        driversPage.DriverPageCheck();
    }
}
