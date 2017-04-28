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
    private Dosen[] daftarDosen;
    private Mahasiswa[] daftarMahasiswa;
    private Matakuliah[] daftarMatakuliah;
    int nd=0 , nmhs=0, nmatkul=0;
    
    public Aplikasi(){
        
        daftarMahasiswa= save.getMhs();
        daftarDosen=save.getDosen();
        daftarMatakuliah=save.getMatkul();
        save=new FileIO();
    }
    
    // DOSEN
    public void addDosen(Dosen d){
        if (nd<daftarDosen.length) {
         daftarDosen[nd] = d;
         nd++;
        }
    }
    
     public Dosen getDosenByNip(long nip){
        Dosen d=null;
        int a;
        for (a=0; a< this.nd; a++) {
            if (daftarDosen[a].getId() == nip) {
                return daftarDosen[a];
            }   
        }        
        return null;
    }
     
     public Dosen getDosenByIndeks(int indeks){
         return daftarDosen[indeks];
        
    }
     
      public void deleteDosen(long nip){
          int a = 0;
        for (a=0; a<daftarDosen.length; a++) {
            if ( daftarDosen[a].getId() == IdDosen) {
                break;
            }
        }
        daftarDosen[a] = null;
        for (int b=0;b<daftarDosen.length;b++) {
            if (daftarDosen[b] == null) {
                while(b<(daftarDosen.length-b)){
                    daftarDosen[b] = daftarDosen[b+1];
                    b++;
                }
            }
        }
        
    }
      
   
    
   //MAHASISWA
    public void addMahasiswa(Mahasiswa m) {
        if (nmhs<daftarMahasiswa.length) {
         daftarMahasiswa[nmhs] = m;
         nmhs++;
        }
    }
    
    public Mahasiswa getMahasiswabyNim(long nim) { 
        Mahasiswa m=null;
        int a;
        for (a=0; a<daftarMahasiswa.length; a++) {
            if (daftarMahasiswa[a].getId() == nim) {
                m=daftarMahasiswa[a];
                break;
            }   
        }        
        return m;
    }
    
    public void deleteMahasiswa(long nim) {
        int a = 0;
        for (a=0; a<daftarMahasiswa.length; a++) {
            if ( daftarMahasiswa[a].getId() == nim) {
                break;
            }
        }
        daftarMahasiswa[a] = null;
        for (int b=0;b<daftarMahasiswa.length;b++) {
            if (daftarMahasiswa[b] == null) {
                while(b<(daftarMahasiswa.length-b)){
                    daftarMahasiswa[b] = daftarMahasiswa[b+1];
                    b++;
                }
            }
        }
    }
      
    
    
    //Matakuliah
    public void addMatakuliah(Matakuliah t) {
        if (nmatkul<daftarMahasiswa.length) {
         daftarMatakuliah[nmatkul] = t;
         nmatkul++;
        }
    }
    
    public Matakuliah getMatkul(String KodeMK) { 
        int a = 0;
        for (a=0; a<daftarMatakuliah.length; a++) {
            if ( daftarMatakuliah[a].getKodeMK() == KodeMK) {
                break;
            }
        }
        return daftarMatakuliah[a];
    }
    
   
    public void deleteMatkul(String KodeMK) {
        int a = 0;
        for (a=0; a<daftarMatakuliah.length; a++) {
            if ( daftarMatakuliah[a].getKodeMK() == KodeMK) {
                break;
            }
        }
        daftarMatakuliah[a] = null;
        for (int b=0;b<daftarMatakuliah.length;b++) {
            if (daftarMatakuliah[b] == null) {
                while(b<(daftarMatakuliah.length-b)){
                    daftarMatakuliah[b] = daftarMatakuliah[b+1];
                    b++;
                }
            }
        }
    }

    
   
  
    //DAFTAR
    public Mahasiswa[] getDaftarMahasiswa() {
        return daftarMahasiswa;
    }

    public Matakuliah[] getDaftarMatakuliah() {
        return daftarMatakuliah;
    }

    public Dosen[] getDaftarDosen() {
        return daftarDosen;
    }

    public int getNdosen() {
        return nd;
    }

    public int getNmhs() {
        return nmhs;
    }

    public int getNmatkul() {
        return nmatkul;
    }
    
    
   
     
}
