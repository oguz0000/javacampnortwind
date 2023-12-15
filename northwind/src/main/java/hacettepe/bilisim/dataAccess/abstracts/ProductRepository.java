package hacettepe.bilisim.dataAccess.abstracts;

import java.util.List;

import hacettepe.bilisim.entities.concrete.Product;

public interface ProductRepository {
	void add(Product p);

	List<Product> getAll();
}
