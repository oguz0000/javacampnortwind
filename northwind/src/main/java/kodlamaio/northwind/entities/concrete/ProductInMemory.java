package kodlamaio.northwind.entities.concrete;

public class ProductInMemory {
	
private int Id;
private String productName;
private double unitPrice;
private int unitsInStock;
private String quantityPerUnit;
private CategoryInMemory category;

public ProductInMemory() {}
	


public ProductInMemory(int id, String productName, double unitPrice, int unitsInStock, String quantityPerUnit,
		CategoryInMemory categoryInMemory) {
	super();
	Id = id;
	this.productName = productName;
	this.unitPrice = unitPrice;
	this.unitsInStock = unitsInStock;
	this.quantityPerUnit = quantityPerUnit;
	this.category = categoryInMemory;
}

public int getId() {
	return Id;
}

public void setId(int id) {
	Id = id;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public double getUnitPrice() {
	return unitPrice;
}

public void setUnitPrice(double unitPrice) {
	this.unitPrice = unitPrice;
}

public int getUnitsInStock() {
	return unitsInStock;
}

public void setUnitsInStock(int unitsInStock) {
	this.unitsInStock = unitsInStock;
}

public String getQuantityPerUnit() {
	return quantityPerUnit;
}

public void setQuantityPerUnit(String quantityPerUnit) {
	this.quantityPerUnit = quantityPerUnit;
}

public CategoryInMemory getCategory() {
	return category;
}

public void setCategory(CategoryInMemory category) {
	this.category = category;
}

}
