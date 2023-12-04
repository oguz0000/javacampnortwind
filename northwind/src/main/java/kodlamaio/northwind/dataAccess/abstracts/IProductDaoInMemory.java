package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import kodlamaio.northwind.entities.concrete.ProductInMemory;

public interface IProductDaoInMemory {
	
	void add(ProductInMemory productInMemory);

	List<ProductInMemory> getAll();
}
