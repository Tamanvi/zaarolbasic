package com.zaarolbasic.pageObjects;

import com.zaarolbasic.businessUtilities.BusinessUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import sun.jvm.hotspot.debugger.ThreadAccess;

public class OrdersPage extends BusinessUtilities {
    public OrdersPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    //Web Elements
    @FindBy(xpath = "//body/div[@id='root']/div[2]/div[1]/div[2]/section[1]/a[11]/div[2]")
    private WebElement orderPageNav;

    // All Orders Page
    @FindBy(xpath = "//div[contains(text(),'All Orders')]")
    private WebElement orderPageAllOrdersNav;

    @FindBy(xpath = "//body/div[@id='root']/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/h2[1]/section[1]/div[1]/span[4]/span[1]")
    private WebElement orderPageAllOrderBreadCrumb;

    // Upcoming Orders Page
    @FindBy(xpath = "//div[contains(text(),'Upcoming Orders')]")
    private WebElement orderPageUpcomingOrdersNav;

    @FindBy(xpath = "//span[contains(text(),'Upcoming')]")
    private WebElement orderPageUpcomingOrdersBreadCrumb;

    // Accepted Orders Page
    @FindBy(xpath = "//div[contains(text(),'Accepted Orders')]")
    private WebElement orderPageAcceptedOrdersNav;

    @FindBy(xpath = "//span[contains(text(),'Accepted')]")
    private WebElement orderPageAcceptedOrdersBreadCrumb;

    // Orders Being Packed  Orders Page
    @FindBy(xpath = "//div[contains(text(),'Orders Being Packed')]")
    private WebElement orderPageOrdersBeingPackedNav;

    @FindBy(xpath = "//span[contains(text(),'Being-Packed')]")
    private WebElement orderPageOrdersBeingPackedBreadCrumb;

    // Ready For Delivery Orders Page
    @FindBy(xpath = "//div[contains(text(),'Ready for Delivery')]")
    private WebElement orderPageReadyForDeliveryNav;

    @FindBy(xpath = "//span[contains(text(),'Delivery-Ready')]")
    private WebElement orderPageReadyForDeliveryBreadCrumb;

    // On the Way Orders Page
    @FindBy(xpath = "//div[contains(text(),'On the way')]")
    private WebElement orderPageOnTheWayNav;

    @FindBy(xpath = "//span[contains(text(),'On-The-Way')]")
    private WebElement orderPageOnTheWayBreadCrumb;

    // Completed Orders Page
    @FindBy(xpath = "//div[contains(text(),'Completed Orders')]")
    private WebElement orderPageCompletedNav;

    @FindBy(xpath = "//span[contains(text(),'Completed')]")
    private WebElement orderPageCompletedBreadCrumb;

    // Cancelled Orders Page
    @FindBy(xpath = "//div[contains(text(),'Cancelled Orders')]")
    private WebElement orderPageCancelledNav;

    @FindBy(xpath = "//span[contains(text(),'Completed')]")
    private WebElement orderPageCancelledBreadCrumb;



    // Pages Object Method
    public void OrderPagesCheck() throws InterruptedException {
        // Launching OrderPage DropDown
        leftPaneNavigation(orderPageNav);
        Thread.sleep(2000);
        //Checking All OrdersPage
        leftPaneNavigation(orderPageAllOrdersNav);
        isDisplayed(orderPageAllOrderBreadCrumb);

        //Checking Upcoming Orders
        leftPaneNavigation(orderPageUpcomingOrdersNav);
        isDisplayed(orderPageUpcomingOrdersBreadCrumb);

        // Accepted Orders page
        leftPaneNavigation(orderPageAcceptedOrdersNav);
        isDisplayed(orderPageAcceptedOrdersBreadCrumb);

        // Order Being Packed
        leftPaneNavigation(orderPageOrdersBeingPackedNav);
        isDisplayed(orderPageReadyForDeliveryBreadCrumb);

        // Ready for Delivery
        leftPaneNavigation(orderPageReadyForDeliveryNav);
        isDisplayed(orderPageReadyForDeliveryBreadCrumb);

        //On the way
        leftPaneNavigation(orderPageOnTheWayNav);
        isDisplayed(orderPageReadyForDeliveryBreadCrumb);

        //Completed orders
        leftPaneNavigation(orderPageCompletedNav);
        isDisplayed(orderPageCompletedBreadCrumb);

        // cancelled orders
        leftPaneNavigation(orderPageCancelledNav);
        isDisplayed(orderPageCancelledBreadCrumb);

    }









}
