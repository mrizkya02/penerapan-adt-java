// Program kelas utama
public class Main {
    // Deklarasi fungsi program utama
    public static void main(String args[]) {
    // Penciptaan objek dari kelas SegiEmpat
    SegiEmpat S = new SegiEmpat(17, 8);
    // Manipulasi objek
    System.out.println("Panjang = " + S.GetPanjang());
    System.out.println("Lebar = " + S.GetLebar());
    System.out.println("Luas = " + S.Luas());
    }
}
