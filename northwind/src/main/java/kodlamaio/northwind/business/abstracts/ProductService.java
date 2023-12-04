package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.Dtos.ProductWithCategoryDto;
import kodlamaio.northwind.entities.concrete.Product;

public interface ProductService {
	Result add(Product product);
	
	//test amaçlı hazırlandı
	 void addtest(Product product);
	 List<Product> getAlltest();

	Result delete(Product product);

	DataResult<Product> getByProductName(String productName);

	DataResult<List<Product>> getAll();

	DataResult<List<Product>> getPageSizeAndNo(int pageNo, int PageSize);

	DataResult<Product> getByProductNameAndCategory_CategoryId(String productName, int categoryId);

	DataResult<List<Product>> getByProductNameOrCategory_CategoryId(String productName, int categoryId);

	DataResult<List<Product>> getByCategoryIn(List<Integer> categories);

	DataResult<List<Product>> getByProductNameContains(String productName);

	DataResult<List<Product>> getByProductNameStartsWith(String productName);

	DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);
	
	DataResult<List<ProductWithCategoryDto>>   getProductWithCategoryDetails();
}
