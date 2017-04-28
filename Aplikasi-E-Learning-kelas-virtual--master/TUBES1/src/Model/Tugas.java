/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Nindia Cahyaning Putri
 * 1301154567
 * IF3907
 */
public class Tugas {
    
    private String namaTugas;
    private String deskripsi;

    public Tugas(String namaTugas, String deskripsi) {
        this.namaTugas = namaTugas;
        this.deskripsi = deskripsi;
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
    
}
