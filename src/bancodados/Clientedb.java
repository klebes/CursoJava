/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancodados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author KDS
 */
public class Clientedb {
    public static void main(String[] args) throws SQLException {
      Scanner teclado = new Scanner(System.in);
        System.out.println("digite seu nome: ");
        String nome = teclado.next();
        String sql = "INSERT INTO pessoa (nome) values (?)";
        Connection conexao = FabricaConnection.geConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.execute();
        System.out.println("pessoa incluida com sucesso");
        teclado.close();
    }
}
