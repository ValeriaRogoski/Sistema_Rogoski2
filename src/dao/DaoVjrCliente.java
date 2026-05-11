/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import bean.VjrCliente;
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
public class DaoVjrCliente extends DaoVjrAbstract{
    @Override
    public void insert(Object object) {
        VjrCliente vjrCliente = (VjrCliente) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_valeria_rogoski";
            user = "valeria_rogoski";
            password = "valeria_rogoski";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into vjr_cliente values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement( sql );
            pst.setInt(1, vjrCliente.getVjrCodigo());
            pst.setString(2, vjrCliente.getVjrNome());
            pst.setInt(3, vjrCliente.getVjrNumero());
            pst.setInt(4, vjrCliente.getVjrTelefone());
            pst.setInt(5, vjrCliente.getVjrCpf());
            pst.setInt(6, vjrCliente.getVjrRg());
            pst.setString(7, vjrCliente.getVjrEmail());
            pst.setDate(8, null);
            pst.setInt(9, vjrCliente.getVjrCep());
            pst.setString(10,vjrCliente.getVjrBairro());
            pst.setString(11, vjrCliente.getVjrCidade());
            pst.setString(12, vjrCliente.getVjrEndereco());
            pst.setString(13, vjrCliente.getVjrEstado());
            pst.setString(14, vjrCliente.getVjrSexo());
            pst.setInt(15, vjrCliente.getVjrCelular());
            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoVjrCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoVjrCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     @Override
    public void update(Object object) {
        VjrCliente vjrCliente = (VjrCliente) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_valeria_rogoski";
            user = "valeria_rogoski";
            password = "valeria_rogoski";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement("update set vjr_cliente values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ");
          
            pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoVjrCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoVjrCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Object object) {
        VjrCliente vjrCliente = (VjrCliente) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_valeria_rogoski";
            user = "valeria_rogoski";
            password = "valeria_rogoski";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "delete from vjr_cliente values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
            PreparedStatement pst = cnt.prepareStatement(sql);
            //
             pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoVjrCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoVjrCliente.class.getName()).log(Level.SEVERE, null, ex);
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
