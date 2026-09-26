package opencart;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OpenCartAdminDemoTest {

    @Test
    void openOpenCartWebsite() {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.opencart.com/");
            String title = driver.getTitle();

            System.out.println("Page Title: " + title);
            assertTrue(title.toLowerCase().contains("opencart"));
        } finally {
            driver.quit();
        }
    }
}
