package Tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.ProductPage;
import Utilities.ExcelData_Product;

public class ProductTest extends BaseTest {

    @DataProvider(name = "productData")
    public Object[][] productData() throws IOException {

        return ExcelData_Product.getExcelData(
            "C:\\Users\\gopin\\eclipse-workspace\\SeleniumAutomation\\src\\test\\resources\\datas.xlsx",
            "searchProduct"
        );
    }

    @Test(dataProvider = "productData")
    public void searchProducts(String product) {

        ProductPage productPage = new ProductPage(driver);

        productPage.searchProduct(product);
    }
}
