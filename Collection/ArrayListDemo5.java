package Collection;

import java.util.ArrayList;
import java.util.List;

class Product {
   public int productId;
   public String productName;
   public double ProductPrice;
   public Product(){

   }
   public Product(int productId, String productName, double productPrice) {
    this.productId = productId;
    this.productName = productName;
    ProductPrice = productPrice;
}
   public int getProductId() {
    return productId;
   }
   public void setProductId(int productId) {
    this.productId = productId;
   }
   public String getProductName() {
    return productName;
   }
   public void setProductName(String productName) {
    this.productName = productName;
   }
   public double getProductPrice() {
    return ProductPrice;
   }
   public void setProductPrice(double productPrice) {
    ProductPrice = productPrice;
   }
   @Override
   public String toString() {
    return "Product [productId=" + productId + ", productName=" + productName + ", ProductPrice=" + ProductPrice + "]";
   }
   
    
}

public class ArrayListDemo5 {
    public List<Product> getProductDetails(){
         Product p1 = new Product(100, "Iphone 16", 100000);
    Product p2 = new Product(101, "Samsung galaxy 23 ", 70000);
    Product p3 = new Product(102, "Iphone 15", 50000);
    Product p4 = new Product(103, "Iphone 14", 40000);
    Product p5 = new Product(104, "Realme", 30000);
    Product p6 = new Product(105, "Moto", 10000);
    Product p7 = new Product(106, "Iphone", 25000);
     Product p8 = new Product(100, "Iphone 16", 100000);
    ArrayList <Product> allProduct = new ArrayList<>();
    allProduct.add(p1);
    allProduct.add(p2);
    allProduct.add(p3);
    allProduct.add(p4);
    allProduct.add(p1);
    // System.out.println(allProduct);
    // System.out.println(allProduct.size());
    
    // allProduct.remove(p4);

    // System.out.println(allProduct);
    // System.out.println(allProduct.size());
    allProduct.add(0,new Product());
    for (Product product : allProduct) {

        System.out.println(product);
    }
    return allProduct;

    }
    
    public static void main(String[] args) {
        // product Arraylist
        //Add only Product data type Object
    // Product p1 = new Product(100, "Iphone 16", 100000);
    // Product p2 = new Product(101, "Samsung galaxy 23 ", 70000);
    // Product p3 = new Product(102, "Iphone 15", 50000);
    // Product p4 = new Product(103, "Iphone 14", 40000);
    // Product p5 = new Product(104, "Realme", 30000);
    // Product p6 = new Product(105, "Moto", 10000);
    // Product p7 = new Product(106, "Iphone", 25000);
    //  Product p8 = new Product(100, "Iphone 16", 100000);
    // ArrayList <Product> allProduct = new ArrayList<>();
    // allProduct.add(p1);
    // allProduct.add(p2);
    // allProduct.add(p3);
    // allProduct.add(p4);
    // allProduct.add(p1);
    // // System.out.println(allProduct);
    // // System.out.println(allProduct.size());
    
    // // allProduct.remove(p4);

    // // System.out.println(allProduct);
    // // System.out.println(allProduct.size());
    // allProduct.add(0,new Product());
    // for (Product product : allProduct) {

    //     System.out.println(product);
    }
}

    
    

