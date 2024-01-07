package score;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class CricketScores {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\charvi.ojha\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.espncricinfo.com/series/india-in-south-africa-2023-24-1387592/south-africa-vs-india-2nd-test-1387604/full-scorecard");

        List<WebElement> tables = driver.findElements(By.tagName("table"));
        List<WebElement> rows = tables.get(0).findElements(By.tagName("tr"));

        try {
            for (WebElement row : rows) {
                List<WebElement> cols = row.findElements(By.tagName("td"));

                for (WebElement col : cols) {
                    System.out.print(col.getText() + "\t");
                }
                System.out.println();
            }

            System.out.println("Output has been printed to the console.");
        } finally {
            driver.quit();
        }
    }
}
