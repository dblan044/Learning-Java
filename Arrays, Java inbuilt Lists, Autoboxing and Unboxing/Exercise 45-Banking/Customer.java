import java.util.*;

public class Customer {
    private String name;
    private ArrayList transactions;
    
    public Customer(String name, double initialAmount){
        this.name = name;
        this.transactions = new ArrayList();
        addTransaction(initialAmount);
    }
    
    public String getName(){
        return this.name;
    }
    
    public ArrayList getTransactions(){
        return this.transactions;
    }
    
    public void addTransaction(double transaction){
        this.transactions.add(transaction);
    }
}