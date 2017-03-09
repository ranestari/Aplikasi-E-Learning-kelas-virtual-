/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes1;

/**
 *
 * @author Ranestari Sastriani
 */
public class Kelas {
    
   private  String namaKelas;
    private Matakuliah matakuliah;
    private Mahasiswa[] mahasiswa;
    private Tugas[] tugas;
    private int numOfTugas;
    private int numOfMahasiswa;
    
    public Kelas(String namaKelas){
        this.namaKelas=namaKelas;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }
    
    public void setMataKuliah (Matakuliah m){
        
    }
    
    public Matakuliah getMatakuliah(){
        return getMatakuliah();
    }
    
    public void addMahasiswa(Mahasiswa M) {
    }
    
    public void createTugas(String Tugas){
    }
    
    public Mahasiswa getMahasiswa(int n){
        return mahasiswa[n];
    }
    
    public Tugas getTugas(int n){
        return tugas[n];
    }

    public int getNumOfTugas() {
        return numOfTugas;
    }

    public int getNumOfMahasiswa() {
        return numOfMahasiswa;
    }
    
    
    
}
