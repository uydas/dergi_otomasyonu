/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dergi;

import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Dergiler {
     private int id;
    private String dergiadi;
    private String issn;
    private String alan;
    private String editor;
    private Date ilkyayın;
    private Date sonyayın;
    

 
 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDergiadi() {
        return dergiadi;
    }

    public void setDergiadi(String dergiadi) {
        this.dergiadi = dergiadi;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getAlan() {
        return alan;
    }

    public void setAlan(String alan) {
        this.alan = alan;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public Date getIlkyayın() {
        return ilkyayın;
    }

    public void setIlkyayın(Date ilkyayın) {
        this.ilkyayın = ilkyayın;
    }

    public Date getSonyayın() {
        return sonyayın;
    }

    public void setSonyayın(Date sonyayın) {
        this.sonyayın = sonyayın;
    }

    public void setRole(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
