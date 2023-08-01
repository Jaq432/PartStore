package sample;

public class Outsourced extends Part{
    // Instantiate private variables
    private String companyName;

    // Generic constructor
    public Outsourced(){}

    // Detailed constructor
    public Outsourced(int id, String name, double price, int stock, int min, int max, String companyName){
        super.setId(id);
        super.setName(name);
        super.setPrice(price);
        super.setStock(stock);
        super.setMin(min);
        super.setMax(max);
        this.companyName = companyName;
    }

    // Setter for machineId
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    // Getter for machineId
    public String getCompanyName(){
        return this.companyName;
    }
}
