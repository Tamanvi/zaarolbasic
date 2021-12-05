package com.zaarolbasic.businessUtilities;

import org.openqa.selenium.WebElement;

public class BusinessUtilities {

    public static void leftPaneNavigation(WebElement element){
        try{
            element.isDisplayed();
            element.click();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void isDisplayed(WebElement element){
        try{
            element.isDisplayed();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

}
