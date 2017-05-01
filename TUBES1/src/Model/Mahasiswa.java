/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Ranestari Sastriani
 */
public class Mahasiswa extends Orang implements Serializable {
    
    
    private static int countM=1;
    private final String idMahasiswa;
    private String nim;
    
    
    
    public Mahasiswa(String nama,String email, String tanggalLahir, String nim,int semester){
         super(nama,email,tanggalLahir);
         idMahasiswa="mhs-"+(countM++);
         this.nim=nim;
     }
       
    
    public String getIdMahasiswa() {
        return idMahasiswa;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String Nim) {
        this.nim=nim;
    }

    
    
       @Override
    public String toString() {
        return  "NIM            : " + getNim() + "\n" +
                "id             :"+idMahasiswa+"\n"+
                "Nama           : " + getNama() + "\n" + 
                "Email          : " + getEmail() + "\n" +
                "Tanggal Lahir  : " + getTanggalLahir();  
    }

    
    
    
}
