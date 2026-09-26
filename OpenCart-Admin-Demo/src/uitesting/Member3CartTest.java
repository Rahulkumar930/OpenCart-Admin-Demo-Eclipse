package uitesting;

import opencart.base.BaseTest;

public class Member3CartTest extends BaseTest {

    public static void main(String[] args) {

        Member3CartTest test = new Member3CartTest();

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
