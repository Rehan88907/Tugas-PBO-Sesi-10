public class Percobaan3 {
    public static void main(String[] args) {
        try {
            int[] data = {1, 2, 3};
            System.out.println(data[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indeks di luar batas array.");
        }
    }
}