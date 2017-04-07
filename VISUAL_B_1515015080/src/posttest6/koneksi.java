
package posttest6;
/**
 *
 * @author Spitzery
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class koneksi {
    private static Connection con;
    public static Connection getConnection(){
        
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/praktikum_visual","root","");
            //Merupakan koneksi ke localhost dengan databases praktikum_visual dengan user root
              JOptionPane.showMessageDialog(null, "Koneksi Berhasil"); 
//Jika berhasil akan muncul pop ( JOptionpane ) yang berisikan string koneksi berhasil
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Koneksi gagal: "+e.getMessage());
            //Jika gagal akan munucl Koneksi gagal        
        }
           
      return con;  
    }
}
