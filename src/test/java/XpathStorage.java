import org.openqa.selenium.By;

public class XpathStorage {
    public static final By CATALOG = By.xpath("//a[contains(@href, 'catalog') and contains(text(), 'Каталог')]");
    public static final By CATALOG_LIST = By.xpath("(//div[@class='catalog-navigation-list__aside-list'])[3]");
    public static final By ACCESSORIES_TITLE = By.xpath("//div[text()=' Комплектующие ']/..//span[contains(@class, 'title')]");
    public static final By ACCESSORIES_TEXT = By.xpath("//div[text()=' Комплектующие ']/..//span[3]/text()[1]/..");
    public static final By ACCESSORIES_TEXT_2 = By.xpath("//div[text()=' Комплектующие ']/..//span//following-sibling::text()[1]/..");
}
