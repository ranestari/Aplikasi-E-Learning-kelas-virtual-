/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Database.FileIO;
import java.util.ArrayList;
import java.util.List;
import Model.Dosen;
import Model.Mahasiswa;
import Model.Matakuliah;
import java.util.Date;

/**
 *
 * @author Ranestari Sastriani
 */
public class Aplikasi {
    
    private FileIO save= new FileIO();
    private List<Mahasiswa> daftarMahasiswa= new ArrayList<>();
    private List<Dosen> daftarDosen = new ArrayList<>();
    private List<Matakuliah> daftarMatakuliah = new ArrayList<>();
    
    public Aplikasi(){
        daftarMahasiswa= new ArrayList();
        daftarDosen=new ArrayList();
        daftarMatakuliah=new ArrayList();
    }
    // DOSEN
    public void addDosen(String nama,String email,Date tanggalLahir, String nip){
        daftarDosen.add(new Dosen(nama,email,tanggalLahir,nip));
    }
    
     public Dosen getDosenByNip(String nip){
        return daftarDosen.stream()
                .filter(e -> e.getNip().equals(nip))
                .findFirst().orElse(null);
    }
     
     public Dosen getDosenByIndeks(String indeks){
        return daftarDosen.stream()
                .filter(e -> e.getIndeks().equals(indeks))
                .findFirst().orElse(null);
    }
     
      public void deleteDosen(String nip){
        daftarDosen.remove(getDosenByNip(nip));
    }
      
    public int searchDosen(String nip){
            return daftarDosen.indexOf(getDosenByNip(nip));
    }
   //MAHASISWA
    public void addMahasiswa(String nama,String email, Date tanggalLahir, String nim){
        daftarMahasiswa.add(new Mahasiswa(nama,email,tanggalLahir,nim));
    }
    
    public Mahasiswa getMahasiswa(String nim){
        return daftarMahasiswa.stream()
                .filter(e -> e.getNim().equals(nim))
                .findFirst().orElse(null);
    }
    
    public void deleteMahasiswa(String nim){
        daftarMahasiswa.remove(getMahasiswa(nim));
    }
      
    public int searchMahasiswa(String nim){
            return daftarMahasiswa.indexOf(getMahasiswa(nim));
    }
    
    
    public void addMatakuliah(String namaMK,String kodeMK){
        daftarMatakuliah.add(new Matakuliah(namaMK,kodeMK));
    }
    
    public Matakuliah getMatakuliah(String kodeMK){
        return daftarMatakuliah.stream()
              .filter(e -> e.getKodeMK().equals(kodeMK))
              .findFirst().orElse(null);
    }
    
    public int searchMK(String kodeMK){
        return daftarMatakuliah.indexOf(getMatakuliah(kodeMK));
    }
    public void deleteMK(String kodeMK){
        daftarMatakuliah.remove(getMatakuliah(kodeMK));
}
    
    public void createKelas(Dosen d,String namaKelas){
      d.createKelas(namaKelas);
    }
    
    public void createTugas(Kelas k, String namaTugas){
        k.createTugas(namaTugas);
    }
  
    
    public String[] getDaftarDosen(){
        String s[]=new String[daftarDosen.size()];
          for (int i = 1; i < daftarDosen.size(); i++) { 
              s[i]=daftarDosen.get(i).getNama();
          } 
          return s;  
    }
    
    
    public String[] getDaftarMahasiswa(){
        String s[]=new String[daftarMahasiswa.size()];
          for (int i = 1; i < daftarMahasiswa.size(); i++) { 
              s[i]=daftarMahasiswa.get(i).getNama();
          } 
          return s;  
    }
    
    
    
   
  
    
    
    public void menuSatu(){}
    public void menuDua(){}
    public void menuTiga(){}
    public void mainMenu(){}
     
    
    
    
    
    
}
