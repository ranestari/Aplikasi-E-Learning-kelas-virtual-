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
public class Matakuliah implements Serializable{
    
    private static int  countMK=1;
    private String namaMK;
    private final String idMK;
    private String kodeMK;
    
    
    public Matakuliah(String namaMK,String kodeMK){
        this.namaMK=namaMK;
        this.kodeMK=kodeMK;
        idMK="MK-"+(countMK++);
    }

    public String getIdMK() {
        return idMK;
    }
    
    

    public String getNamaMK() {
        return namaMK;
    }

    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    
    @Override
    public String toString(){
        return "Mata Kuliah : "+getNamaMK()+"("+getIdMK()+")" +"\n"+
                "kode MK    :"+getKodeMK();
    }
    
    
}
