public class Percobaan5 {
    public static void main(String[] args) {
        try {
            String teks = null;
            System.out.println(teks.length());
        } catch (NullPointerException e) {
            System.out.println("Teks tidak boleh null.");
        }
    }
}