package snackBar; 

public class Customer
{
//     * maxId - keep track of last used customer id
        private static int maxId = 0;   
//     * id - automatically generated field
        private int id;
//     * name
        private String name;
//     * cash on hand
        private double cash;

    public Customer (String name, double cash, int id)
    {
        maxId++;
        id=maxId;

        this.name = name;
        this.cash = cash;
    }   

    //getters
    public getCustomerId()
    {
        return id;
    }
    public getCustomerName()
    {
        return name;
    }
    public getCash()
    {
        return cash;
    }

    //setters
    public void setName(String name)
    {
        this.name
    }
    

}