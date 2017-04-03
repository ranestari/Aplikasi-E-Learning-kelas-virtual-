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
public class Mahasiswa extends Orang {
    
    private String nim;

    
    @Override
    public String toStringJenis() {
        return "Mahasiswa" ;
    }
    
    public Mahasiswa(){}
    
    public Mahasiswa(String nim) {
        this.nim=nim;
    }
    

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    
    
    
}
