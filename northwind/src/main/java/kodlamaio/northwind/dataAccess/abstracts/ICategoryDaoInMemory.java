package kodlamaio.northwind.dataAccess.abstracts;

import java.util.ArrayList;

import kodlamaio.northwind.entities.concrete.CategoryInMemory;

public interface ICategoryDaoInMemory {
	void add(CategoryInMemory categoryInMemorry );

	ArrayList<CategoryInMemory> getAll();
}
