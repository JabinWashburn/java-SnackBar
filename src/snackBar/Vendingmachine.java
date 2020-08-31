package snackBar; 

public class Vendingmachine
{
    public int maxId=0;
    public int id; 
    public String name;

    public Vendingmachine(String name)
    {
        maxId++;
        id=maxId;
        this.name = name;
    }    

    //getters
    public int getMachineId()
    {
        return id; 
    }
    public String getName()
    {
    return name;
    } 
    //setters
    public void setName(String name)
    {
        this.name = name;
    }
}