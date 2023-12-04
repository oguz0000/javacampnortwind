//package kodlamaio.northwind.api.controllers;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import kodlamaio.northwind.business.abstracts.IProductManagerInMemoryService;
//import kodlamaio.northwind.entities.concrete.Product;
//
//@RestController
//@RequestMapping("/api/productsinmemory")
//public class ProductInMemoryController {
//	
//	IProductManagerInMemoryService inMemoryService;
//
//	@Autowired
//	public ProductInMemoryController(IProductManagerInMemoryService inMemoryService) {
//		super();
//		this.inMemoryService = inMemoryService;
//	}
//
//	@GetMapping("/getall")
//	public List<Product> getAll() {
//		return inMemoryService.getAll();
//	}
//
//	@PostMapping("/add")
//	public void add(Product product) {
//		inMemoryService.add(product);
//	}
//}
