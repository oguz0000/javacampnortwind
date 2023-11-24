package kodlamaio.northwind.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.ErrorResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.Dtos.ProductWithCategoryDto;
import kodlamaio.northwind.entities.concrete.Product;
import lombok.experimental.var;

@Service
public class ProductManager implements ProductService {
	private ProductDao productDao;

	@Autowired
	public ProductManager(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {

		return new SuccessDataResult<List<Product>>(productDao.findAll(), 
				"Başarıyla listelendi-bu mesaj PM dan gelir");
	}

	@Override
	public Result add(Product product) {
		productDao.save(product);
		return new SuccessResult("ürün eklendi-bu mesaj PM dan gelir");

	}

	@Override
	public Result delete(Product product) {
		productDao.delete(product);
		return new SuccessResult("silindi");
	}

	@Override
	public DataResult<Product> getByProductNameAndCategory_CategoryId(String productName, int categoryId) {

		return new SuccessDataResult<Product>(
				productDao.getByProductNameAndCategory_CategoryId(productName, categoryId));
	}

	@Override
	public DataResult<List<Product>> getByProductNameOrCategory_CategoryId(String productName, int categoryId) {

		return new SuccessDataResult<List<Product>>(productDao.getByProductNameOrCategory_CategoryId(productName, categoryId), "ürün lstelendi");
	}

	@Override
	public DataResult<List<Product>> getByCategoryIn(List<Integer> categories) {
		
		return new SuccessDataResult<List<Product>>(productDao.getByCategoryIn(categories));
	}

	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		
		return new SuccessDataResult<List<Product>>(productDao.getByProductNameContains(productName),"başarılı");
	}

	@Override
	public DataResult<List<Product>> getByProductNameStartsWith(String productName) {

		return new SuccessDataResult<List<Product>>(productDao.getByProductNameStartsWith(productName),"bu mesaj pr. manager dan geliyor");
	}

	@Override
	public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {

		return new SuccessDataResult<List<Product>>(productDao.getByNameAndCategory(productName, categoryId));
	}

	@Override
	public DataResult<Product> getByProductName(String productName) {
		
		return new SuccessDataResult<Product>(productDao.getByProductName(productName),"başarıyla listelendi");
	}

	@Override
	public DataResult<List<Product>> getPageSizeAndNo(int pageNo, int PageSize) {
		Pageable pageable=PageRequest.of(--pageNo, PageSize);
		return new SuccessDataResult<List<Product>>(productDao.findAll(pageable).getContent());
	
	}

	@Override
	public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails() {
		// TODO Auto-generated method stub
		 return new SuccessDataResult<List<ProductWithCategoryDto>>(productDao.getProductWithCategoryDetails(),"başarıyla listelendi");
	}

}
