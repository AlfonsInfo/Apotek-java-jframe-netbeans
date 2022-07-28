package model;

public class Obat {
    //Field
    private String kodeObat;
    private String namaObat;
    private String sediaan;
    private String khasiat;
    private float hargaJual;
    private float modal;
    private int stok;

    
    //Default Konstruktor
    public Obat() {
    }
    
    //Konstruktor jika ingin semua inputan dari user
    public Obat(String kodeObat, String namaObat, String sediaan, String khasiat, float hargaJual, float modal,int stok) {
        this.kodeObat = kodeObat;
        this.namaObat = namaObat;
        this.sediaan = sediaan;
        this.khasiat = khasiat;
        this.hargaJual = hargaJual;
        this.modal = modal;
        this.stok = stok;
    }
    //Konstruktor
    public Obat(String kodeObat, String namaObat, String sediaan, String khasiat, float modal,int stok) {
        this.kodeObat = kodeObat;
        this.namaObat = namaObat;
        this.sediaan = sediaan;
        this.khasiat = khasiat;
        this.modal = modal;
        this.hargaJual = (120.f/100.f)*modal; // asumsi : keuntungan obat diambil 20% harga modal // menggunakan .f agar float
        this.stok = stok;
        System.out.println("Konstruktor 3");
    }
    
    //Method

    //Kode Obat
    public String getKodeObat() {
        return kodeObat;
    }

    public void setKodeObat(String kodeObat) {
        this.kodeObat = kodeObat;
    }

    //Nama Obat
    public String getNamaObat() {
        return namaObat;
    }

    public void setNamaObat(String namaObat) {
        this.namaObat = namaObat;
    }
    
    //Sediaan
    public String getSediaan() {
        return sediaan;
    }

    public void setSediaan(String sediaan) {
        this.sediaan = sediaan;
    }
    
    //Harga Jual
    public float getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(float hargaJual) {
        this.hargaJual = hargaJual;
    }

    //Khasiat
    public String getKhasiat() {
        return khasiat;
    }

    public void setKhasiat(String khasiat) {
        this.khasiat = khasiat;
    }

    //Modal
    public float getModal() {
        return modal;
    }

    public void setModal(float modal) {
        this.modal = modal;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
   
    
    
    
    
    
    
}
// Coba buat fungsi pembelian obat biasa terlebih dahulu
// Kaitkan dengan user ada 2 versi : member, tidak member, jika member diskon, jika tidak member , tidak diskon
// fungsi pegawai : menambah, mengurangi, menghapus stok. 

//Wajar tidak tanpa akun bisa beli obat? tidak kan 

// atau kasir bisa melayani pembelian, secara offline. ada sistemnya, dibuat harganya berbeda dengan yang di login akun 