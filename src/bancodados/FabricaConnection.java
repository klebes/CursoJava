/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancodados;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author KDS
 */
public class FabricaConnection {

    public static Connection geConexao() {
        try {
            Properties prop = getProperties();
            final String url = prop.getProperty("banco.url");
            final String usuario = prop.getProperty("usuario.url");
            final String senha = prop.getProperty("senha.url");
         return DriverManager.getConnection(url, usuario, senha);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    private static Properties getProperties() throws IOException{
        Properties prop = new Properties();
        String caminho = "/conexao.properties";
        prop.load(FabricaConnection.class.getResourceAsStream(caminho));
        return prop;
    }
}
