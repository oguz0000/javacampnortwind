package kodlamaio.northwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import kodlamaio.northwind.business.concrete.ProductManagerInMemory;
import kodlamaio.northwind.dataAccess.concrete.ProductDaoInMemory;
import kodlamaio.northwind.entities.concrete.CategoryInMemory;
import kodlamaio.northwind.entities.concrete.ProductInMemory;
import lombok.experimental.var;
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
//		CategoryInMemory categoryInMemory = new CategoryInMemory();
//		categoryInMemory.setCategoryId(1);
//
//		ProductDaoInMemory daoInMemory = new ProductDaoInMemory();
//		// Spring IoC ile çözülecek
//		ProductManagerInMemory inMemory = new ProductManagerInMemory(daoInMemory);
//		for (var item : inMemory.getAll()) {
//			System.out.println(item.getProductName());
//		}
			SpringApplication.run(NorthwindApplication.class, args);
	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build();

	}
}
