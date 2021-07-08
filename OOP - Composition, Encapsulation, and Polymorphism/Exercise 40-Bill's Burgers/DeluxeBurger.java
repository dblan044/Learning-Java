public class DeluxeBurger extends Hamburger{
    public DeluxeBurger(){
        super("Deluxe", "Angus", 15.10, "White");
        super.addHamburgerAddition1("Chips", 1.50);
        super.addHamburgerAddition2("Drink", 2.50);
    }
    
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}