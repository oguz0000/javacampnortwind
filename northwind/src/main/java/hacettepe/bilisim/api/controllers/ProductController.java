package hacettepe.bilisim.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hacettepe.bilisim.business.abstracts.ProductService;
import hacettepe.bilisim.core.utilities.results.DataResult;
import hacettepe.bilisim.core.utilities.results.Result;
import hacettepe.bilisim.dataAccess.abstracts.ProductRepository;
import hacettepe.bilisim.entities.concrete.Category;
import hacettepe.bilisim.entities.concrete.Product;
import lombok.AllArgsConstructor;
@AllArgsConstructor
@RestController
@RequestMapping("/api/products")
public class ProductController {
	private ProductService productService; // veritabanına bağlanır
	private ProductRepository productRepository;// bellege(koleksiyona) bağlanır

	@GetMapping("/getall")

	public DataResult<List<Product>> getall() {
		return productService.getAll();
	}

	@GetMapping("/getallInMemory")

	public List<Product> getAllInMemory() {
		return productRepository.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		return productService.add(product);
	}

	@DeleteMapping("/{id}")
	public Result delete(@PathVariable int id) {
		return productService.delete(id);

	}

}
