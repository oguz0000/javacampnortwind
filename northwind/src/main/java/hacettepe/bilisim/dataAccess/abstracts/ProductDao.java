package hacettepe.bilisim.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hacettepe.bilisim.entities.concrete.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
}
