package kodlamaio.northwind;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import kodlamaio.northwind.business.concrete.ProductManagerInMemory;
import kodlamaio.northwind.dataAccess.concrete.ProductDaoInMemory;
import kodlamaio.northwind.entities.concrete.CategoryInMemory;
import kodlamaio.northwind.entities.concrete.ProductInMemory;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@Component
public class NorthwindApplication {

	public static void main(String[] args) {
		CategoryInMemory categoryInMemory= new CategoryInMemory();
		categoryInMemory.setCategoryId(1);
		ProductInMemory productInMemory = new ProductInMemory(1, null, 0, 0, "12", categoryInMemory);

		ProductDaoInMemory daoInMemory = new ProductDaoInMemory(productInMemory);
		ProductManagerInMemory inMemory = new ProductManagerInMemory(daoInMemory);
		inMemory.add(productInMemory);
		for (var item : inMemory.getAll()) {
			System.out.println(item.getProductName()+" "+item.getCategory().getCategoryId());
		}
//			SpringApplication.run(NorthwindApplication.class, args);
	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build();

	}
}
