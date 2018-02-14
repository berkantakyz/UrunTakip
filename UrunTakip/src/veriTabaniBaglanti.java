
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class veriTabaniBaglanti {

    
      Connection con = null ;
    public static Connection Baglan(){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/uruntakip","root","admin");
                //JOptionPane.showMessageDialog(null,"Veri Tabanına Bağlandı.");
                return con ;
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Veri Tabanına Bağlantı Hatası!\n"+e);
                return null ;
            }
}//metod sonu
    
    
    
}
