/**
 * This class runs the application and handles the models.Product I/O
 *
 * @author Mairead Meagher, Siobhan Drohan
 * @version 3.0
 *
 */
public class Driver{

    private Store store = new Store();

    public static void main(String[] args) {
        new Driver();
    }

    public Driver() {
        runMenu();
    }

    private int mainMenu(){
        int option = ScannerInput.readNextInt("""
               Shop Menu
               ---------
                  1) Add a product
                  2) List the Products
                  3) Update a models.Product
                  4) Delete a models.Product
                  ----------------------------
                  5) List the current products
                  6) Display average product unit cost
                  7) Display cheapest product
                  8) List products that are more expensive than a given price
                  ----------------------------
                  0) Exit
               ==>>  """);
        return option;
    }

    private void runMenu(){
        int option = mainMenu();

        while (option != 0){

            switch (option){
                case 1 -> addProduct();
                case 2 -> printProducts();
                case 3 -> updateProduct();
                case 4 -> deleteProduct();
                case 5 -> printCurrentProducts();
                case 6 -> printAverageProductPrice();
                case 7 -> printCheapestProduct();
                case 8 -> printProductsAboveAPrice();
                default -> System.out.println("Invalid option entered: " + option);
            }

            //pause the program so that the user can read what we just printed to the terminal window
            ScannerInput.readNextLine("\nPress enter key to continue...");

            //display the main menu again
            option = mainMenu();
        }

        //the user chose option 0, so exit the program
        System.out.println("Exiting...bye");
        System.exit(0);
    }

    //gather the product data from the user and create a new product object - add it to the collection.
    private void addProduct(){

        String productName = ScannerInput.readNextLine("Enter the models.Product Name:  ");
        int productCode = ScannerInput.readNextInt("Enter the models.Product Code:  ");
        double unitCost = ScannerInput.readNextDouble("Enter the Unit Cost:  ");

        //Ask the user to type in either a Y or an N.  This is then
        //converted to either a True or a False (i.e. a boolean value).
        char currentProduct = ScannerInput.readNextChar("Is this product in your current line (y/n): ");
        boolean inCurrentProductLine = false;
        if ((currentProduct == 'y') || (currentProduct == 'Y'))
            inCurrentProductLine = true;

        boolean isAdded = store.add(new models.Product(productName, productCode, unitCost, inCurrentProductLine));
        if (isAdded){
            System.out.println("models.Product Added Successfully");
        }
        else{
            System.out.println("No models.Product Added");
        }
    }

    //print the products stored in the collection
    private void printProducts(){
        System.out.println("List of Products are:");
        System.out.println(store.listProducts());
    }

    //print out a list of all current products i.e. that are in the current product line.
    private void printCurrentProducts(){
        System.out.println("List of CURRENT Products are:");
        System.out.println(store.listCurrentProducts());
    }

    //print out the average product price for all products stored in the array
    private void printAverageProductPrice(){
        double averagePrice = store.averageProductPrice();
        if (averagePrice != -1){
            System.out.println("The average product price is: " + averagePrice);
        }
        else{
            System.out.println("There are no products in the store.");
        }
    }
    //ask the user to enter the index of the object to delete, and assuming it's valid, delete it.
    private void deleteProduct(){
        printProducts();
        if (store.numberOfProducts() > 0){
            //only ask the user to choose the product to delete if products exist
            int indexToDelete = ScannerInput.readNextInt("Enter the index of the product to delete ==> ");
            //pass the index of the product to Store for deleting and check for success.
            models.Product productToDelete = store.deleteProduct(indexToDelete);
            if (productToDelete != null){
                System.out.println("Delete Successful! Deleted product: " + productToDelete.getProductName());
            }
            else{
                System.out.println("Delete NOT Successful");
            }
        }
    }
   private void updateProduct(){
        printProducts();
        int indexToUpdate = ScannerInput.readNextInt("Enter the index of the product you want to update: ");

        String productName = ScannerInput.readNextLine("Enter the models.Product name:  ");
        int productCode = ScannerInput.readNextInt("Enter the product code: ");
        double unitCost = ScannerInput.readNextDouble("Enter the unit cost:  ");
        char currentProduct = ScannerInput.readNextChar("Is this product in your current line (y/n): ");
        boolean inCurrentProductLine = false;
        if ((currentProduct == 'y') || (currentProduct == 'Y'))
            inCurrentProductLine = true;

        store.updateProduct(indexToUpdate, new models.Product(productName,productCode,unitCost,inCurrentProductLine));
    }


    //print out the product name that is the cheapest of those stored in the array
    private void printCheapestProduct(){
        models.Product cheapestProduct = store.cheapestProduct();
        if (cheapestProduct != null) {
            System.out.println("The cheapest product is:  " + cheapestProduct.getProductName());
        }
        else{
            System.out.println("There are no products in the store.");
        }
    }

    //ask the user to enter a price and print out all products costing that price or more.
    private void printProductsAboveAPrice(){
        double price = ScannerInput.readNextDouble("View the products costing more than this price:  ");
        System.out.println(store.listProductsAboveAPrice(price));
    }

}