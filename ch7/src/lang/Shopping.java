package lang;


	import java.util.ArrayList;
	import java.util.Scanner;

	public class Shopping {
	    
	    private ArrayList<Product> productList;
	    private ArrayList<Integer> cart;
	    private int totalCost;
	    
	    public Shopping() {
	        productList = new ArrayList<>();
	        cart = new ArrayList<>();
	        totalCost = 0;
	    }
	    
	    public void addProduct(Product p) {
	        productList.add(p);
	    }
	    
	    public void displayProducts() {
	        System.out.println("List of available products:");
	        for (int i = 0; i < productList.size(); i++) {
	            System.out.println(i + ". " + productList.get(i).getName() + " - $" + productList.get(i).getPrice());
	        }
	    }
	    
	    public void addToCart(int productIndex, int quantity) {
	        if (productIndex < 0 || productIndex >= productList.size()) {
	            System.out.println("Invalid product index.");
	            return;
	        }
	        cart.add(productIndex);
	        totalCost += productList.get(productIndex).getPrice() * quantity;
	    }
	    
	    public void displayCart() {
	        System.out.println("Shopping Cart:");
	        for (int i = 0; i < cart.size(); i++) {
	            int productIndex = cart.get(i);
	            System.out.println(productList.get(productIndex).getName() + " - $" + productList.get(productIndex).getPrice());
	        }
	        System.out.println("Total cost: $" + totalCost);
	    }
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Shopping cart = new Shopping();
	        cart.addProduct(new Product("Apple", 1.50));
	        cart.addProduct(new Product("Banana", 0.75));
	        cart.addProduct(new Product("Orange", 1.00));
	        cart.displayProducts();
	        while (true) {
	            System.out.print("Enter the product index to add to cart (-1 to checkout): ");
	            int productIndex = scanner.nextInt();
	            if (productIndex == -1) {
	                break;
	            }
	            System.out.print("Enter the quantity: ");
	            int quantity = scanner.nextInt();
	            cart.addToCart(productIndex, quantity);
	            cart.displayCart();
	        }
	    }
	}

	class Product {
	    
	    private String name;
	    private double price;
	    
	    public Product(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public double getPrice() {
	        return price;
	    }
	}



