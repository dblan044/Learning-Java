public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        bigCount *= 5;
        int sum = bigCount + smallCount;
        
        if((bigCount < 0) || (smallCount < 0) || (goal < 0)){
            return false;
        }
        
        if(sum == goal){
            return true;
        }
        
        if(goal > sum){
            return false;
        }
        
        if((goal % 5) > smallCount){
            return false;
        }
        return true;
    
    }
}