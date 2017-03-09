/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes1;

/**
 *
 * @author Ranestari Sastriani
 */
public class Tugas {
    
    private String namaTugas;
    private String deskripsi;
    private String batasWaktu;
    
    public Tugas(){}
    
    public Tugas(String namaTugas,String deskripsi, String batasWaktu){
        this.namaTugas=namaTugas;
        this.deskripsi=deskripsi;
        this.batasWaktu=batasWaktu;
    }

    public String getNamaTugas() {
        return namaTugas;
    }

    public void setNamaTugas(String namaTugas) {
        this.namaTugas = namaTugas;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getBatasWaktu() {
        return batasWaktu;
    }

    public void setBatasWaktu(String batasWaktu) {
        this.batasWaktu = batasWaktu;
    }
    
    
    
}
