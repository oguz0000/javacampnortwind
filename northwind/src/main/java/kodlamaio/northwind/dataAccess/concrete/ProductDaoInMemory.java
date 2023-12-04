package kodlamaio.northwind.dataAccess.concrete;

import java.util.ArrayList;
import java.util.List;

import kodlamaio.northwind.dataAccess.abstracts.IProductDaoInMemory;
import kodlamaio.northwind.entities.concrete.ProductInMemory;

public class ProductDaoInMemory implements IProductDaoInMemory {
	 List<ProductInMemory> products= new ArrayList<ProductInMemory>();
	

	public ProductDaoInMemory(ProductInMemory daoInMemory) {
		super();
		
//		products.add(daoInMemory);
//		products.add(new Product(0, "buzdolabı", 0, 0, "10", null));

	}

	public List<ProductInMemory> getAll() {
		return products;
	}

	public void add(ProductInMemory p) {
		products.add(p);
	}

}
