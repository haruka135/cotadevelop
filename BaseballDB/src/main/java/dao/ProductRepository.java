package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	
	private static ProductRepository instance = new ProductRepository();
	
	public static ProductRepository getInstance() {
		
		return instance;
		
	}
	
	public ProductRepository() {
		
		Product figure1 = new Product("무키 베츠","Mookie Betts");
		figure1.setPcode("A123");
		figure1.setMan("Apple");
		figure1.setUnitcoupon(5);
		figure1.setUnitprice(1000000);
		
		Product figure2 = new Product("무키 베츠","Mookie Betts");
		figure2.setPcode("A123");
		figure2.setMan("Apple");
		figure2.setUnitcoupon(5);
		figure2.setUnitprice(1000000);
		
		Product figure3 = new Product("무키 베츠","Mookie Betts");
		figure3.setPcode("A123");
		figure3.setMan("Apple");
		figure3.setUnitcoupon(5);
		figure3.setUnitprice(1000000);
		
		Product figure4 = new Product("무키 베츠","Mookie Betts");
		figure4.setPcode("A123");
		figure4.setMan("Apple");
		figure4.setUnitcoupon(5);
		figure4.setUnitprice(1000000);
		
		listOfProducts.add(figure1);
		listOfProducts.add(figure2);
		listOfProducts.add(figure3);
		listOfProducts.add(figure4);
		
	}
	
	public ArrayList<Product> getAllProducts() {
		
		return listOfProducts;
		
		
	}
	
	public Product getProductById(String pcode) {
		
		Product productById = null;
		
		for(int i=0;i<listOfProducts.size();i++) {
			
			Product product = listOfProducts.get(i);
			
			if(product!=null && product.getPcode() != null && product.getPcode().equals(pcode)) {
				
				productById = product;
				
				break;
			}
			
			
		}
		
		return productById;
	}
	
	public void addProduct(Product product) {
		
		listOfProducts.add(product);
		
		
	}
	

}
