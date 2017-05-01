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
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.Collectors;

/**
 *
 * @author Ranestari Sastriani
 */
public class Aplikasi {
    
     private FileIO save;
     private List<Mahasiswa> daftarMahasiswa;
     private List<Dosen> daftarDosen ;
     private List<Matakuliah> daftarMatakuliah ;
     
    
    public Aplikasi(){
        
        daftarMahasiswa= new ArrayList();
        daftarDosen=new ArrayList();
        daftarMatakuliah=new ArrayList();
        save=new FileIO();
    }
    
    // DOSEN
    public void createDosen(String nama,String email,String tanggalLahir,String nip){
         daftarDosen.add(new Dosen(nama,email,tanggalLahir,nip));
         
         
    }
    
     public Dosen getDosenByNip(String nip){
        return daftarDosen.stream()
                .filter(e -> e.getNip().equals(nip))
                .findFirst().orElse(null);
    }
     
     public Dosen getDosenByIndeks(int indeks){
         Dosen d = daftarDosen.get(indeks);
        return d;
        
    }
     
      public void removeDosen(String nip){
          for (Dosen d : daftarDosen){
            if (d.getNip().equals(nip)){
                daftarDosen.remove(d);
                System.out.println("Data Dosen Berhasil dihapus");
            }
        }
        }
      
      
        
  
    
   //MAHASISWA
    public void createMahasiswa(String nama,String email, String tanggalLahir, int semester){
        daftarMahasiswa.add(new Mahasiswa(nama,email,tanggalLahir,semester));
    }
    
    public Mahasiswa getMahasiswa(String nim){
        return daftarMahasiswa.stream()
                .filter(e -> e.getNim().equals(nim))
                .findFirst().orElse(null);
    }
    
    public void removeMahasiswa(String nim){
        for (Mahasiswa m : daftarMahasiswa){
            if (m.getNim().equals(nim)){
                daftarMahasiswa.remove(m);
            }
        }
    }
    
    
  
    
    //Matakuliah
    public void createMatakuliah(String namaMK,String kodeMK){
        daftarMatakuliah.add(new Matakuliah(namaMK,kodeMK));
    }
    
    public Matakuliah getMatakuliah(String kodeMK){
        return daftarMatakuliah.stream()
              .filter(e -> e.getKodeMK().equals(kodeMK))
              .findFirst().orElse(null);
    }
    
   
    public void deleteMK(String kodeMK){
        daftarMatakuliah.remove(getMatakuliah(kodeMK));
        
        
}
    
    //Kelas
    
    public void createKelas(Dosen d,String namaKelas, Mahasiswa m, Matakuliah mk){
        
        d.createKelas(namaKelas, m, mk);
    
    }
    
    // TUGAS
    public void createTugas(Kelas k,String namaTugas){
        k.createTugas(namaTugas);
    } 
    

   
  
    //DAFTAR
    public String[] getDaftarDosen(){
        List nip = daftarDosen.stream()
                .map(e -> e.toString()).collect(Collectors.toList());
        return (String[]) nip.stream().toArray(size -> new String[size]);
    }
    
    
    public String[] getDaftarMahasiswa(){
        List nim = daftarMahasiswa.stream()
                .map(e -> e.toString()).collect(Collectors.toList());
        return (String[]) nim.stream().toArray(size -> new String[size]); 
    }
    
    
    public String[] getDaftarMatakuliah(){
        List kodeMK = daftarMatakuliah.stream()
                .map(e -> e.toString()).collect(Collectors.toList());
        return (String[]) kodeMK.stream().toArray(size -> new String[size]); 
    }
    
    
    
    
    // for console view
    public void viewListConsole(String[] list) {
        Arrays.stream(list).forEach(System.out::println);
    }

    public void loadDosen() throws FileNotFoundException, IOException {
        try {
            daftarDosen = (ArrayList<Dosen>) save.getObject("fileDosen.dat");
        } catch (FileNotFoundException ex) {
            File f = new File("fileDosen.dat");
            f.createNewFile();
        } catch (EOFException ex) {
            daftarDosen = new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }

    public void saveDosen() throws FileNotFoundException, IOException {
        try {
            save.saveObject(daftarDosen, "fileDosen.dat");
        } catch (FileNotFoundException ex) {
            throw new FileNotFoundException("file not found");
       } catch (IOException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }
    
    
    public void loadMahasiswa() throws FileNotFoundException, IOException {
        try {
            daftarMahasiswa = (ArrayList<Mahasiswa>) save.getObject("fileMahasiswa.dat");
        } catch (FileNotFoundException ex) {
            File f = new File("fileMahasiswa.dat");
            f.createNewFile();
        } catch (EOFException ex) {
            daftarMahasiswa = new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }

    public void saveMahasiswa() throws FileNotFoundException, IOException {
        try {
            save.saveObject(daftarMahasiswa, "fileMahasiswa.dat");
        } catch (FileNotFoundException ex) {
            throw new FileNotFoundException("file not found");
       } catch (IOException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }
    
    
    public void loadMatakuliah() throws FileNotFoundException, IOException {
        try {
            daftarMatakuliah = (ArrayList<Matakuliah>) save.getObject("fileMatakuliah.dat");
        } catch (FileNotFoundException ex) {
            File f = new File("fileMatakuliah.dat");
            f.createNewFile();
        } catch (EOFException ex) {
            daftarMatakuliah = new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }

    public void saveMatakuliah() throws FileNotFoundException, IOException {
        try {
            save.saveObject(daftarMatakuliah, "fileMatakuliah.dat");
        } catch (FileNotFoundException ex) {
            throw new FileNotFoundException("file not found");
       } catch (IOException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }
    
    
    
    
    
   
     
}
