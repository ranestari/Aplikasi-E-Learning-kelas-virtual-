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
public class Dosen extends Orang{
    
    private Kelas[] daftarKelas;
    private String nip;
    private int numOfKelas;
    
    public Dosen(){
    }
    
    public Dosen (String nip, String nama, String alamat, String tanggalLahir){
        super(nama,alamat,tanggalLahir);
        this.nip=nip;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public void createKelas(String namaKelas){
    
    }
    
    public Kelas getKelas(int n){
        return daftarKelas[n];
    }

    public int getNumOfKelas() {
        return numOfKelas;
    }
    
    public void removeKelas(Kelas k){
    }
}



