package inventory;

public class InventoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InventoryManager manager = new InventoryManager();

        Product p1 = new Product(101, "Laptop", 10, 50000);
        Product p2 = new Product(102, "Mouse", 50, 500);

        manager.addProduct(p1);
        manager.addProduct(p2);
        System.out.println("\nInventory:");
        manager.displayProducts();
        manager.updateProduct(101,15,52000);
        System.out.println("\nAfter Update:");
        manager.displayProducts();
        manager.deleteProduct(102);
        System.out.println("\nAfter Deletion:");
        manager.displayProducts();
	}

}
