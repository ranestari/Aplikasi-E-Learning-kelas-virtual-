/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Ranestari Sastriani
 */
public class Tugas implements Serializable {
    
     private String namaTugas;
    private static int countT=1;
    private final String idTugas;

    public Tugas(String namaTugas){
        this.namaTugas=namaTugas;
        idTugas="Tugas-"+(countT++);
        
    }
   
    public String getNamaTugas() {
        return namaTugas;
    }

    public void setNamaTugas(String namaTugas) {
        this.namaTugas = namaTugas;
    }  

    public String getIdTugas() {
        return idTugas;
    }
    
    

   @Override
    public String toString(){
        return "Tugas  : " +getNamaTugas()+getIdTugas();
    }
}
