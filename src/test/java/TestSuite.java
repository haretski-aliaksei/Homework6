import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class TestSuite {
    public static final String ONLINER_START_PAGE = "https://onliner.by";

    @Test
    public void checkDirectorySections() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver_win32\\chromedriver.exe");

        List<String> listOfSections = new ArrayList<>();
        listOfSections.add(Section.ELECTRONICS.getNameSection());
        listOfSections.add(Section.COMPUTERS_AND_NETWORKS.getNameSection());
        listOfSections.add(Section.APPLIANCES.getNameSection());
        listOfSections.add(Section.CONSTRUCTION_AND_REPAIR.getNameSection());
        listOfSections.add(Section.HOUSE_AND_GARDEN.getNameSection());
        listOfSections.add(Section.AUTO_AND_MOTO.getNameSection());
        listOfSections.add(Section.BEAUTY_AND_SPORTS.getNameSection());
        listOfSections.add(Section.FOR_CHILDREN_AND_MOTHERS.getNameSection());
        listOfSections.add(Section.WORK_AND_OFFICE.getNameSection());
        listOfSections.add(Section.FOOD.getNameSection());

        WebDriver driver = new ChromeDriver();
        driver.get(ONLINER_START_PAGE);
        driver.findElement(By.xpath("//a[contains(@href, 'catalog') and contains(text(), 'Каталог')]"))
                .click();

        CatalogHelper catalogHelper = new CatalogHelper(driver);

        Assertions.assertThat(catalogHelper.getCatalogItems().containsAll(listOfSections)).isTrue();
    }
}
