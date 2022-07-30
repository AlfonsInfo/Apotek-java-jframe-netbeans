package control;

//Model(Entitas/Kelas)
import model.karyawan.AkunKaryawan;

//Data Access Object ( Untuk mengakses database (baik memasukkan data atau membaca data)
import dao.AkunKaryawanDAO;

public class AkunKaryawanControl {
    
    //Field 
    private AkunKaryawanDAO asDAO = new AkunKaryawanDAO(); 
    //Untuk Mencari
    
    //Untuk Mencari Akun Karyawan(Mencocokan, jika ada yang cocok, bisa login)
    public AkunKaryawan searchAkunKaryawan(String username, String password)
    {
        AkunKaryawan akunstaff = null;
        akunstaff = asDAO.searchAkunStaff(username, password);
        return akunstaff;
    }  
    
    //Untuk menambahkan akun baru
    public void insertAkunKaryawan(AkunKaryawan c)
    {
        asDAO.insertAkunKaryawan(c);
    }
    
    //Untuk menghapus akun karyawan
    public void deleteAkunKaryawan(String username)
    {
         asDAO.deleteAkunKaryawan(username);
    }
}
