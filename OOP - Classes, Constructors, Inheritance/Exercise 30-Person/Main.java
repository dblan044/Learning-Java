public class Main { 
    public static void main(String[] args) {
        Person person = new Person();

        person.setFirstName("");
        person.setLastName("");
        person.setAge(24);

        System.out.println("Full name = " + person.getFullName());
        System.out.println("is teen = " + person.isTeen());

        person.setLastName("Cepero");
        person.setAge(17);

        System.out.println("Full name = " + person.getFullName());
        System.out.println("is teen = " + person.isTeen());

        person.setFirstName("Lester");

        System.out.println("Full name = " + person.getFullName());
    }
}