/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ranestari Sastriani
 */
public class Tugas {
    
    private String namaTugas;
    private static int count=1;
    private final String indeks;
   
    
    
    
    public Tugas(String namaTugas){
        this.namaTugas=namaTugas;
        indeks="Tugas-"+(count++);
        
    }

    public String getNamaTugas() {
        return namaTugas;
    }

    public void setNamaTugas(String namaTugas) {
        this.namaTugas = namaTugas;
    }  
    
    @Override
    public String toString(){
        return namaTugas;
    }
}
