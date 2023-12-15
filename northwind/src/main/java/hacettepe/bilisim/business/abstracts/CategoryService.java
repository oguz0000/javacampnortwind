package hacettepe.bilisim.business.abstracts;

import java.util.List;

import hacettepe.bilisim.core.utilities.results.DataResult;
import hacettepe.bilisim.core.utilities.results.Result;
import hacettepe.bilisim.entities.concrete.Category;

public interface CategoryService {
	Result add(Category category);

	Result delete(int id);

	DataResult<List<Category>> getAll();
}
