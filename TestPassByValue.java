public class TestPassByValue {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        System.out.println("Before swap method, num1 is " + 
                            num1 + " and num2 is " + num2);

        swap(num1, num2);

        System.out.println("After swap method, num1 is " + 
                            num1 + " and num2 is " + num2);
    }

    public static void swap(int n1, int n2) {
        System.out.println("\t Inside the swap method");
        System.out.println("\t\t Before swapping n1 is " + n1 + " n2 is " + n2);

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("\t\t After swapping n1 is " + n1 + " n2 is " + n2);
    }

    public static double max(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
