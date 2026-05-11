/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.VjrBebida;
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
public class DaoVjrBebida extends DaoVjrAbstract {
    @Override
    public void insert(Object object) {
        VjrBebida vjrBebida = (VjrBebida) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_valeria_rogoski";
            user = "valeria_rogoski";
            password = "valeria_rogoski";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into vjr_usuarios values (?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement( sql );
            pst.setInt(1, vjrBebida.getVjrIdBebida());
            pst.setString(2, vjrBebida.getVjrNome());
            pst.setString(3, vjrBebida.getVjrMarca());
            pst.setInt(4, vjrBebida.getVjrVolume());
            pst.setInt(5, vjrBebida.getVjrPreco());
            pst.setDate(6, null);
            pst.setString(7, vjrBebida.getVjrStatus());
            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoVjrBebida.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoVjrBebida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     @Override
    public void update(Object object) {
        VjrBebida vjrBebida = (VjrBebida) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_valeria_rogoski";
            user = "valeria_rogoski";
            password = "valeria_rogoski";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement("update set vjr_bebidas values(?,?,?,?,?,?,?) ");
          
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
            String sql = "delete from vjr_bebidas values(?,?,?,?,?,?,?) ";
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
