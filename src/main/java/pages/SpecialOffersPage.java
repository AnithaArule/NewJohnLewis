package pages;

import Utils.Utils;
import Utils.VerifyUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Ani on 19/09/2015.
 */
public class SpecialOffersPage extends BasePage{

    @FindBy(how = How.LINK_TEXT, using = "Computing Offers")
    public WebElement ComputingOffers;

//    @FindBy(how = How.XPATH,  using = "//div[@id='un_product_49']/div[2]/a/span")
//    public WebElement SelectProduct;

    @FindBy(how = How.XPATH, using = "//div[@id='un_product_6']/div[2]/a/span")
            public WebElement SelectProduct;

    @FindBy(how = How.ID, using ="233598889" )
    public WebElement Checkbox;

    @FindBy(how = How.NAME, using = "un_jtt_add_2__pid__1")
    public WebElement AddToBasket;

    @FindBy(how = How.ID, using ="addToBasketConfirm")
    public WebElement VerifyText;


    public SpecialOffersPage()
            {

        PageFactory.initElements(driver, this);
    }

    public void clickCategoryList(){
        ComputingOffers.click();
    }

    public void verifyUserIsInCategoryList(String arg1){

      VerifyUtils.contains(arg1, driver.findElement(By.tagName("body")).getText());



    }

    public void addProductFromCategory(){
        SelectProduct.click();
        Utils.sleep(1);
        Checkbox.click();
        Utils.sleep(1);
        AddToBasket.click();
        Utils.sleep(1);


    }

    public void VerifyAddedToBasket(){

       Utils.isTextPresent("Added to");

    }








}
