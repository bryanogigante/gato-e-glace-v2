import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class Main { // A classe Main deve estar no arquivo Main.java
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

        System.out.println("--- Cadastro de Produto e Item de Estoque ---");

        // 1. Cadastrar um Produto
        System.out.print("Digite o nome do produto: ");
        String productName = scanner.nextLine();

        System.out.print("Digite a categoria do produto (Doce/Cafe): ");
        String productCategory = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double productPrice = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha restante após nextDouble()

        Product newProduct = new Product(productName, productCategory, productPrice);
        System.out.println("\nProduto cadastrado: " + newProduct);

        // 2. Cadastrar um Item de Estoque para o produto
        System.out.print("Digite a quantidade inicial em estoque para este produto: ");
        int initialQuantity = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        StockItem newStockItem = new StockItem(newProduct, initialQuantity);
        System.out.println("Item de estoque cadastrado: " + newStockItem);

        // Exemplo de manipulação do estoque
        System.out.print("\nQuantos itens você quer adicionar ao estoque? ");
        int addAmount = scanner.nextInt();
        scanner.nextLine();
        newStockItem.addQuantity(addAmount);
        System.out.println("Estoque atualizado: " + newStockItem);

        System.out.print("Quantos itens você quer remover do estoque? ");
        int removeAmount = scanner.nextInt();
        scanner.nextLine();
        newStockItem.removeQuantity(removeAmount);
        System.out.println("Estoque atualizado: " + newStockItem);

        scanner.close(); // Fecha o scanner para liberar recursos
    }
}
//ANA MARIA 