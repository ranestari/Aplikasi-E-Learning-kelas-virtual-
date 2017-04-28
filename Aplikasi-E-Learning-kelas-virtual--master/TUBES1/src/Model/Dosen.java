/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.*;

/**
 *
 * @author Ranestari Sastriani
 */
public class Dosen extends Orang{
    
    private static int count=1;
    private String nip;
    ArrayList<Kelas> daftarKelas;
    private final String indeks;
    
    
    
  
    
    public Dosen(String nama,String email, String  tanggalLahir, String nip){
        super(nama,email,tanggalLahir);
        this.nip=nip;
        indeks="Dsn-"+(count++);
    }
    
    
    public Dosen (String nama){
        super(nama);
        daftarKelas=new ArrayList(); 
        indeks="Dsn-"+(count++);
    }
    
    public Dosen(String nama, String nip){
        super(nama);
        this.nip=nip;
        indeks="Dsn-"+(count++);
        daftarKelas= new ArrayList();
        
    }

    public String getIndeks() {
        return indeks;
    }
    
    

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    
    public void createKelas(String namaKelas){
        daftarKelas.add(new Kelas(namaKelas));
    
    }
    
    public Kelas getKelas(int i){
        return daftarKelas.get(i);
    }

   
    public void removeKelas(int n){
        daftarKelas.remove(n);
        
    }
    
    @Override
    public String toString(){
        String s = "Dosen: "+super.toString();
        for (Kelas k : daftarKelas){
            s += "\n" + k;
        }
        return s;
    }
    
    
     

   
}



