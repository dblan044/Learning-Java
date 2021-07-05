public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }else {
            kilometersPerHour /= 1.609;
        }
        return Math.round(kilometersPerHour);
    }
    
    public static void printConversion(double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
}