import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int iSize = 12;
        int jSize = 15;
        int xSize = 15;

        int[] n = {3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25}; //govnocode
        double[] x = new double[xSize];
        double[][] u = new double[iSize][jSize];

        double minVal = -6.0;
        double maxVal = 8.0;
        for (int t=0; t<x.length; t++) {
            x[t] = (minVal + (Math.random()* maxVal));
            System.out.println(t + ": " + String.valueOf(x[t]));
        }

        for (int i=0; i<iSize; i++){
            for (int j=0; j<jSize; j++) {
                System.out.println();
            }
        }
    }
}
