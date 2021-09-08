import java.util.*;

public class SortedArray {
    public static int[] getIntegers(int num){
        Scanner sc = new Scanner(System.in);
        int[] values = new int[num];
            
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
        }
            
        return values;
    }
    
    public static void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
    
    public static int[] sortIntegers(int[] array){
        int[] sortedArray = new int[array.length];
        System.arraycopy(array, 0, sortedArray, 0, sortedArray.length);
        
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
                
            }
        }
        
        return sortedArray;
    }
}