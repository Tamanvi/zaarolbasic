package com.zaarolbasic.testCases.SmokeSuite;

import com.zaarolbasic.testCases.BaseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.zaarolbasic.pageObjects.LoginPage;
import com.zaarolbasic.pageObjects.DashboardPage;

import java.io.IOException;

public class TC_01_Dashboard extends BaseClass {

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
    public void TC_01_Clicking_on_dashboard_is_working_fine() throws InterruptedException, IOException {
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.dashboardPageCheck();
    }

}
