
package codigoFonte.Controller;

import java.sql.*;

public class SetaPermissoes {
    public void configurarPermissoes(String usuario, String senha, boolean isAdmin, PreparedStatement ptsm) {
    
    try  {
        
        // Cria função de usuário "usuário padrão" ou "administrador"
        String role = isAdmin ? "administrador" : "usuario_padrao";
        String sql = "CREATE ROLE '" + role + "'";
        ptsm.executeUpdate(sql);

        // Define permissões para a função "usuário padrão" ou "administrador"
        String tableName = "permissoes";
        if(role.equalsIgnoreCase("administrador")){
              sql = "GRANT SELECT, INSERT, UPDATE, DELETE ON " + tableName + " TO '" + role + "'";
        }
        else{
               sql = "GRANT SELECT ON " + tableName + " TO '" + role + "'";
        }
        ptsm.executeUpdate(sql);

        // Cria usuário e atribui a função "usuário padrão" ou "administrador"
        String host = "localhost";
        sql = "CREATE USER '" + usuario + "'@'" + host + "' IDENTIFIED BY '" + senha + "'";
        ptsm.executeUpdate(sql);

        sql = "GRANT '" + role + "' TO '" + usuario + "'@'" + host + "'";
        ptsm.executeUpdate(sql);

        // System.out.println("Permissões concedidas com sucesso!");

    } catch (SQLException e) {
        System.out.println("Erro ao conceder permissões: " + e.getMessage());
    }
}

}
