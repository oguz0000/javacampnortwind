package hacettepe.bilisim.entities.concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data 							//lombok
@AllArgsConstructor 			//lombok 
@NoArgsConstructor 				//lombok
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int id;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "unit_price")
	private double unitPrice;
	
	
//	ORM-ilişkisel veritabanı ayarları
	
	@ManyToOne() //cascade = CascadeType.ALL
	@JoinColumn(name="category_id")
	private Category category;
}
