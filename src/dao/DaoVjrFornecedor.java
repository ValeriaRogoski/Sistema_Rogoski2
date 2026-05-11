/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.VjrFornecedor;
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
public class DaoVjrFornecedor extends DaoVjrAbstract{
    @Override
    public void insert(Object object) {
        VjrFornecedor vjrFornecedor = (VjrFornecedor) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_valeria_rogoski";
            user = "valeria_rogoski";
            password = "valeria_rogoski";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into vjr_fornecedor values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement( sql );
            pst.setInt(1, vjrFornecedor.getVjrCodigo());
            pst.setString(2, vjrFornecedor.getVjrNomeForne());
            pst.setInt(3, vjrFornecedor.getVjrCelular());
            pst.setInt(4, vjrFornecedor.getVjrTelefone());
            pst.setInt(5, vjrFornecedor.getVjrCep());
            pst.setInt(6, vjrFornecedor.getVjrCnpj());
            pst.setString(7, vjrFornecedor.getVjrEmail());
            pst.setDate(8, null);
            pst.setInt(9, vjrFornecedor.getVjrInsEst());
            pst.setString(10,vjrFornecedor.getVjrBairro());
            pst.setString(11, vjrFornecedor.getVjrCidade());
            pst.setString(12, vjrFornecedor.getVjrEndereco());
            pst.setString(13, vjrFornecedor.getVjrEstado());
            pst.setInt(14, vjrFornecedor.getVjrInsEst());
            pst.setString(15, vjrFornecedor.getVjrStatus());
            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoVjrFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoVjrFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void update(Object object) {
        VjrFornecedor vjrFornecedor = (VjrFornecedor) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_valeria_rogoski";
            user = "valeria_rogoski";
            password = "valeria_rogoski";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement("update set vjr_fornecedor values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ");
          
            pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoVjrFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoVjrFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Object object) {
        VjrFornecedor vjrFornecedor = (VjrFornecedor) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_valeria_rogoski";
            user = "valeria_rogoski";
            password = "valeria_rogoski";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "delete from vjr_fornecedor values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
            PreparedStatement pst = cnt.prepareStatement(sql);
            //
             pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoVjrFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoVjrFornecedor.class.getName()).log(Level.SEVERE, null, ex);
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
