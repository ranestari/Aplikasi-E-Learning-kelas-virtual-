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
public class Orang {
    
    protected String nama;
    protected String alamat;
    protected String tanggalLahir;
    
    public Orang(){}
    
    public Orang(String nama, String alamat, String tanggalLahir){
        this.nama=nama;
        this.alamat=alamat;
        this.tanggalLahir=tanggalLahir;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    
    
    
    
}
