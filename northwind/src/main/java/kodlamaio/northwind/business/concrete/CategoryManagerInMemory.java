package kodlamaio.northwind.business.concrete;

import java.util.List;

import kodlamaio.northwind.business.abstracts.ICategoryManagerInMemoryService;
import kodlamaio.northwind.dataAccess.abstracts.ICategoryDaoInMemory;
import kodlamaio.northwind.entities.concrete.CategoryInMemory;

public class CategoryManagerInMemory implements ICategoryManagerInMemoryService {
	ICategoryDaoInMemory categoryDaoInMemory;

	

	public CategoryManagerInMemory(ICategoryDaoInMemory categoryDaoInMemory) {
		super();
		this.categoryDaoInMemory = categoryDaoInMemory;
	}

	@Override
	public void add(CategoryInMemory categoryInMemory) {
		categoryDaoInMemory.add(categoryInMemory);

	}

	@Override
	public List<CategoryInMemory> getAll() {

		return categoryDaoInMemory.getAll();
	}

}
