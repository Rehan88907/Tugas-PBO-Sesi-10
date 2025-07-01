public class Percobaan6 {
    public static void main(String[] args) {
        try {
            String teks = "abc";
            int angka = Integer.parseInt(teks);
        } catch (NumberFormatException e) {
            System.out.println("Format angka tidak valid.");
        }
    }
}