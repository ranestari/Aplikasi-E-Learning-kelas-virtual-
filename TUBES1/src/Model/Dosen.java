/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author Ranestari Sastriani
 */
public class Dosen extends Orang implements Serializable{
    
    private static int countD=1;
    private final String idDosen;
    ArrayList<Kelas> daftarKelas;
    private String nip;
    
    
    
    
    public Dosen(String nama,String email, String  tanggalLahir, String nip){
        
        super(nama,email,tanggalLahir);
        this.nip=nip;
        idDosen="Dsn-"+(countD++);
        daftarKelas=new ArrayList<Kelas>();
    }

    public static int getCountD() {
        return countD;
    }
    
    
    public String getIdDosen() {
        return idDosen;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
    

    
    public void createKelas(String namaKelas, Mahasiswa m, Matakuliah mk){
        
        daftarKelas.add(new Kelas(namaKelas, m, mk));
        
        
    }  
    
     public Kelas getKelas(String idKelas){
        return daftarKelas.stream()
              .filter(e -> e.getIdKelas().equals(idKelas))
              .findFirst().orElse(null);
   }

   
     public void removeKelas(String idKelas){
        for (Kelas k : daftarKelas){
            if (k.getIdKelas().equals(idKelas)){
                daftarKelas.remove(k);
            }
        }
    }
     
    public List<Kelas> getDaftarKelas(String idKelas){
        return daftarKelas;
    }
    
    @Override
    public String toString(){
        return  "NIP            : " + nip + "\n" +
                "Id             : " + getIdDosen()  +"\n" + 
                "Nama           : " + getNama()  +"\n" + 
                "Email          : " + getEmail() + "\n" +
                "Tanggal Lahir  : " + getTanggalLahir()+ "\n" +
                "daftar Kelas   : " +daftarKelas+"\n" ;
    }
    
    
     

   
}



