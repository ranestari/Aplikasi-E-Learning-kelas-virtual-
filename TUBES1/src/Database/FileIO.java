/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.Dosen;
import Model.Mahasiswa;
import Model.Matakuliah;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Ranestari Sastriani
 */
public class FileIO {
     public void simpanDataDosen(Dosen[] d, String file){
        try{
            FileOutputStream fout = new FileOutputStream(file);
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(d);
        
        }catch (Throwable e){
            e.printStackTrace();
        }

    }
     
     public Dosen[] getDosen(){
        try {
            FileInputStream fout = new FileInputStream("dosen.txt");
            ObjectInputStream oout = new ObjectInputStream(fout);
            return (Dosen[]) oout.readObject();
        } catch (Throwable e) {
            return new Dosen[50];
        }
    }
     
     public void simpanDataMhs(Mahasiswa[] m, String file){
        try {
            FileOutputStream fout = new FileOutputStream(file);
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(m);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
      public Mahasiswa[] getMhs(){
        try {
            FileInputStream fout = new FileInputStream("mhs.txt");
            ObjectInputStream oout = new ObjectInputStream(fout);
            return (Mahasiswa[]) oout.readObject();
        } catch (Throwable e) {
            return new Mahasiswa[50];
        }
    }
    public void simpanDataMK(Matakuliah[] mk, String namaFile){
        try {
            FileOutputStream fout = new FileOutputStream(namaFile);
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(mk);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    } 
    public Matakuliah[] getMatkul(){
        try {
            FileInputStream fout = new FileInputStream("matkul.txt");
            ObjectInputStream oout = new ObjectInputStream(fout);
            return (Matakuliah[]) oout.readObject();
        } catch (Throwable e) {
            return new Matakuliah[50];
        }
    }
    
}    
     

 

