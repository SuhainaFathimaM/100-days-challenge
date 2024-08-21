import java.math.*;

class distance {

    public static double distance2d(int x1, int y1, int x2, int y2) {

        return Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
        
        
    }

    public static void main(String[] args) {

        System.out.println(distance2d(5,4,3,2));
        
    }
    
}
