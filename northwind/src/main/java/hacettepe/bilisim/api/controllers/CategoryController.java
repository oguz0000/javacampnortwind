package hacettepe.bilisim.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hacettepe.bilisim.business.abstracts.CategoryService;
import hacettepe.bilisim.core.utilities.results.DataResult;
import hacettepe.bilisim.core.utilities.results.Result;
import hacettepe.bilisim.entities.concrete.Category;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController // anotasyon
@RequestMapping("/api/category")
public class CategoryController {

	private CategoryService categoryService;

	@PostMapping("/add")
	public Result add(@RequestBody Category category) {
//		Category category = new Category();
//		category.setCategoryName(name);
		return categoryService.add(category);
	}

	@DeleteMapping("/{id}")
	public Result delete(@PathVariable int id) {
		return categoryService.delete(id);
	}

	@GetMapping("/getall")
	public DataResult<List<Category>> getAll() {

		return categoryService.getAll();
	}
}
