package CRM;

public class Product {

    public static int currentProductId = 1;

    // productId, productName, productUnitPrice, productAvailability

    private Integer productId;
    private String productName;
    private Double productUnitPrice;
    private Boolean productAvailability;

   /* public Product(String productName) {
        this.productName = productName;
        this.productId = currentProductId++;
    }
    */

    //public Product() {
    //    this.productId = currentProductId++;
    //}

    public Product(String productName,  double productUnitPrice,  boolean productAvailability){
        this.productId = currentProductId++;
        this.productName = productName;
        this.productUnitPrice = productUnitPrice;
        this.productAvailability = productAvailability;
    }



    public Integer getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public Double getProductUnitPrice() {
        return productUnitPrice;
    }

    public Boolean getProductAvailability() {
        return productAvailability;
    }

    public void setProductAvailability( Boolean productAvailability) {
         this.productAvailability = productAvailability;
    }
/*
    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productUnitPrice='" + productUnitPrice + '\'' +
                ", productAvailability='" + productAvailability + '\'' +
                '}';
    }

 */
}
