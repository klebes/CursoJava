/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancodados;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author KDS
 */
public class CriarTabelaPessoa {
    public static void main(String[] args) throws SQLException{
        
        String sql = ""
                + "CREATE TABLE pessoa ("
                + "codigo INT AUTO_INCREMENT PRIMARY KEY,"
                + "nome VARCHAR(100) NOT NULL"
                + ")";
        Connection connection = FabricaConnection.geConexao();
        Statement stmt = connection.createStatement();
        stmt.execute(sql);
        System.out.println("tabela criada com sucesso!");
        connection.close();
    }
}
