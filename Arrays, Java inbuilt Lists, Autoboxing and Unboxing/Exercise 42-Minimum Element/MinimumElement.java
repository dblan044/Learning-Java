import java.util.*;

public class MinimumElement {
    private static int readInteger(){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        
        return count;
    }
    
    private static int[] readElements(int count){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[count];
        
        for (int i = 0; i < array.length; i++) {
            int number = sc.nextInt();
            sc.nextLine();
            
            array[i] = number;
        }
        return array;
    }
    
    private static int findMin(int[] array){
        int minimum = array[0];
        
        for (int i = 0; i < array.length; i++) {
            if(minimum > array[i]){
                minimum = array[i];
            }
        }
        return minimum;
    }
}