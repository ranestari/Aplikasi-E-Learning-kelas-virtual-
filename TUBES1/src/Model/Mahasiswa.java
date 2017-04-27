/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Ranestari Sastriani
 */
public class Mahasiswa extends Orang {
    
    private  String nim;
    private static int count=1;
    private final String indeks;


  
    
    public Mahasiswa(String nama,String email, String tanggalLahir, String nim){
        super(nama,email,tanggalLahir);
        this.nim=nim;
        indeks="mhs-"+(count++);
    }
    
    public Mahasiswa (String nama){
        super(nama);
        indeks="mhs-"+(count++);
    }
    
    public Mahasiswa(String nama,String nim) {
        super(nama);
        this.nim=nim;
        indeks="mhs-"+(count++);

    }

    public String getIndeks() {
        return indeks;
    }
    

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    
       @Override
    public String toString() {
        return  "\n"+indeks+
                super.toString()
                +"\nnim: "+nim+"\n";
    }

    
    
    
}
