package model;

/**
 *
 * @author Alfonsus Setiawan Jacub
 */
public class Obat {
    private String kodeObat; // prioritas
    private String namaObat; // prioritas
    private String sediaan; // Botol Syrup, Tablet , Kapsul //prioritas
    //private String satuan; // dus / tablet / 1 kapsul 1 dus berapa obat kayaknya ribet
    private float hargaJual;  // dosis obat gimana? // prioritas  stok bagaimana ?
    private int Stok;
}
// Coba buat fungsi pembelian obat biasa terlebih dahulu
// Kaitkan dengan user ada 2 versi : member, tidak member, jika member diskon, jika tidak member , tidak diskon
// fungsi pegawai : menambah, mengurangi, menghapus stok. 

//Wajar tidak tanpa akun bisa beli obat? tidak kan 

// atau kasir bisa melayani pembelian, secara offline. ada sistemnya, dibuat harganya berbeda dengan yang di login akun 