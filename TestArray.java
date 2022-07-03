import java.util.Arrays;

public class TestArray {
    public static void main(String args[]) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        for (double element: myList) {
            System.out.println(element);
        }

        printArray(new int[] {1,2,3,4,5});

        int[] temp = reverse(new int[]{22,33,44,55});

        System.out.println(Arrays.toString(temp));
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for(int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }
}
