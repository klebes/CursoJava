/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancodados;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author KDS
 */
public class ConsultaPessoaLike {
    public static void main(String[] args) throws SQLException {
        Scanner teclado = new Scanner(System.in);
        String sql = "SELECT * FROM pessoa where nome like '%kl%'";
        
        Connection conexao = FabricaConnection.geConexao();
        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);
        
        List<Pessoa> pessoa = new ArrayList<>();
        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            pessoa.add(new Pessoa(codigo, nome));
        }
        for(Pessoa p : pessoa){
            System.out.println("usuario" +p.getNumber() + p.getNome());
            
           
        }
        stmt.close();
         teclado.close();
    }
}
