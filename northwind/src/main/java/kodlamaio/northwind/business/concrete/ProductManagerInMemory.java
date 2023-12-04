package kodlamaio.northwind.business.concrete;

import java.util.List;

import org.hibernate.validator.constraints.ISBN;

import kodlamaio.northwind.business.abstracts.IProductManagerInMemoryService;
import kodlamaio.northwind.dataAccess.abstracts.IProductDaoInMemory;
import kodlamaio.northwind.entities.concrete.ProductInMemory;

public class ProductManagerInMemory implements IProductManagerInMemoryService {

	IProductDaoInMemory daoInMemory;
	public ProductManagerInMemory(IProductDaoInMemory daoInMemory) {
		super();
		this.daoInMemory = daoInMemory;
	}

	@Override
	public void add(ProductInMemory product) {
		// TODO Auto-generated method stub
		if (product.getProductName() == null) {
			System.out.println("urun ismi boş olamaz");
		}
		else {
			daoInMemory.add(product);
		}
		
		
	}

	@Override
	public List<ProductInMemory> getAll() {
		// TODO Auto-generated method stub
		return daoInMemory.getAll();
	}

}
