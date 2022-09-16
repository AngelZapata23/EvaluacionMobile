package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsSwagLabs extends PageObject {

    private WebDriver driver;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    public WebElement title;
    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"test-Item\"])[1]")
    public static WebElement itemcars;

    public ProductsSwagLabs(WebDriver driver){
        this.driver = driver;
    }
    public String getResultText(){
        return title.getText();
    }
    public void Itemcant(){
        boolean i;
        if(itemcars!=null){
            i= true;
        }else{
            i=false;
        }
        Assert.assertTrue(i);
    }
}
