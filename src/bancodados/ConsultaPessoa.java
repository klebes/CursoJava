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

/**
 *
 * @author KDS
 */
public class ConsultaPessoa {
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConnection.geConexao();
        String sql="SELECT * FROM pessoa";
        Statement stmt = conexao.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        List<Pessoa> pessoa = new ArrayList<>();
        while (result.next()) {            
            int codigo = result.getInt("codigo");
            String nome = result.getString("nome");
            pessoa.add(new Pessoa(codigo, nome));
        }
        for(Pessoa p : pessoa){
            System.out.println(p.getNumber() + " ==> " + p.getNome());
        }
    }
}
