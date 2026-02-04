import java.util.ArrayList;

public class Store {

    private ArrayList<Product> products;

    public Store() {
        products = new ArrayList<Products>();
    }

    private boolean isFull() {
        return total == products.length;
    }

    private boolean isEmpty() {
        return total == 0;
    }


    public boolean add (Product product){
        return products.add (product);
    }

    public String listProducts(){
        if (products.isEmpty()) {
            return "No products in store";
        } else {
            String listOfProducts = "";
            for (int i = 0; i < products.size(); i++) {
                listOfProducts += i + ": " + products.get(i) + "\n";
            }
            return listOfProducts;
        }
    }

    public Product cheapestProduct() {
        if (!isEmpty()) {
            Product cheapestProduct = products[0];
            for (int i = 1; i < total; i++) {
                if (products[i].getUnitCost() < cheapestProduct.getUnitCost())
                    cheapestProduct = products[i];
            }
            return cheapestProduct;
        } else {
            return null;
        }
    }

    public String listCurrentProducts() {
        if (isEmpty()) {
            return "No Products in the store";
        } else {
            String listOfProducts = "";
            for (int i = 0; i < total; i++) {
                if (products.get(i).isInCurrentProductLine())
                    listOfProducts += i + ": " + products(i) + "\n";
            }
            if (listOfProducts.equals("")){
                return "No Products are in our current product line";
            }
            else{
                return listOfProducts;
            }
        }
    }

    public double averageProductPrice() {
        if (!isEmpty()) {
            double totalPrice = 0;
            for (int i =0; i < total; i++){
                totalPrice += products[i].getUnitCost();
            }
        }
    }

    public String listProductsAboveAPrice(double price) {
        if (isEmpty()) {
            return "No Products in the store";
        } else {
            String str = "";
            for (int i = 0; i < total; i++) {
                if (products[i].getUnitCost() > price)
                    str += i + ": " + products[i] + "\n";
            }
            if (str.equals("")) {
                return "No products are more expensive than: " + price;
            } else {
                return str;
            }
        }
    }

}
