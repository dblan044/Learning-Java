import java.util.*;

public class Main { 
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 7, 11, 9, 15};
        System.out.println("Unsorted array " + Arrays.toString(array));
        
        reverse(array);
        System.out.println("Reversed array " + Arrays.toString(array));
    }
}