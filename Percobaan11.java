public class Percobaan11 {
    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            a[5] = 10 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception tertangkap: " + e);
        }
    }
}