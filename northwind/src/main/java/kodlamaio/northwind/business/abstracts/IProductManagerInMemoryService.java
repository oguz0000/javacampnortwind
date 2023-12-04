package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.entities.concrete.ProductInMemory;

public interface IProductManagerInMemoryService {
	void add(ProductInMemory product);

	List<ProductInMemory> getAll();
}
