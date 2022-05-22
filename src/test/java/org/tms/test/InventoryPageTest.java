package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.driver.DriverSingleton;
import org.tms.page.InventoryPage;
import org.tms.service.LoginPageService;

public class InventoryPageTest extends BaseTest {

    private LoginPageService loginPageService;
    private InventoryPage inventoryPage;

   @BeforeClass
   public void loginPage() {
       loginPageService = new LoginPageService();
       inventoryPage = new InventoryPage();
        loginPageService.login();
    }

    @Test (priority = 1)
    public void addToCartButtonTest() {
        inventoryPage.clickAddToCartButton();
        String actualTextOfRemoveCartButton = inventoryPage.getTextOfRemoveButton();
        String expectedTextOfRemoveCartButton = "REMOVE";
        Assert.assertEquals(actualTextOfRemoveCartButton, expectedTextOfRemoveCartButton);
    }

    @Test (priority = 2)
    public void removeButtonTest() {
       inventoryPage.clickRemoveButton();
       String actualTextOfAddToCartButton = inventoryPage.getTextOfAddToCartButton();
       String expectedTextOfAddToCartButton = "ADD TO CART";
       Assert.assertEquals(actualTextOfAddToCartButton, expectedTextOfAddToCartButton, "Actual result is equal to expected");
    }

}
