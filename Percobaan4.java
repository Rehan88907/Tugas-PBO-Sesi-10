public class Percobaan4 {
    public static void main(String[] args) {
        try {
            int[] data = new int[-5];
        } catch (NegativeArraySizeException e) {
            System.out.println("Ukuran array tidak boleh negatif.");
        }
    }
}