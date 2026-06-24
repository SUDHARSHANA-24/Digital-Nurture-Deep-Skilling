package search;

public class SearchTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Product[] products = 
			{
	            new Product(1, "Laptop", "Electronics"),
	            new Product(2, "Mobile", "Electronics"),
	            new Product(3, "Shoes", "Fashion"),
	            new Product(4, "Watch", "Accessories")
	        };

	        // Linear Search
	        Product result1 =
	            LinearSearch.search(products, "Mobile");

	        if (result1 != null)
	            System.out.println("Linear Search Found: " + result1.productName);

	        // Binary Search (assume sorted array)
	        Product result2 =
	            BinarySearch.search(products, "Mobile");

	        if (result2 != null)
	            System.out.println("Binary Search Found: " + result2.productName);
	}

}
