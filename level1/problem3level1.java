public class problem3level1{
    public static void main(String[] args) {
        
        double kilometers = 10.8;
        double conversionFactor = 1.6;   // 1 mile = 1.6 km
        
        double miles = kilometers / conversionFactor;
        
        System.out.println("The distance " + kilometers + 
                           " km in miles is " + miles);
    }
}