/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeestoque.DAO;
import java.sql.*;
/*
 *
 * @author Aluno
 */

public class ConnectionFactory {
    private static final String URL = "jdbc:postgresql://localhost:5432/DBControleEstoque";
    private static String USER = "UserControleEstoque";
    private static final String PASS = "123456";
    
    public static Connection getConnection()
    {
        try
        {
            System.out.print("Conectado ao banco de dados!");
            return DriverManager.getConnection(URL, USER, PASS);
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
    }

