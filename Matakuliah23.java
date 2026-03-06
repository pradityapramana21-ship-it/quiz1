public class Matakuliah23 {
    String kodeMK;
    String namaMK; 
    int sks;
    Dosen23[] dosenPengampu;
    int jumlahDosen;
 public Matakuliah23(String kodeMK, String namaMK, int sks, int kapasitasDosen) {
    this.kodeMK = kodeMK;
    this.namaMK = namaMK;
    this.sks = sks;
    dosenPengampu = new Dosen23[kapasitasDosen];
    jumlahDosen = 0; }
public void tampilkanInfo() {
    System.out.println("Kode MK : " + kodeMK);
    System.out.println("NamaMK : " + namaMK);
    System.out.println("SKS : " + sks);
    System.out.println("Dosen Pengampu : " );
     for (int i = 0; i < jumlahDosen; i++) {
            dosenPengampu[i].tampilkanInfo(); } }
public void ubahNamaMK(String namaMKBaru) {
    namaMK = namaMKBaru; } 
public void ubahSKS(int sksBaru) {
    if (sksBaru >= 2) {
        sks = sksBaru;
    }else {
        System.out.println("SKS Tidak Boleh Kurang dari 2"); } }
public void tambahDosen(Dosen23 dosen) {
if (jumlahDosen < dosenPengampu.length) {
    dosenPengampu[jumlahDosen] = dosen;
    jumlahDosen++; 
} else {
    System.out.println("Kapasitas Dosen Sudah Penuh");  } } }


