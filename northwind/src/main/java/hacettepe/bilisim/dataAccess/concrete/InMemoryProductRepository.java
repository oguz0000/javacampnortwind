package hacettepe.bilisim.dataAccess.concrete;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import hacettepe.bilisim.dataAccess.abstracts.ProductRepository;
import hacettepe.bilisim.entities.concrete.Product;

@Service // IoC. bu sınıfı new leyerek referansını tutar. @Autowired olan yerde bu
			// referansı kullanır.
@Repository // bu sınıf bir verierişim nesnesidir.

public class InMemoryProductRepository implements ProductRepository {
	List<Product> products = new ArrayList<Product>();

	@Override
	public void add(Product p) {
		// TODO Auto-generated method stub
		products.add(p);
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub

		return products;
	}

}
