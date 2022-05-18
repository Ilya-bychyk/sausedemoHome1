package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.page.InventoryPage;
import org.tms.service.LoginPageService;

public class LoginPageTest extends BaseTest {
    private LoginPageService loginPageService = new LoginPageService();

        @Test
        public void LoginTest() {
            InventoryPage inventoryPage =  loginPageService.login();
            String actualTextOfInventoryPage = inventoryPage.getTextOfNameOfMainPaeSection();
            String expectedTextOfInventoryPage = "PRODUCTS";
            Assert.assertEquals(actualTextOfInventoryPage, expectedTextOfInventoryPage, "The actual text of the page does not match expexted!!!" );
        }


}
