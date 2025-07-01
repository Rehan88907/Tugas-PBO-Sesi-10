public class Percobaan9 {
    public static void main(String[] args) {
        try {
            System.out.println("Try dijalankan.");
            return;
        } finally {
            System.out.println("Finally selalu dijalankan.");
        }
    }
}