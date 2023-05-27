/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoFonte.Controller;

import codigoFonte.model.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Feh
 */
public class ConectarBD {
    
    public Connection conexao = null;
    public PreparedStatement ptsm = null;
    public ResultSet result = null;
    
    public boolean statusConexao(){
        conexao = Conexao.conectar();
        
        if(conexao != null){
            return true;
        }
        else{
            return false;
        }
    }
    
}
