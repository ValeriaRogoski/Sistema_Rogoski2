/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.VjrUsuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author u09208248119
 */
public class DaoVjrUsuario extends DaoVjrAbstract{
    @Override
    public void insert(Object object) {
        VjrUsuarios vjrUsuarios = (VjrUsuarios) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_valeria_rogoski";
            user = "valeria_rogoski";
            password = "valeria_rogoski";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into vjr_usuarios values (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement( sql );
            pst.setInt(1, vjrUsuarios.getVjrIdUsuarios());
            pst.setString(2, vjrUsuarios.getVjrNome());
            pst.setString(3, vjrUsuarios.getVjrApelido());
            pst.setString(4, vjrUsuarios.getVjrCpf());
            pst.setDate(5, null);
            pst.setInt(6, vjrUsuarios.getVjrNivel());
            pst.setString(7, vjrUsuarios.getVjrSenha());
            pst.setString(8, vjrUsuarios.getVjrAtivo());
            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
