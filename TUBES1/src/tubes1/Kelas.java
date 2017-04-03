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
    private int maxMahasiswa;
    private int maxTugas;
    
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
        matakuliah=m;
    }
    
    public String getMatakuliah(Matakuliah m){
        return m.getNamaMK()+'('+m.getKodeMK()+')';
    }
    
    public void addMahasiswa(Mahasiswa M) {
        if(numOfMahasiswa<maxMahasiswa){
            mahasiswa[numOfMahasiswa++]=M;
        }
    }
    
    public void createTugas(String namaTugas){
        if(numOfTugas<maxTugas){
            tugas[numOfTugas]=new Tugas(namaTugas);
        }
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
