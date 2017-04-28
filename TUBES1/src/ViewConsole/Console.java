/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewConsole;

import Model.Aplikasi;
import Model.Dosen;
import Model.Kelas;
import Model.Mahasiswa;
import java.util.Date;
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
    
    
    // MENU DOSEN
    public void menuDosen() {
        int pil = 0;
        do {            
            try {
                System.out.println("------ MENU DOSEN -------");
                System.out.println(" 1. ADD DOSEN        ");
                System.out.println(" 2. REMOVE DOSEN         ");
                System.out.println(" 3. DAFTAR DOSEN   ");
                System.out.println(" 4. SEARCH DOSEN BY NIP    ");
                System.out.println(" 5. SEARCH DOSEN BY INDEKS ");
                System.out.println(" 6. CREATE KELAS ");
                System.out.println(" 7. CREATE TUGAS ");
                System.out.println(" 0. MENU UTAMA                 ");
                System.out.println("-----------------------------");
                System.out.print("- Pilih menu : ");
                pil = inputInteger();
                switch (pil) {
                    case 1:
                        System.out.println("--- ADD DOSEN ---");
                        System.out.print(" - Nama           : "); String nama = sStr.nextLine();
                        System.out.print(" - Email          : "); String email = sStr.nextLine();
                        System.out.print(" - Tanggal Lahir  : "); String tanggalLahir = sStr.nextLine();
                        System.out.print(" - Nip            : "); String nip = sStr.nextLine();
                        model.addDosen (nama,email, tanggalLahir, nip);
                        break;
                    case 2:
                        System.out.println("--- HAPUS DOSEN ---");
                        System.out.print(" - Nip Dosen: "); nip = sStr.nextLine();
                        model.deleteDosen(nip);
                        break;    
                    case 3:
                        System.out.println("--- DAFTAR DOSEN ---");
                        model.viewListConsole(model.getDaftarDosen());
                        break;
                    case 4:
                        System.out.println("--- SEARCH DOSEN BY NIP---");
                        System.out.print(" - Masukkan nip : "); nip = sStr.nextLine();
                        Dosen d = model.getDosenByNip(nip);
                        System.out.println(d);
                        break;
                    case 5:
                        System.out.println("--- SEARCH DOSEN BY INDEKS---");
                        System.out.print(" - Masukkan index pelanggan : "); int indeks = inputInteger();
                        d = model.getDosenByIndeks(indeks);
                        System.out.println(d);
                        break;
                     case 6:
                        System.out.println("--- CREATE KELAS ---");
                        System.out.print(" - Nama Kelas             : "); String namaKelas = sStr.nextLine();
                        System.out.print(" - Nip Dosen              : "); nip= sStr.nextLine();  
                        d = model.getDosenByNip(nip);
                        model.createKelas(d,namaKelas);
                        break;
                      case 7:
                        System.out.println("--- CREATE TUGAS ---");
                        System.out.print(" - Nama tugas             : "); String namaTugas = sStr.nextLine();
                        System.out.print(" -nama Kelas              : "); namaKelas = sStr.nextLine();  
                        break;
                    case 0:
                        break;
                }
                
            } catch (Exception e) {
                System.out.println("error : " + e.getMessage());
            } finally {
                sInt = new Scanner(System.in);
                sStr = new Scanner(System.in);
            }
        } while (pil != 0);
    }
    
    
    
    //MENU MAHASISWA
    public void menuMahasiswa() {
        int pil = 0;
        do {            
            try {
                System.out.println("------ MENU MAHASISWA -------");
                System.out.println(" 1. ADD MAHASISWA        ");
                System.out.println(" 2. REMOVE MAHASISWA         ");
                System.out.println(" 3. DAFTAR MAHASISWA   ");
                System.out.println(" 4. SEARCH MAHASISWA    ");
                System.out.println(" 6. AMBIL KELAS");
                System.out.println(" 7. LIHAT TUGAS");
                System.out.println(" 0. MENU UTAMA                 ");
                System.out.println("-----------------------------");
                System.out.print("- Pilih menu : ");
                pil = inputInteger();
                switch (pil) {
                    case 1:
                        System.out.println("--- ADD MAHASISWA ---");
                        System.out.print(" Nama:          : "); String nama = sStr.nextLine();
                        System.out.print(" Email          : "); String email = sStr.nextLine();
                        System.out.print(" Tanggal Lahir  : "); String tanggalLahir = sStr.nextLine();
                        System.out.print(" Nim            : "); String nim = sStr.nextLine();
                        model.addMahasiswa (nama,email, tanggalLahir, nim);
                        break;
                    case 2:
                        System.out.println("--- HAPUS MAHASISWA ---");
                        System.out.print(" - Nim: "); nim = sStr.nextLine();
                        model.deleteMahasiswa(nim);
                        break;    
                    case 3:
                        System.out.println("--- DAFTAR MAHASISWA ---");
                        model.viewListConsole(model.getDaftarMahasiswa());
                        break;
                    case 4:
                        System.out.println("--- SEARCH Mahasiswa ---");
                        System.out.print(" - Masukkan nim : "); nim = sStr.nextLine();
                        Mahasiswa m = model.getMahasiswa(nim);
                        System.out.println(m);
                        break;
                  
                }
                
            } catch (Exception e) {
                System.out.println("error : " + e.getMessage());
            } finally {
                sInt = new Scanner(System.in);
                sStr = new Scanner(System.in);
            }
        } while (pil != 0);
    }
    
    //MENU ADMIN
    
    //MENU MAHASISWA
    public void menuAdmin() {
        int pil = 0;
        do {            
            try {
                System.out.println("------ MENU ADMIN -------");
                System.out.println(" 1. ADD MATAKULIAH       ");
                System.out.println(" 2. REMOVE MATAKULIAH         ");
                System.out.println(" 3. ADD MATAKULIAH KE KELAS   ");
                System.out.println(" 0. MENU UTAMA                 ");
                System.out.println("-----------------------------");
                System.out.print("- Pilih menu : ");
                pil = inputInteger();
                switch (pil) {
                    case 1:
                        System.out.println("--- ADD MATAKULIAH ---");
                        System.out.print(" - Nama Matkul          : "); String namaMK = sStr.nextLine();
                        System.out.print(" - Kode Matkul         : "); String kodeMK = sStr.nextLine();
                        model.addMatakuliah(namaMK,kodeMK);
                        break;
                    case 2:
                        System.out.println("--- HAPUS MAHASISWA ---");
                        System.out.print(" Kode MK "); kodeMK = sStr.nextLine();
                        model.deleteMK(kodeMK);
                        break;    
                    case 3:
                        System.out.println("--- SET MATAKULIAH ---");
                        System.out.print(" - KODE MK : "); kodeMK = sStr.nextLine();
                        ///belum
                        break;
                  
                }
                
            } catch (Exception e) {
                System.out.println("error : " + e.getMessage());
            } finally {
                sInt = new Scanner(System.in);
                sStr = new Scanner(System.in);
            }
        } while (pil != 0);
    }
    
    
    //MENU UTAMA
    public void mainMenu() {
        int pil = 0;
        do {            
            try {
                System.out.println("------ Menu Utama -------");
                System.out.println("- 1. MENU DOSEN   ");
                System.out.println("- 2. MENU MAHASISWA      ");
                System.out.println("-3. MENU ADMIN     ");
                System.out.println("- 0. Exit                ");
                System.out.println("-------------------------");
                System.out.print("- Pilih menu : ");
                pil = inputInteger();
                switch (pil){
                    case 1:
                        menuDosen();
                        break;
                    case 2:
                        menuMahasiswa();
                        break;
                    case 3:
                        menuAdmin();
                        break;
                    
                    
                }
                
            } catch (Exception e) {
                System.out.println("error : " + e.getMessage());
            } finally {
                sInt = new Scanner(System.in);
                sStr = new Scanner(System.in);
            }
            
        } while (pil != 0); 
    }
    
  
    
    
}
