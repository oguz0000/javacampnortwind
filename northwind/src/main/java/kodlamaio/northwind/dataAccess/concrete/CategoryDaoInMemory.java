package kodlamaio.northwind.dataAccess.concrete;

import java.util.ArrayList;

import kodlamaio.northwind.dataAccess.abstracts.ICategoryDaoInMemory;
import kodlamaio.northwind.entities.concrete.CategoryInMemory;
import kodlamaio.northwind.entities.concrete.Product;

public class CategoryDaoInMemory implements ICategoryDaoInMemory {


ICategoryDaoInMemory categoryDaoInMemory;
public CategoryDaoInMemory(ICategoryDaoInMemory categoryDaoInMemory) {
	super();
	this.categoryDaoInMemory = categoryDaoInMemory;
}

	@Override
	public void add(CategoryInMemory categoryInMemorry) {
		categoryDaoInMemory.add(categoryInMemorry);
		
	}

	@Override
	public ArrayList<CategoryInMemory> getAll() {
		// TODO Auto-generated method stub
		return categoryDaoInMemory.getAll();
	}

}
