public class Product {
    private static long nextId = 1;

    private long id;
    private String name;
    private String category; // "Doce" ou "Café"
    private double price;

    public Product(String name, String category, double price) {
        this.id = nextId++;
        setName(name); // Usa o setter para validar
        setCategory(category); // Usa o setter para validar
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty() || name.matches(".*\\d.*")) {
            throw new IllegalArgumentException("O nome não pode ser vazio nem conter números.");
        }
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (!"Doce".equalsIgnoreCase(category) && !"Café".equalsIgnoreCase(category)) {
            throw new IllegalArgumentException("Categoria deve ser 'Doce' ou 'Café'.");
        }
        this.category = category.substring(0, 1).toUpperCase() + category.substring(1).toLowerCase();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | %s (%s) - R$ %.2f", id, name, category, price);
    }
}
// CATHARINE E MARIA EDUARDA

