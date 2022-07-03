public class ArrayDemo {
    public static void main(String args[]) {
        int data[] = new int[3];
        data[0] = 10;
        data[1] = 20;
        data[2] = 30;
        for(int x = 0; x < data.length; x++) {
            System.out.println(data[x]);
        }
    }
}
