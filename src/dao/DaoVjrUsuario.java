/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.VjrBebida;
import bean.VjrUsuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import dao.DaoVjrAbstract;

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
            Logger.getLogger(DaoVjrUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoVjrUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     @Override
    public void update(Object object) {
        VjrUsuarios VjrUsuarios = (VjrUsuarios) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_valeria_rogoski";
            user = "valeria_rogoski";
            password = "valeria_rogoski";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement("update set vjr_usuarios values(?,?,?,?,?,?,?,?) ");
          
            pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoVjrBebida.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoVjrBebida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Object object) {
        VjrBebida vjrBebida = (VjrBebida) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_valeria_rogoski";
            user = "valeria_rogoski";
            password = "valeria_rogoski";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "delete from vjr_usuarios values(?,?,?,?,?,?,?,?) ";
            PreparedStatement pst = cnt.prepareStatement(sql);
            //
             pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoVjrBebida.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoVjrBebida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Object list(int id) {
        return null;
    }

    @Override
    public Object listAll() {
        return null;
    }
}
