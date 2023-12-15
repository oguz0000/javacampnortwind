package hacettepe.bilisim.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hacettepe.bilisim.business.abstracts.CategoryService;
import hacettepe.bilisim.business.rules.CategorytBusinessRules;
import hacettepe.bilisim.core.utilities.results.DataResult;
import hacettepe.bilisim.core.utilities.results.Result;
import hacettepe.bilisim.core.utilities.results.SuccessDataResult;
import hacettepe.bilisim.core.utilities.results.SuccessResult;
import hacettepe.bilisim.dataAccess.abstracts.CategoryDao;
import hacettepe.bilisim.entities.concrete.Category;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CategoryManager implements CategoryService {
	private CategoryDao categoryDao;
	private CategorytBusinessRules rules;

	@Override
	public Result add(Category category) {
		rules.checkIfCategoryNameExists(category.getCategoryName());
		categoryDao.save(category);
		return new SuccessResult("Kategori başarıyla eklendi");
	}

	@Override
	public Result delete(int id) {
		// TODO Auto-generated method stub
		categoryDao.deleteById(id);
		return new SuccessResult("Kategori silindi");
	}

	@Override
	public DataResult<List<Category>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Category>>(categoryDao.findAll(), "Kategoriler başarıyla listelendi");
	}

}
