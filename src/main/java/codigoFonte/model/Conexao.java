/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoFonte.model;


import javax.swing.*;
import java.sql.*;

/*
    TABELAS TEMPORARIAS

    CREATE TABLE permissoes(
    id INT NOT NULL AUTO_INCREMENT,
    usuario VARCHAR(45) NOT NULL,
    senha VARCHAR(45) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE cadastro(
    id INT NOT NULL AUTO_INCREMENT,
    usuario VARCHAR(45) NOT NULL,
    senha VARCHAR(16) NOT NULL,
    telefone VARCHAR(45),
    email VARCHAR(45),
    PRIMARY KEY(id)
 );

CREATE TABLE Produtos(
	id INT AUTO_INCREMENT NOT NULL ,
    nome VARCHAR(50) NOT NULL,
    preco DECIMAL(6,2),
    PRIMARY KEY(id)
);

*/

public class Conexao {

    public Statement stmt;
    public ResultSet resultSet;
    private Connection conexao;

    public static Connection conectar(){
        
        Connection conexao = null;
        String url = "jdbc:mysql://localhost:3306/bancodedados?characterEncoding=utf-8";
        String user = "root";
        String senha = "";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection(url, user, senha);
            JOptionPane.showMessageDialog(null, "Conexão estabelecida" +conexao, "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
            return conexao;
        }catch (ClassNotFoundException Driver){
            JOptionPane.showMessageDialog(null, "Driver Não localizado: "+Driver,"Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

        }catch (SQLException Fonte){
            JOptionPane.showMessageDialog(null, "Fonte de dados não localizada"+Fonte,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
            return null;
        }
        return conexao;
    }
    
}
 