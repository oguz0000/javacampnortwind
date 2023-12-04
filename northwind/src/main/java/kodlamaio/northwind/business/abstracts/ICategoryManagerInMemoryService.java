package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.entities.concrete.CategoryInMemory;

public interface ICategoryManagerInMemoryService {
	void add(CategoryInMemory categoryInMemory);

	List<CategoryInMemory> getAll();

}
