/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancodados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author KDS
 */
public class FabricaConnection {

    public static Connection geConexao() {
        try {
            final String url = "jdbc:mysql://localhost";
            final String usuario = "root";
            final String senha = "";
         return DriverManager.getConnection(url, usuario, senha);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
