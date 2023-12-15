package hacettepe.bilisim.business.rules;

import org.springframework.stereotype.Service;

import hacettepe.bilisim.core.utilities.exceptions.BusinessException;
import hacettepe.bilisim.dataAccess.abstracts.CategoryDao;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CategorytBusinessRules {
	private CategoryDao categoryDao;

	public void checkIfCategoryNameExists(String name) {
		if (categoryDao.existsBycategoryName(name)) {
			throw new BusinessException("KATEGORİ MEVCUT");
		}
	}
}
