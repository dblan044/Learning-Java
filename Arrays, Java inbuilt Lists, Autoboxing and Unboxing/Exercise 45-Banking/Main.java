public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");
        
        bank.addCustomer("Adelaide", "Diana", 50.05);
        bank.addCustomer("Adelaide", "Lester", 150.05);
        bank.addCustomer("Adelaide", "Sheyla", 290.05);
        
        bank.addCustomerTransaction("Adelaide", "Diana", 50.29);
        bank.addCustomerTransaction("Adelaide", "Lester", 350.29);
        bank.addCustomerTransaction("Adelaide", "Sheyla", 50.60);
        
        bank.listCustomers("Adelaide", true);
    }
}