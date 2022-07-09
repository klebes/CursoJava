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
public class CriarBanco {
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConnection.geConexao();
        
        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java2");
        System.out.println("Banco criado com sucesso");
        conexao.close();
        
    }
}
