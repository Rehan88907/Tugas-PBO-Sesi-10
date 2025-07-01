public class Percobaan10 {
    public static void cekUsia(int usia) throws Exception {
        if (usia < 18) throw new Exception("Usia minimal 18 tahun");
    }

    public static void main(String[] args) {
        try {
            cekUsia(15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}