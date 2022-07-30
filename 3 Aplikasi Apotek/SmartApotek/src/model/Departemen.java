package model;

public class Departemen {
    private int idDepartemen;
    private String namaDepartemen;

    public Departemen(int idDepartemen, String namaDepartemen) {
        this.idDepartemen = idDepartemen;
        this.namaDepartemen = namaDepartemen;
    }

    public int getIdDepartemen() {
        return idDepartemen;
    }

    public void setIdDepartemen(int idDepartemen) {
        this.idDepartemen = idDepartemen;
    }

    public String getNamaDepartemen() {
        return namaDepartemen;
    }

    public void setNamaDepartemen(String namaDepartemen) {
        this.namaDepartemen = namaDepartemen;
    }
    
    @Override
    public String toString()
    {
        return namaDepartemen;
    }
    
    
}
