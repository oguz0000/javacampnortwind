package hacettepe.bilisim.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hacettepe.bilisim.business.abstracts.ProductService;
import hacettepe.bilisim.core.utilities.results.DataResult;
import hacettepe.bilisim.core.utilities.results.Result;
import hacettepe.bilisim.core.utilities.results.SuccessDataResult;
import hacettepe.bilisim.core.utilities.results.SuccessResult;
import hacettepe.bilisim.dataAccess.abstracts.ProductDao;
import hacettepe.bilisim.entities.concrete.Product;
import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service

public class ProductManager implements ProductService {
	private ProductDao productDao;



	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>(productDao.findAll(), "Başarıyla listelendi-bu mesaj PM dan gelir");
	}

	@Override
	public Result add(Product product) {
		productDao.save(product);
		return new SuccessResult("ürün eklendi");

	}

	@Override
	public Result delete( int id) {
		productDao.deleteById(id);
		return new SuccessResult("silindi");
	}

}
