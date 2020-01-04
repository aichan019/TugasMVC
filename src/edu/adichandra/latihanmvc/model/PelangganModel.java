/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.adichandra.latihanmvc.model;

import edu.adichandra.latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class PelangganModel {
    private String nama;
    private String email;
    private String noTelp;
    
    private PelangganListener pelangganListener;

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    }
    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        fireOnChange();
    }
    
    protected void fireOnChange(){
        if (pelangganListener != null) {
            pelangganListener.onChange(this);
        }
    }
    
    public void resetForm(){
        setNama("");
        setEmail("");
        setNoTelp("");
    }
    
    public void simpanForm(){
        JOptionPane.showMessageDialog(null, "Berhasil Di Simpan");
    }
    
}
