package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class Inventory {

    private static ObservableList<Part> allParts = FXCollections.observableList(null);
    private static ObservableList<Product> allProducts = FXCollections.observableList(null);

    public static void addPart(Part newPart){
        allParts.add(newPart);
    }

    public static void addProduct(Product newProduct){
        allProducts.add(newProduct);
    }

    public static Part lookupPart(int partId){
        return allParts.get(partId);
    }

    public static Product lookupProduct(int productId){
        return allProducts.get(productId);
    }

    public static ObservableList<Part> lookupPart(String partName){
        ObservableList<Part> partListToReturn = FXCollections.observableList(null);
        for (int i = 0; i <= allParts.size(); i++){
            if (allParts.get(i).getName() == partName){
                partListToReturn.add(allParts.get(i));
            }
        }
        return partListToReturn;
    }

    public static ObservableList<Product> lookupProduct(String productName){
        ObservableList<Product> productListToReturn = FXCollections.observableList(null);
        for (int i = 0; i <= allProducts.size(); i++){
            if (allProducts.get(i).getName() == productName){
                productListToReturn.add(allProducts.get(i));
            }
        }
        return productListToReturn;
    }

    public static void updatePart(int index, Part newPart){
        allParts.set(index, newPart);
    }

    public static void updateProduct(int index, Product newProduct){
        allProducts.set(index, newProduct);
    }

    public static boolean deletePart(Part selectedPart){
        if (allParts.contains(selectedPart)){
            allParts.remove(selectedPart);
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean deleteProduct(Product selectedProduct){
        if (allProducts.contains(selectedProduct)){
            allProducts.remove(selectedProduct);
            return true;
        }
        else{
            return false;
        }
    }

    public static ObservableList<Part> getAllParts(){
        return allParts;
    }

    public static ObservableList<Product> getAllProducts(){
        return allProducts;
    }

}
