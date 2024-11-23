public class Siswa {
    // variable
    int id;
    String nama;
    double ipk;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }  

    public double getIpk() {
        return this.ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    //Constructor Default (yg membangun objek)
    public Siswa() {
        id = 0;
        nama = "Kosong";
        ipk = 0.0;    
    }
    //Constructor Parameter
    public Siswa(int i, String n, double k) {
        id = i;
        nama = n;
        ipk = k;
    }

    //Getter
    public int getID() {
        return id;
    }

    //Setter
    public void setID(int id) {
        //var = param
        this.id = id;
    }
    //Method
    public void print() {
        System.out.println("ID : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("IPK : " + ipk);
    }
}
