package package snackBar; 


public class Snack
{
    private static int maxId =0;
    private int id;
    private String name;
    private double quantity; 
    private double cost; 
    private int machineId;

    public Snack(String name, double quantity, double cost, int machineId)
    {
        maxId++;
        id=maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost; 
        this.machineId = machineId;
    }

    //getters 
    public int getSnackId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public double getQuantity()
    {
        return quantity;
    }
    public double getCost()
    {
        return cost; 
    }
    public int getMachineId()
    {
        return machineId;
    }

    //setters

    public void setName(String name)
    {
        this.name = name;
    }
    public void setQuantity(double quantity)
    {
        this.quantity = quantity;
    }
    public void setCost(double cost)
    {
        this.cost = cost;
    }
    public void setMachineId(int machineId)
    {
        this.machineId = machineId;
    }

}