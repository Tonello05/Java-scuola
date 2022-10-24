public class Mate {
    
    public static double MCM(double x, double y) {
        
        double mcm=0;


        
        do {
            mcm++;
        } while ((mcm % x)!= 0 || (mcm %y !=0));

        return mcm;

    }

}
