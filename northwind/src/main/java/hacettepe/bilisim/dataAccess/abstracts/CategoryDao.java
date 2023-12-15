package hacettepe.bilisim.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hacettepe.bilisim.entities.concrete.Category;


public interface CategoryDao extends JpaRepository<Category, Integer> {
boolean existsBycategoryName(String name);
///* exist ile başlayanlar spring JPA keyword dir.*/
}
