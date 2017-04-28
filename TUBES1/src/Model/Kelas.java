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
public class Kelas {
    
    private static int count=1;
    private final String indeks;
    private  String namaKelas;
    private Matakuliah matakuliah;
    ArrayList<Mahasiswa> daftarMahasiswa;
    ArrayList<Tugas> daftarTugas;
    
    
    public Kelas(String namaKelas){
        this.namaKelas=namaKelas;
        daftarMahasiswa=new ArrayList();
        daftarTugas=new ArrayList();
        indeks="Kelas-"+(count++);
        
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }
    
    public void setMataKuliah (Matakuliah m){
        this.matakuliah=m;
    }
    
    public Matakuliah getMatakuliah(){
        return matakuliah;
    }
    
    public void addMahasiswa(Mahasiswa M) {
        daftarMahasiswa.add(M);
    }
    
    public void createTugas(String namaTugas){
        daftarTugas.add(new Tugas(namaTugas));
    }  
    
     public Tugas getTugas(int i){
        return daftarTugas.get(i);
    }
    
    @Override
    public String toString(){
        return "Kelas :"+namaKelas+"\n"
                +"Mata Kuliah :"+getMatakuliah().getNamaMK()+"\n"
                +"Kode Mata Kuliah: "+getMatakuliah().getKodeMK();
    }
    
}
