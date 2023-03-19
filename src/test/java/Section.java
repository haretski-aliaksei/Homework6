public enum Section {
    ELECTRONICS("Электроника"),

    COMPUTERS_AND_NETWORKS("Компьютеры и сети"),

    APPLIANCES("Бытовая техника"),

    CONSTRUCTION_AND_REPAIR("Стройка и ремонт"),

    HOUSE_AND_GARDEN("Дом и сад"),

    AUTO_AND_MOTO("Авто и мото"),

    BEAUTY_AND_SPORTS("Красота и спорт"),

    FOR_CHILDREN_AND_MOTHERS("Детям и мамам"),

    WORK_AND_OFFICE("Работа и офис"),
    FOOD("Еда");

    private String nameSection;

    Section(String nameSection) {
        this.nameSection = nameSection;
    }

    public String getNameSection() {
        return nameSection;
    }
}
