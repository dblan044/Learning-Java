import java.util.Scanner;
 
public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double average = 0;
        int count = 1;
       
        while(true){
            boolean isInt = sc.hasNextInt();
            
            if(isInt){
                int nums = sc.nextInt();
                sum += nums;
                average = (double) sum / count;
                count++;
            }else{
                System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
                break;
            }
        }
        sc.close();
    }
}