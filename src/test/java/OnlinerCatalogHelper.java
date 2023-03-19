import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.By.xpath;

public class CatalogHelper {
    private WebDriver driver;

    public CatalogHelper(WebDriver driver) {
        this.driver = driver;
    }

    public List<String> getListOfCatalogItems() {
        List<String> items = new ArrayList<>();
        driver.findElements(xpath("//span[@class='catalog-navigation-classifier__item-title']/span"))
                .forEach((WebElement item) -> items
                        .add(item.getText()));
        return items.subList(1, 10);
    }

    public void chooseItemFromCatalog (int id) {
        driver.findElement(By.xpath("//li[@data-id='"+id+"']")).click();
    }
}
