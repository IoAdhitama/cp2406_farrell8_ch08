import java.util.Scanner;

public class DistanceFromAverage
{
    public static void main(String[] args)
    {
        int x = 0, y;
        double[] array = new double[20];
        double entry, sum = 0, avg, avgDist;
        final int STOP = 99999;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number of double. Enter 99999 to stop: ");
        entry = input.nextDouble();

        while (entry != STOP)
        {
            array[x] = entry;
            sum = sum + entry;
            x = x + 1;
            System.out.print("Enter a number of double. Enter 99999 to stop: ");
            entry = input.nextDouble();
        }

        avg = sum / x;

        System.out.println("The average is " + avg);

        for (y = 0; y < x; ++y)
        {
            if (array[y] > avg)
                avgDist = array[y] - avg;
            else if (array[y] < avg)
                avgDist = avg - array[y];
            else avgDist = 0;
            System.out.println("Entered value is " + array[y] + ". Distance from average is " + avgDist);
        }
    }
}
