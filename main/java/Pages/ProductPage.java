package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductPage {

    WebDriver driver;

    @FindBy(xpath = "//a[text()=' Products']")
    WebElement productLinkButton;

    @FindBy(name = "search")
    WebElement searchBox;

    @FindBy(id = "submit_search")
    WebElement searchButton;

    @FindBy(xpath = "//h2[text()='Searched Products']")
    WebElement searchedProductsText;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToProductPage() {

        productLinkButton.click();

        Assert.assertTrue(
            driver.getCurrentUrl().contains("/products"),
            "Products page was not opened"
        );
    }

    public void enterProduct(String product) {
        searchBox.clear();
        searchBox.sendKeys(product);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void verifySearchedProducts() {
        Assert.assertTrue(
            searchedProductsText.isDisplayed(),
            "Searched Products section is not displayed"
        );
    }

    public void searchProduct(String product) {
        navigateToProductPage();
        enterProduct(product);
        clickSearchButton();
        verifySearchedProducts();
    }
}
