/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancodados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author KDS
 */
public class ConsultaPessoaId {

    public static void main(String[] args) throws SQLException {
        Scanner teclado = new Scanner(System.in);
        Connection conexao = FabricaConnection.geConexao();
        System.out.println("digite seu codigo de usuario:");
        int digito = teclado.nextInt();
        String sql = "SELECT codigo, nome FROM pessoa WHERE codigo = ?";
        String update = "UPDATE pessoa SET nome = ? WHERE codigo = ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, digito);
        ResultSet r = stmt.executeQuery();
        if (r.next()) {
            Pessoa p = new Pessoa(r.getInt(1), r.getString(2));
            
            System.out.println("O seu nome atual é " + p.getNome());
            teclado.nextLine();
            System.out.println("Informe seu novo nome: " );
            String novNome = teclado.nextLine();
            stmt.close();
            stmt = conexao.prepareStatement(update);
            stmt.setString(1, novNome);
            stmt.setInt(2, digito);
            stmt.execute();
            System.out.println("Pessoa alterada com sucesso!");
            
        }
        conexao.close();
        teclado.close();
        
    }
}
