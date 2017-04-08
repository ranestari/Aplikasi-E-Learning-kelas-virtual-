/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import Model.Mahasiswa;
import java.util.*;

/**
 *
 * @author Ranestari Sastriani
 */
public class Driver {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> m = new ArrayList();
        m.add(new Mahasiswa("tono","1301154553"));
        m.add(new Mahasiswa("budi"));
        m.add(new Mahasiswa("anes"));
        m.add(new Mahasiswa("fazri"));
        
        
        System.out.println(m);
        
    }
    
}
