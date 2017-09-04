

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author Stephanie
 * @version 1.1
 */
public class GuardarDatos {
    Connection con = null;
    Statement stat = null;
    ResultSet res = null;
    ResultSet resinfo = null;
    String usuario;
    String contra;
    String driver;
    String link;
    
    //guarda datos
    public GuardarDatos(){
        this.usuario = "root";
        this.contra = "n0m3l0";
        this.driver = "com.mysql.jdbc.Driver";
        this.link = "jdbc:mysql://localhost/Registro";
    }
    
    public void conectar(){
        try {
            Class.forName(this.driver).newInstance();
            con = DriverManager.getConnection(link, usuario, contra);
        } catch (Exception ex) {
            System.out.println("El Error es: " + ex.getMessage());
        }
    }
    
    //establece la conexion
    public void closeConexion() throws SQLException{
        this.con.close();
    }
    
    //INSERTA LOS DATOS QUE HA GUARDADO
    public void insertar(String Nom, String APP, String APM, String Esc) throws SQLException{
        stat = con.createStatement();
        stat.executeUpdate("Insert into Registro values("+null+",'"+Nom+"','"+APP+"','"+APM+"','"+Esc+"');");
    }
    //BUSCA LA EXISTENCIA DE UN REGISTRO EN LA CLASE
    public ResultSet consultar (String consulta) throws SQLException{
        stat = con.createStatement();
        return stat.executeQuery(consulta);
    }
    
    
    
    
}
