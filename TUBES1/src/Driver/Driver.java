/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import Model.Aplikasi;
import Model.Mahasiswa;
import ViewConsole.Console;
import java.util.*;

/**
 *
 * @author Ranestari Sastriani
 */
public class Driver {
    public static void main(String[] args) {
        Aplikasi app = null;
        Console view = new Console(app);
        view.mainMenu();
        
    }
    
}
