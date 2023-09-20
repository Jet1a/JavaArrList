public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        // Add several instances of Product to the inventory
        inventory.addProduct(new Product(1, "Product A", 10.0, 5));
        inventory.addProduct(new Product(2, "Product B", 15.0, 8));
        inventory.addProduct(new Product(3, "Product C", 20.0, 10));

        inventory.listProducts();

        // Update the stock quantity of a product based on productId
        int productIdToUpdate = 2; // For example, update Product B
        int quantityChange = -2;  // Decrease the stock quantity by 2

        inventory.updateStock(productIdToUpdate, quantityChange);

        // List all products to verify the stock update
        inventory.listProducts();
    }
}