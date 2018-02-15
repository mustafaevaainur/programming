import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception{
        System.out.println("* * * Magic! * * *");
        Main wwD = new Main();


        //nArray()
        int count=0;
        int lengh=0;
        int[] n = new int[lengh];
        int index;
        for (count=3; count<=25; count++) {
            if (count%2!=0) lengh++;
        }
        System.out.println(lengh);
        for (index=1, count=0; index<=count; index++) {
            if (index % 2 != 0) {
                n[count]=index;
                count++;
                System.out.println(n[count]);
            }
        }
    }
 // заполнить массив нечетными числами
    /*public static int nArray(int index) {
        int[] n = new int[26];
        for (index=1; index<=25; index++) {
            n[index]=index*2+1;
            System.out.println(n[index]);
        }
        return n[index];
    }
*/
    public static double xArray(int count) {
        int xSize = 15;
        double[] x = new double[xSize];
        double xtemp = 0.0;
        double minVal = -6.0;
        double maxVal = 8.0;
        for (count = 0; count < x.length; count++) {
            x[count] = (minVal + (Math.random() * maxVal));
            xtemp = x[count];
        }
        return xtemp;
    }

    private double x;

    public void workWithDoubleArray() {
        int iSize = 12;
        int jSize = 15;
        double[][] u = new double[iSize][jSize];
        for (int i = 0; i < iSize; i++) {
            for (int j = 0; j < jSize; j++) {
                this.x = xArray(j);

            }
        }
    }
}
