import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class TestSuite {
    public static final String ONLINER_START_PAGE = "https://onliner.by";

    @Test
    public void checkDirectorySections() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver_win32\\chromedriver.exe");

        List<String> listOfSections = new ArrayList<>();
        listOfSections.add(Sections.ELECTRONICS.getName());
        listOfSections.add(Sections.COMPUTERS_AND_NETWORKS.getName());
        listOfSections.add(Sections.APPLIANCES.getName());
        listOfSections.add(Sections.ON_EVERY_DAY.getName());
        listOfSections.add(Sections.CONSTRUCTION_AND_REPAIR.getName());
        listOfSections.add(Sections.HOUSE_AND_GARDEN.getName());
        listOfSections.add(Sections.AUTO_AND_MOTO.getName());
        listOfSections.add(Sections.BEAUTY_AND_SPORTS.getName());
        listOfSections.add(Sections.FOR_CHILDREN_AND_MOTHERS.getName());

        WebDriver driver = new ChromeDriver();
        driver.get(ONLINER_START_PAGE);
        driver.findElement(XpathStorage.CATALOG).click();

        OnlinerCatalogHelper catalogHelper = new OnlinerCatalogHelper(driver);

        Assertions.assertThat(catalogHelper.getListOfCatalogItems().containsAll(listOfSections)).isTrue();

        driver.close();
    }

    @Test
    public void checkComputerAndNetworksSection() {
        int indexNumber = 2;

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver_win32\\chromedriver.exe");

        List<String> listOfParagrafhs = new ArrayList<>();
        listOfParagrafhs.add(Paragrafhs.LAPTOPS_COMPUTERS_MONITORS.getName());
        listOfParagrafhs.add(Paragrafhs.COMPONENTS.getName());
        listOfParagrafhs.add(Paragrafhs.DATA_STORAGE.getName());
        listOfParagrafhs.add(Paragrafhs.NETWORK_HARDWARE.getName());

        WebDriver driver = new ChromeDriver();
        driver.get(ONLINER_START_PAGE);
        driver.findElement(XpathStorage.CATALOG).click();

        OnlinerCatalogHelper catalogHelper = new OnlinerCatalogHelper(driver);
        catalogHelper.chooseItemFromCatalog(indexNumber);

        Assertions.assertThat(driver.findElement(XpathStorage.CATALOG_LIST).isDisplayed()).isTrue();
        Assertions.assertThat(catalogHelper.getItemsFromComputersParagrafh().containsAll(listOfParagrafhs)).isTrue();

        driver.close();
    }

    @Test
    public void checkElementsInAccessories() {
        int indexNumber = 2;

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(ONLINER_START_PAGE);
        driver.findElement(XpathStorage.CATALOG).click();

        OnlinerCatalogHelper catalogHelper = new OnlinerCatalogHelper(driver);
        catalogHelper.chooseItemFromCatalog(indexNumber);
        catalogHelper.findAccessoriesParagrafh(Paragrafhs.COMPONENTS.getName());

        Assertions.assertThat(driver.findElements(XpathStorage.ACCESSORIES_TITLE)).allMatch(WebElement::isDisplayed);
        Assertions.assertThat(driver.findElements(XpathStorage.ACCESSORIES_TEXT)).allMatch(WebElement::isDisplayed);
        Assertions.assertThat(driver.findElements(XpathStorage.ACCESSORIES_TEXT_2)).allMatch(WebElement::isDisplayed);

        driver.close();
    }
}
