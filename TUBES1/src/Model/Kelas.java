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
public class Kelas implements Serializable {
    
    private static int countK =1;
    private final String idKelas;
    private  String namaKelas;
    private Matakuliah matakuliah;
    ArrayList<Mahasiswa> daftarMahasiswa;
    ArrayList<Tugas> daftarTugas;
    
    
    public Kelas(String namaKelas, Mahasiswa m, Matakuliah mk){
        
        this.namaKelas=namaKelas;
        daftarMahasiswa=new ArrayList();
        this.matakuliah=mk;
        idKelas="Kelas-"+(countK++);
        
    }
    
    public String getIdKelas() {
        return idKelas;
    }
    
    
    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }
    
    public void setMataKuliah (Matakuliah matakuliah){
        this.matakuliah=matakuliah;
    }
    
    public Matakuliah getMatakuliah(){
        return matakuliah;
        
    }
    
    public void addMahasiswa(Mahasiswa M) {
        daftarMahasiswa.add(M);
    }
    
    public Mahasiswa getMahasiswa(String nim){
        for (Mahasiswa m : daftarMahasiswa){
            if (m.getNim().equals(nim)){
                return m;
            }
        }
        return null;
    }
    
    public void removeMahasiswa(String nim){
        for (Mahasiswa m : daftarMahasiswa){
            if (m.getNim().equals(nim)){
                daftarMahasiswa.remove(m);
            }
        }  
    }
    
    public String getDaftarMahasiswa() {
        String s = "";
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            s += daftarMahasiswa.get(i).getNim()+ "\n";
        }
        return s;
    }

    
    // Tugas
    public void createTugas(String namaTugas){
        daftarTugas.add(new Tugas(namaTugas));
    }  
    
     public Tugas getTugas(String idTugas){
        return daftarTugas.stream()
              .filter(e -> e.getIdTugas().equals(idTugas))
              .findFirst().orElse(null);
    }
     
     
    public void removeTugas(String idTugas){
        for (Tugas t : daftarTugas){
            if (t.getIdTugas().equals(idTugas)){
                daftarTugas.remove(t);
            }
        }  
    }
    
    public List<Tugas> getDaftarTugas(String idTugas){
        return daftarTugas;
    }
    
    @Override
    public String toString(){
        return "idKelas                 : " + getIdKelas() + "\n" +
               "Nama Kelas              : " + getNamaKelas() + "\n" +
               "Matakuliah              : " + matakuliah + "\n" +
               "Daftar Mahasiswa        : " + getDaftarMahasiswa()+ "\n"+
               "Daftar Tugas            : " + daftarTugas + "\n";
               
    }
}
