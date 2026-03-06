public class MataKuliahMain23 {
public static void main(String[] args) {
    Dosen23 d1 = new Dosen23("878787", "Tegar Andik", 2006, "S2", "TM");
    Dosen23 d2 = new Dosen23("854275", "Ratu Christine", 2010, "S3", "TI");
    Matakuliah23 mk = new Matakuliah23("IM23W", "Pemrograman Dasar", 5, 3);
    mk.tambahDosen(d1);
    mk.tambahDosen(d2);
    mk.tampilkanInfo();
    mk.ubahNamaMK("Pemrograman Dasar");
    mk.ubahSKS(6);
System.out.println("Setelah perubahan:");
    mk.tampilkanInfo(); } }