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
public abstract class Orang  implements Serializable{
    
   
    private String nama;
    private String email;
    private String tanggalLahir;
    
    
    
    public Orang(String nama, String email, String tanggalLahir){
        this.nama=nama;
        this.email=email;
        this.tanggalLahir=tanggalLahir;
    }

    

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }
    
    
    
}
