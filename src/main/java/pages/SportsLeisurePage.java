package pages;

import Utils.Utils;
import Utils.VerifyUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Ani on 19/09/2015.
 */
public class SportsLeisurePage extends BasePage {

    @FindBy(how = How.LINK_TEXT, using = "Badminton & Squash")
    public WebElement BadmintonSquash;

//    @FindBy(how = How.XPATH,  using = "//div[@id='un_product_49']/div[2]/a/span")
//    public WebElement SelectProduct;

    @FindBy(how = How.XPATH, using = "//div[@id='un_product_3']/div[2]/a/span")
    public WebElement SelectSportProduct;


    @FindBy(how = How.NAME, using = "un_jtt_add_1__pid__0")
    public WebElement AddToBasket;

    @FindBy(how = How.ID, using ="addToBasketConfirm")
    public WebElement VerifyText;


    public SportsLeisurePage()
    {

        PageFactory.initElements(driver, this);
    }

    public void clickSportsCategoryList(){
        BadmintonSquash.click();
    }

    public void verifyUserIsInSportsCategoryList(String arg5){

        VerifyUtils.contains(arg5, driver.findElement(By.tagName("body")).getText());



    }

    public void addProductFromCategory(){
        SelectSportProduct.click();
        Utils.sleep(1);

        AddToBasket.click();
        Utils.sleep(1);


    }

    public void VerifyAddedToBasket(){

        Utils.isTextPresent("Added to");

    }








}








