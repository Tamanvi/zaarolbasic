package com.zaarolbasic.testCases.SmokeSuite;

import com.sun.org.apache.xpath.internal.operations.Or;
import com.zaarolbasic.pageObjects.LoginPage;
import com.zaarolbasic.pageObjects.OrdersPage;
import com.zaarolbasic.testCases.BaseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_19_Orders extends BaseClass {
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
    public void TC_01_Clicking_All_Pages_In_OrderPage_Working_Fine() throws InterruptedException {
        OrdersPage ordersPage = new OrdersPage(driver);
        ordersPage.OrderPagesCheck();
    }
}
