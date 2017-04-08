/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewConsole;

import Model.Aplikasi;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ranestari Sastriani
 */
public class Console {
    private Aplikasi model;
    private Scanner sInt;
    private Scanner sStr;
    
    
    public Console(Aplikasi model){
        this.model=model;
        sInt=new Scanner(System.in);
        sStr=new Scanner(System.in);
        
      
    }
    
    public int inputInteger(){
        try{
            return sInt.nextInt();
        }catch (InputMismatchException e){
            throw new InputMismatchException("input must be Integer");
            
        }finally{
            sInt=new Scanner(System.in);
        }
        
    }
  
    
}
