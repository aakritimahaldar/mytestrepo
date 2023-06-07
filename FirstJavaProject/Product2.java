
public class Product2 {
	    public static void main(String[] args) {
	        Product product1 = new Product("Product 1", 10.99, 20);
	        Product product2 = new Product("Product 2", 5.99, 15);
	        Product product3 = new Product("Product 3", 8.99, 30);

	        product1.sell(5);
	        product2.sell(10);
	        product3.sell(25);

	        int totalSold = Product.getTotalSold();
	        System.out.println("Total quantity of products sold: " + totalSold);
	    }
	}