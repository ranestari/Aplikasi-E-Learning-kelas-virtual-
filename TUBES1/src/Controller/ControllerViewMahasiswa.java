/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ViewGui.GuiCreateKelas;
import ViewGui.RemoveMatakuliah;
import ViewGui.SetMatakuliah;
import ViewGui.GuiMenuDosen;
import ViewGui.GuiCreateTugas;
import ViewGui.GuiSearchDosenByIndex;
import ViewGui.GuiAddDosen;
import ViewGui.GuiHapusDosen;
import ViewGui.GuiDaftarDosen;
import ViewGui.MenuAdmin;
import ViewGui.GuiSearchDosenByNip;
import ViewGui.GuiDaftarMatakuliah;
import ViewGui.GuiAddMatakuliah;
import ViewGui.GuiMenuUtama;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Model.Aplikasi;
import java.awt.event.MouseAdapter;
import javax.swing.JPanel;
import model.*;
import viewGui.*;

/**
 *
 * @author WIN 8.I
 */
public class ControllerViewMahasiswa extends MouseAdapter implements ActionListener {
    private Aplikasi app;
    

    
//inisialisasi class Aplikasi pada package model
    private GuiMenuUtama mu;
    
    //inisialiasi Halaman-halaman untuk Menu Dosen
    private GuiMenuDosen md;
    private GuiAddDosen ad;
    private GuiDaftarDosen dd;
    private GuiHapusDosen hd;
    private GuiSearchDosenByNip dn;
    private GuiSearchDosenByIndex di;
    private GuiCreateKelas ck;
    private GuiCreateTugas ct;
    
    //inisialiasi Halaman-halaman untuk Menu Mahasiswa
    //private GuiMenuMahasiswa mm;
    private GuiAddMahasiswa am;
   // private GuiDaftarMahasiswa dm;
    private GuiHapusMahasiswa hm;
    private GuiSearchMahasiswaByNim mn;
    
    
    
    
    //inisialiasi Halaman-halaman untuk Menu Admin
    private GuiAddMatakuliah am;
    private GuiDaftarMatakuliah dm;
    private MenuAdmin ma;
    private RemoveMatakuliah rm;
    private SetMatakuliah sm;
    
     public ControllerViewMahasiswa(Aplikasi app) {
         app =new Aplikasi();
         
         mu = new GuiMenuUtama();
         
         //instansiasi Halaman-halaman untuk Menu Dosen
         md = new GuiMenuDosen();
         ad = new GuiAddDosen();
         dd = new GuiDaftarDosen();
         hd = new GuiHapusDosen();
         dn = new GuiSearchDosenByNip();
         di = new GuiSearchDosenByIndex();
         ck = new GuiCreateKelas();
         ct = new GuiCreateTugas();
         
         //instansiasi Halaman-halaman untuk Menu Mahasiswa
         am = new GuiAddMahasiswa();
            // private GuiDaftarMahasiswa dm;
         hm = new GuiHapusMahasiswa();
         mn = new GuiSearchMahasiswaByNim();
         
         //instansiasi Halaman-halaman untuk Menu Admin
         ma = new MenuAdmin();
         am = new GuiAddMatakuliah();
         dm = new GuiDaftarMatakuliah();
         rm = new RemoveMatakuliah();
         sm = new SetMatakuliah();
         
         
         
         mu.setVisible(true);
         
         
         // menu dosen
         mu.getGuiMenuDosen().addActionListener(this);
         
                 
         //Listener semua tombol pada semua Halaman menu mahasiswa
                 
        //Listener semua tombol pada semua Halaman menu mhs
    
        //Listener semua tombol pada semua Halaman menu admin
        mu.getGuiMenuAdmin().addActionListener(this);
        ma.getAddMatakuliah().addActionListener(this);
        ma.getDaftarMatakuliah().addActionListener(this);
        ma.getAddMatakuliahKeKelas().addActionListener(this);
        ma.getMenuUtama().addActionListener(this);
        am.getAddPadaAddMatakuliah().addActionListener(this);
        am.getKembaliPadaAddMatakuliah().addActionListener(this);
        
                 }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
