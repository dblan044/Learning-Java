public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        int totalPaintBuckets = 0;
        
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        
        double area = width * height;
        int bucketNeeds = (int) Math.ceil(area / areaPerBucket);
        
        return bucketNeeds - extraBuckets;
    }
    
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        
        double area = width * height;
        return (int) Math.ceil(area / areaPerBucket);
    }
    
    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        return (int) Math.ceil(area / areaPerBucket);
    }
}