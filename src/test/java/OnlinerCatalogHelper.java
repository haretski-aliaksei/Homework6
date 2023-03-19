import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.By.xpath;

public class OnlinerCatalogHelper {
    private WebDriver driver;

    public OnlinerCatalogHelper(WebDriver driver) {
        this.driver = driver;
    }

    public List<String> getListOfCatalogItems() {
        List<String> items = new ArrayList<>();
        driver.findElements(xpath("//span[@class='catalog-navigation-classifier__item-title']/span"))
                .forEach((WebElement item) -> items
                        .add(item.getText()));
        return items.subList(1, 10);
    }

    public void chooseItemFromCatalog(int itemId) {
        driver.findElement(By.xpath("//li[@data-id='" + itemId + "']")).click();
    }

    public List<String> getItemsFromComputersParagrafh() {
        List<String> ItemsFromComputersParagrafh = new ArrayList<>();
        driver.findElements(xpath("(//div[@class='catalog-navigation-list__aside-list'])[3]/div"))
                .forEach((WebElement item) -> ItemsFromComputersParagrafh.add(item.getText()));
        return ItemsFromComputersParagrafh;
    }

    public void findAccessoriesParagrafh(String paragrafhName) {
        driver.findElement(By.xpath("//div[text()=' " + paragrafhName + " ']/..")).click();
    }
}
