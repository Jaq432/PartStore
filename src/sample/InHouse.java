package sample;

public class InHouse extends Part{
    // Instantiate private variables
    private int machineId;

    // Generic constructor
    public InHouse(){}

    // Detailed constructor
    public InHouse(int id, String name, double price, int stock, int min, int max, int machineId){
        super.setId(id);
        super.setName(name);
        super.setPrice(price);
        super.setStock(stock);
        super.setMin(min);
        super.setMax(max);
        this.machineId = machineId;
    }

    // Setter for machineId
    public void setMachineId(int machineId){
        this.machineId = machineId;
    }

    // Getter for machineId
    public int getMachineId(){
        return this.machineId;
    }
}
