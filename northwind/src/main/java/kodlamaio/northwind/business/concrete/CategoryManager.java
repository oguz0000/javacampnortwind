package kodlamaio.northwind.business.concrete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.CategoryService;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.CategoryDao;
import kodlamaio.northwind.entities.concrete.Category;

@Service
public class CategoryManager implements CategoryService {
	private CategoryDao categoryDao;

	@Autowired
	public CategoryManager(CategoryDao categoryDao) {
		super();
		this.categoryDao = categoryDao;
	}

	@Override
	public Result add(Category category) {
		// TODO Auto-generated method stub
		categoryDao.save(category);
		return new SuccessResult("Kategori başarıyla eklendi");
	}

}
