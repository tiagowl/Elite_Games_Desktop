
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexao {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/elitegames";
    
    public static Connection conectarMysql() throws Exception{
    Class.forName("com.mysql.jdbc.Driver"); //Faz com que a classe seja carregada pela JVM
    
    Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
    
    return connection;
    }
    
    public static void main(String[] args) throws Exception{
        
        //Recupera uma conexão com o banco de dados
        Connection con = conectarMysql();
        
        //testa se a conexão é nula
        if(con != null){
            JOptionPane.showMessageDialog(null, "Conexão obtida com sucesso!");
            con.close();
        }
    }
    
}
