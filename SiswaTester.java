import java.util.Scanner;

public class SiswaTester {
    public static void main(String[] args) {
        // String, Int, double
        // Scanner input = new Scanner(System.in);
        // System.out.println("Nama: ");
        // String nama = input.nextLine();
        // System.out.println("ID: ");
        //  int id = input.nextInt();
        // double ipk = input.nextDouble();
        // input.close();

        // Siswa dimas = new Siswa(id, nama, ipk);
        // dimas.print();

// membuat Object
// namaClass namaObject = new
// Constructor();
Siswa natan = new Siswa();
Siswa arka = new Siswa();
Siswa nero = new Siswa();
Siswa fadil = new Siswa();
Siswa royan = new Siswa();
Siswa widi = new Siswa(34, "Widi", 90.0);


natan.id = 27;
natan.nama = "Natanz";
natan.ipk = 86.6;
arka.id = 17;
arka.nama = "Arka";
arka.ipk = 85.8;
nero.id = 11;
nero.nama = "Dinero";
nero.ipk = 10.0;
fadil.id = 19;
fadil.nama = "Fadli";
fadil.ipk = 81.2;
royan.id = 1;
royan.nama = "Royyan";
royan.ipk = 99.9; 

natan.print();
arka.print();
nero.print();
fadil.print();
royan.print();
widi.print();


// Siswa nasya = new Siswa(1, "Nasya", 80);
// nasya.print();
// Siswa sativa = new Siswa(2, "Sativa", 85);
// sativa.print();

// //membandingkan ipk 2 objek
// if (nasya.getIpk() > sativa.getIpk()) {
//     System.out.println("Ipk Nasya lebih tinggi dari Sativa");
// } else {
//     System.out.println("Ipk Sativa lebih tinggi dari Nasya");
// }

// //nilai diatas 70 = lulus
// if (nasya.getIpk() >=70) {
//     System.out.println("Lulus");
// } else {
//     System.out.println("Tidak lulus");
// }

// //operator AND
// if(nasya.getIpk() >=70 && nasya.getNama().equals(nasya)) {
//     System.out.println("Benar");
// }
    }
}
