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
    
    private Mahasiswa[] anggota = new Mahasiswa [25];
    private int jmlMahasiswa = 0;
    private String namaKelas;
    private Tugas[] tugas;
    private int jumTugas = 0;
    private Matakuliah Matakuliah;
    
    public Kelas (String namaKelas, int maxjumTugas) {
        this.namaKelas = namaKelas;
        tugas = new Tugas[maxjumTugas];
    }
    
    
    public void setMataKuliah (Matakuliah m){
        this.Matakuliah=m;
    }
    
    public String getMatakuliah(Matakuliah m){
        return Matakuliah;
    }
    
    public void addMahasiswa(Mahasiswa M) {
        if (jmlMahasiswa < anggota.length){//anggota [jmlMahasiswa++] = m
            anggota[jmlMahasiswa]= m;
            jmlMahasiswa++;
        }
    }
    
    public void removeMahasiswa(long IdMhs){
        int a= 0;
        for(a=0; a<anggota.length; a++){
            if(anggota[a].getId() == IdMhs){
                break;
            }
        }
        anggota[a]=null;
        for (int b=0; b<anggota.length; b++){
            if(anggota[b] == null){
                while (b<(anggota.length-b)) {
                    anggota[b] = anggota[b+1];
                    b++;
                }
            }
        }
    }

    public Mahasiswa getMahasiswabyIndex(int index){
        return anggota[index];
    }
    
    public Mahasiswa getMahasiswabyNim(int id){
        return anggota[id];
    }
    
    public Tugas getTugas (int index){
        return tugas[index];
    }
    
    public String getNamaKelas(){
        return namaKelas;
    }
    
    public void createTugas(String namaTugas, String deskripsi){
        if(jumTugas< tugas.length){
            tugas[jumTugas] = new Tugas(namaTugas, deskripsi);
            jumTugas++;
        }
    }
    
    public int getJmlMahasiswa(){
        return jmlMahasiswa;
    }
    
    public int getJumTugas() {
        return jumTugas;
        
    }
    
    public void displayKelas(){
        System.out.println("MATAKULIAH");
        System.out.println("Kelas: "+getNamaKelas());
        System.out.println("Nama Matakuliah: "+getMatakuliah().getNamaMk());
        System.out.println("Kode Matakuliah: "+getMatakuliah().getKodeMk());
        System.out.println("");
        System.out.println("");
        
        System.out.println("DAFTAR TUGAS");
        for (int i=0; i<jumTugas; i++){
            System.out.println("Tugas ke- " +(i+1));
            System.out.println("Nama tugas: "+getTugas(i).getNamaTugas());
            System.out.println("Deskripsi Tugas: "+getTugas(i).getDeskripsi());
            System.out.println("");
            System.out.println("");
        }
        
        System.out.println("DAFTAR MAHASISWA");
        for (int j=0; j<jmlMahasiswa; j++){
            System.out.println("Mahasiswa ke- "+(j+1));
            System.out.println("Nama mahasiswa: "+getMahasiswabyIndex(j).getNama());
            System.out.println("NIM mahasiswa: "+getMahasiswabyIndex(j).getId());
            System.out.println("");
            System.out.println("");    
        }
    }
}
