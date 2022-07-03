public class TestFunc {
    public static void main(String args[]) {
        int larger = max(30, 40);
        System.out.println("max: " + larger);
    }

    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2){
            result = num1;
        } else {
            result = num2;
        }

        return result;
    }
}
