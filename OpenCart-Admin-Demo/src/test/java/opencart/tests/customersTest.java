package opencart.tests;

import org.testng.annotations.Test;

import opencart.base.BaseTest;

public class customersTest extends BaseTest {

    @Test
    public void testBrowserLaunch() {

        driver.get("https://demo.opencart.com/");

        System.out.println("OpenCart opened successfully");
    }
}