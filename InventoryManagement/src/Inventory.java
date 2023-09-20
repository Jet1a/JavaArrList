import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Product> productList;

    public Inventory(){
        productList = new ArrayList<>();
    }
    public void addProduct(Product product){
        productList.add(product);
    }
    public void removeProduct(int productId){
        for (Product products:productList) {
            if (products.getProductId() == productId){
                productList.remove(products);
                break;
            }
        }
    }
    public void listProducts(){
        for (Product product: productList) {
            System.out.println("Product ID: " + product.getProductId());
            System.out.println("Name: " + product.getName());
            System.out.println("Price: $" + product.getPrice());
            System.out.println("Quantity in Stock: " + product.getQuantityInStock());
            System.out.println();
        }
    }
    public void updateStock(int productId, int quantityChange){
        for (Product product: productList) {
            if (product.getProductId() == productId){
                product.setQuantityInStock(product.getQuantityInStock() + quantityChange);
                break;
            }
        }
    }
}
