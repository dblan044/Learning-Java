public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2){
        if(((num1 >= 10) && (num1 <= 99)) && ((num2 >= 10) && (num2 <= 99))){
            int leftA = num1 / 10;
            int rightA = num1 % 10;
        
            int leftB = num2 / 10;
            int rightB = num2 % 10;
        
            return leftA == leftB || leftA == rightB || rightA == leftB || rightA == rightB;
        }
        
        return false;
    }
}