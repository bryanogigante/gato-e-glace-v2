public class StockItem {
    private Product product;
    private int quantity;

    public StockItem(Product product, int quantity) {
        if (product == null) {
            throw new IllegalArgumentException("Produto não pode ser nulo.");
        }
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantidade inicial não pode ser negativa.");
        }
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Não é possível adicionar quantidade negativa.");
        }
        this.quantity += amount;
    }

    public void removeQuantity(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Não é possível remover quantidade negativa.");
        }
        if (amount > this.quantity) {
            throw new IllegalArgumentException("Quantidade a remover excede o estoque disponível.");
        }
        this.quantity -= amount;
    }

    @Override
    public String toString() {
        return String.format("%s | Estoque: %d", product.toString(), quantity);
    }
}
// JOSE WILSON E BRYAN