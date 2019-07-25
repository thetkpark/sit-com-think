/**
 * remainingDots
 */
import java.util.Random;

public class remainingDots {
    public static double remainDots(int n){
        double[] x = new double[n];
        double[] y = new double[n];
        int i;
        double count=0;

        Random r = new Random();

        for(i=0;i<n;i++){
            //x[i] = (-0.5) + r.nextDouble() * (0.5 - (-0.5));
            //y[i] = (-0.5) + r.nextDouble() * (0.5 - (-0.5));
            x[i] = Math.random() - 0.5;
            y[i] = Math.random() - 0.5;
        }

        for(i=0;i<n;i++){
            if(Math.sqrt((x[i]*x[i])+(y[i]*y[i]))<=0.5) count++;
        }
        double allpoint = n;
        return count/allpoint;

    }
    public static void main(String[] args) {
        double result = remainDots(Integer.parseInt(args[0]));
        System.out.println(result);
    }
    
}