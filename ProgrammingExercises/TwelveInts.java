public class TwelveInts
{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int x;

        for (x = 0; x < array.length; ++x)
        {
            System.out.print(array[x] + " ");
        }

        System.out.println();

        for (x = array.length - 1; x >= 0; --x)
        {
            System.out.print(array[x] + " ");
        }
    }
}
