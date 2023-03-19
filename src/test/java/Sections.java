public enum Sections {
    ELECTRONICS("Электроника"),
    COMPUTERS_AND_NETWORKS("Компьютеры и сети"),
    APPLIANCES("Бытовая техника"),
    ON_EVERY_DAY("На каждый день"),
    CONSTRUCTION_AND_REPAIR("Стройка и ремонт"),
    HOUSE_AND_GARDEN("Дом и сад"),
    AUTO_AND_MOTO("Авто и мото"),
    BEAUTY_AND_SPORTS("Красота и спорт"),
    FOR_CHILDREN_AND_MOTHERS("Детям и мамам");

    private String name;

    Sections(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
