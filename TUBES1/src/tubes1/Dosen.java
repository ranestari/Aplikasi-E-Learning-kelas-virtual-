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
public class Dosen extends Orang{
    
    private Kelas[] daftarKelas;
    private String nip;
    private int maxKelas;
    private int numOfKelas;
    
    
     @Override
    public String toStringJenis() {
        return "Dosen";
    }
    
    public Dosen(){
        super.setNama("Default");
        daftarKelas=new Kelas[5];
        maxKelas =5;
        
    }
    
    
    public Dosen (String nip){
        this.nip=nip;
        daftarKelas=new Kelas[5];
        maxKelas =5;
        
    }
    
    public Dosen(String nama, String nip, int maxKelas){
        this.nip=nip;
        super.setNama(nama);
        daftarKelas= new Kelas[maxKelas];
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public int getMaxKelas() {
        return maxKelas;
    }

    public void setMaxKelas(int maxKelas) {
        this.maxKelas = maxKelas;
    }
    
    
    public void createKelas(String namaKelas){
        if (numOfKelas<maxKelas){
            daftarKelas[numOfKelas++]=new Kelas(namaKelas);
        }
    
    }
    
    public Kelas getKelas(int n){
        return daftarKelas[n];
    }

    public int getNumOfKelas() {
        return numOfKelas;
    }
    
 
    public void removeKelas(int n){
        if(numOfKelas>0){
            if(n==numOfKelas-1){
                daftarKelas[n]=null;
                numOfKelas--;
            }
            else if (numOfKelas==1){
                daftarKelas[n]=null;
            }
            else{
                daftarKelas[n]=null;
                for (int i=n;i<numOfKelas-1;i++){
                    daftarKelas[i]=daftarKelas[i+1];
                }
            }
        }
    }
    
    
    

   
}



