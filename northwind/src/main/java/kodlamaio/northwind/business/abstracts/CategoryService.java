package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concrete.Category;

public interface CategoryService {
	Result add(Category category);
}
