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

/**
 *
 * @author u09208248119
 */
public class DaoVjrBebida {
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
            String sql = "insert into vjr_usuarios values (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement( sql );
            pst.setInt(1, vjrBebida.getVjrIdBebida());
            pst.setString(2, vjrBebida.getVjrNome());
            pst.setString(3, vjrBebida.getVjrMarca());
            pst.setInt(4, vjrBebida.getVjrVolume());
            pst.setInt(5, VjrBebida.getVjrPreco());
            pst.setDate(6, null);
            pst.setString(7, vjrBebida.getVjrStatus());
            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
