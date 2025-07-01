import java.io.*;

public class Percobaan7 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("tidak_ada_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan.");
        }
    }
}