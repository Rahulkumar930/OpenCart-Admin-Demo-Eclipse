package member3.cart;

import opencart.base.BaseTest;

public class CartTest extends BaseTest {

    public static void main(String[] args) {

        CartTest test = new CartTest();

        test.setUp();

        System.out.println("Browser opened");
        System.out.println("Current URL: " + test.driver.getCurrentUrl());
        System.out.println("Page Title: " + test.driver.getTitle());

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        test.tearDown();
    }
}