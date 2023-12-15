package hacettepe.bilisim.business.abstracts;

import java.util.List;

import hacettepe.bilisim.core.utilities.results.DataResult;
import hacettepe.bilisim.core.utilities.results.Result;
import hacettepe.bilisim.entities.concrete.Product;

public interface ProductService {
	
	Result add(Product product);
	Result delete(int id);
	DataResult<List<Product>> getAll();

}
