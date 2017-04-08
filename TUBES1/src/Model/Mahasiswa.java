/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ranestari Sastriani
 */
public class Mahasiswa extends Orang {
    
    private String nim;

    
 
    
    public Mahasiswa(String nama,String email, String tanggalLahir, String nim){
        super(nama,email,tanggalLahir);
        this.nim=nim;
    }
    
    public Mahasiswa (String nama){
        super(nama);
    }
    
    public Mahasiswa(String nama,String nim) {
        super(nama);
        this.nim=nim;

    }
    

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    
       @Override
    public String toString() {
        return super.toString()+","
                +"\nnim: "+nim;
    }

    
    
    
}
