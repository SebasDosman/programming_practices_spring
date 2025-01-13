package co.com.screenmatch.model;


public enum Category {
    ACTION("Action"),
    ROMANCE("Romance"),
    COMEDY("Comedy"),
    DRAMA("Drama"),
    CRIME("Crime");

    private final String name;

    Category(String name) {
        this.name = name;
    }

    public static Category fromString(String name) {
        for (Category category : Category.values()) {
            if (category.name.equalsIgnoreCase(name)) {
                return category;
            }
        }

        throw new IllegalArgumentException("No category with name ".concat(name));
    }
}
