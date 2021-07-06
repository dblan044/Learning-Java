public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        int firstDigit = 0;
        int lastDigit = 0;
        int sum = 0;
        
        if(number < 0){
            return -1;
        }
        
        lastDigit = number % 10;
        
        while(number != 0){
            firstDigit =  number % 10;
            number /= 10;
                
            sum = firstDigit + lastDigit;
        }
        return sum;
    }
}