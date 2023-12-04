package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.entities.Dtos.ProductWithCategoryDto;
import kodlamaio.northwind.entities.concrete.Product;
import lombok.experimental.var;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	private ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")

	public DataResult<List<Product>> getall() {
		return productService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		return productService.add(product);

	}
	//test amaçlı oluşturuldu
	@PostMapping("/addtest")
	public void addtest(@RequestBody Product product) {
		
		productService.addtest(product);		
	}
	//test amaçlı oluşturuldu
	@GetMapping("/getalltest")
	public List<Product> getalltest(){
		return productService.getAlltest();
	}
	//test amaçlı oluşturuldu
		@GetMapping("/getintlisttest")
		public int intlisttest(){
			
			return 5;
		}
	
	
	@PostMapping("/delete")
	public Result delete(@RequestBody Product product) {
		return productService.delete(product);

	}
	@GetMapping("/getByCategoryIn")

	public DataResult<List<Product>> getByCategoryIn(List<Integer>  categories_id) {
		return productService.getByCategoryIn(categories_id);
	}
	@GetMapping("/getByProductName")

	public DataResult<Product> getByProductName(@RequestParam String productName) {
		return productService.getByProductName(productName);
	}
	@GetMapping("/getByProductNameStartsWith")

	public DataResult<List<Product>> getByProductNameStartsWith( String productName) {
		return productService.getByProductNameStartsWith(productName);
	}
	@GetMapping("/getByProductNameAndCategory_CategoryId")

	public DataResult<Product> getByProductNameAndCategory_CategoryId(@RequestParam String productName, @RequestParam int categoryid) {
		return productService.getByProductNameAndCategory_CategoryId(productName, categoryid);
	}
	@GetMapping("/getByProductNameContains")

	public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName) {
		return productService.getByProductNameContains(productName);
	}
	@GetMapping("/getPageSizeAndNo")

	public DataResult<List<Product>> getPageSizeAndNo(int pageNo, int PageSize) {
		return productService.getPageSizeAndNo(pageNo, PageSize);
	}
	@GetMapping("/getProductWithCategoryDetails")
	public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails(){
		return productService.getProductWithCategoryDetails();
	}
}
