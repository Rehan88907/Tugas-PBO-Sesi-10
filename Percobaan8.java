public class Percobaan8 {
    public static void main(String[] args) {
        try {
            String nama = "John";
            if (nama.equals("John")) {
                throw new Exception("Nama tidak boleh John");
            }
        } catch (Exception e) {
            System.out.println("Terjadi Exception: " + e.getMessage());
        }
    }
}