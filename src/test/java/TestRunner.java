import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestRunner extends Setup{

    String baseUrl = "https://www.saucedemo.com/";

    //login using credentials

    @Test(priority = 1,testName = "TC001", description = "User can login successfully")

    public void doLogin(){
        driver.get(baseUrl);
        LoginPage loginPage= new LoginPage(driver);

        loginPage.doLogin("standard_user","secret_sauce");
    }

    //item select from the list of products

    @Test(priority = 2 , testName = "Select item")
    public void selectItem() throws InterruptedException{

        Thread.sleep(2000);
        List<WebElement> selectItem1 = driver.findElements(By.className("inventory_item_name"));
        selectItem1.get(0).click();

    }
    //add item to cart
    @Test(priority = 3 , testName = "Item add to cart button")
    public void addToCart() throws InterruptedException{

        Thread.sleep(2000);
        List<WebElement> addCart = driver.findElements(By.id("add-to-cart-sauce-labs-backpack"));

        addCart.get(0).click();

    }

    // go to cart
    @Test(priority = 4 , testName = "Select Cart icon")
    public void cartIcon() throws InterruptedException{

        Thread.sleep(2000);
        List<WebElement> addCart = driver.findElements(By.className("shopping_cart_link"));

        addCart.get(0).click();

    }

    @Test(priority = 5 , testName = "CheckOut")
    public void checkOut() throws InterruptedException{

        Thread.sleep(2000);
        List<WebElement> checkout = driver.findElements(By.id("checkout"));

        checkout.get(0).click();

    }
    @Test(priority = 5 , testName = "Form fillup")
    public void formFill() throws InterruptedException{

        Thread.sleep(2000);
        List<WebElement> form = driver.findElements(By.className("form_input"));

        form.get(0).sendKeys("Rafsana"); //First Name
        form.get(1).sendKeys("Kabir"); //Last Name
        form.get(2).sendKeys("1216"); //Zipcode

        List<WebElement> continueBtn = driver.findElements(By.id("continue"));
        continueBtn.get(0).click();
    }

    @Test(priority = 6 , testName = "Back to landing")
    public void finish() throws InterruptedException{

        Thread.sleep(2000);
        //finish shopping
        List<WebElement> Finish = driver.findElements(By.id("finish"));

        Finish.get(0).click();

        Thread.sleep(2000);
        // back to menu
        List<WebElement> back = driver.findElements(By.id("back-to-products"));
        back.get(0).click();
    }







}
