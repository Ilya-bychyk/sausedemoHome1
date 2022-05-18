package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePage {

    @FindBy(xpath = "//span[@class='title']")
    private WebElement nameOfMainPaeSection;

    @FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-backpack']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//button[@name='remove-sauce-labs-backpack']")
    private WebElement removeCartButton;

    public String getTextOfNameOfMainPaeSection() {
        return nameOfMainPaeSection.getText();
    }

    public String getTextOfAddToCartButton() {
        return addToCartButton.getText();
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public String getTextOfRemoveButton() {
        return removeCartButton.getText();
    }

    public void clickRemoveButton() {
        removeCartButton.click();
    }
}
