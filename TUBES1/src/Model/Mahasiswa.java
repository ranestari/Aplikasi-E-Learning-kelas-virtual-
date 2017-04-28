/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Ranestari Sastriani
 */
public class Mahasiswa extends Orang {
    
    
    public Mahasiswa(String nama, String email, long nim){
        super(nama,email,nim);
    }
       
    
    public void display(){
        System.out.println("Nama Mahasiswa: "+super.getNama());
        System.out.println("Nim Mahasiswa:"+super.getId());
    }
    
       @Override
    public String toString() {
        return  "Nama : " + super.getNama();
    }

    
    
    
}
