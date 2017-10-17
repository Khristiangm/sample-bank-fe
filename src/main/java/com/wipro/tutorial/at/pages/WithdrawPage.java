package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


@PageObject
public class WithdrawPage extends AbstractPage {

    protected static WebDriver driver;

    public void selectAccount() {
        Select drpAccount = new Select(driver.findElement(By.id("targetAccount")));
        drpAccount.selectByValue("16179082354");
    }

    @FindBy(id = "ammount")
    private WebElement amountImput;

    @FindBy(className = "sb-button")
    private WebElement WithdrawButton;

    @FindBy(id = "sb-return-message")
    private WebElement returnMsg;
}

//*[@id="targetAccount"]
//*[@id="targetAccount"]