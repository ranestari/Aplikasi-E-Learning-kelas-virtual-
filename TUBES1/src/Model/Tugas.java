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
   
    
    public Tugas(){}
    
    public Tugas(String namaTugas){
        this.namaTugas=namaTugas;
        
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
