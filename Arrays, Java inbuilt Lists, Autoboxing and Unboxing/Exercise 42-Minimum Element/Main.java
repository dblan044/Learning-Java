public static void main(String[] args) {
        
        int returnedInt = readInteger();
        int[] returnedArray = readElements(returnedInt);
        int returnedMin = findMin(returnedArray);
        
        System.out.println("Min = " + returnedMin);
    }