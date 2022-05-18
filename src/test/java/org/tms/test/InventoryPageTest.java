package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.page.InventoryPage;
import org.tms.service.LoginPageService;

public class InventoryPageTest extends BaseTest {

    private LoginPageService loginPageService = new LoginPageService();
    private InventoryPage inventoryPage = new InventoryPage();

   @BeforeClass
   public void loginPage() {
        loginPageService.login();
    }

    @Test
    public void addToCartButtonTest () {
        inventoryPage.clickAddToCartButton();
        String actualTextOfRemoveCartButton = inventoryPage.getTextOfRemoveButton();
        String expectedTextOfRemoveCartButton = "REMOVE";
        Assert.assertEquals(actualTextOfRemoveCartButton, expectedTextOfRemoveCartButton);
    }
}
