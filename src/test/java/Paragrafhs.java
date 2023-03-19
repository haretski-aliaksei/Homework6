public enum Paragrafhs {

    LAPTOPS_COMPUTERS_MONITORS("Ноутбуки, компьютеры, мониторы"),
    COMPONENTS("Комплектующие"),
    DATA_STORAGE("Хранение данных"),
    NETWORK_HARDWARE("Сетевое оборудование");

    private String name;

    Paragrafhs(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
