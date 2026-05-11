/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;
import java.util.Date;

/**
 *
 * @author u09208248119
 */
public class VjrVenda {

    /**
     * @return the VjrIdVenda
     */
    public int getVjrIdVenda() {
        return VjrIdVenda;
    }

    /**
     * @param VjrIdVenda the VjrIdVenda to set
     */
    public void setVjrIdVenda(int VjrIdVenda) {
        this.VjrIdVenda = VjrIdVenda;
    }

    /**
     * @return the VjrDataVenda
     */
    public Date getVjrDataVenda() {
        return VjrDataVenda;
    }

    /**
     * @param VjrDataVenda the VjrDataVenda to set
     */
    public void setVjrDataVenda(Date VjrDataVenda) {
        this.VjrDataVenda = VjrDataVenda;
    }

    /**
     * @return the VjrClienteNome
     */
    public String getVjrClienteNome() {
        return VjrClienteNome;
    }

    /**
     * @param VjrClienteNome the VjrClienteNome to set
     */
    public void setVjrClienteNome(String VjrClienteNome) {
        this.VjrClienteNome = VjrClienteNome;
    }

    /**
     * @return the VjrProdutoNome
     */
    public String getVjrProdutoNome() {
        return VjrProdutoNome;
    }

    /**
     * @param VjrProdutoNome the VjrProdutoNome to set
     */
    public void setVjrProdutoNome(String VjrProdutoNome) {
        this.VjrProdutoNome = VjrProdutoNome;
    }

    /**
     * @return the VjrQuantidade
     */
    public int getVjrQuantidade() {
        return VjrQuantidade;
    }

    /**
     * @param VjrQuantidade the VjrQuantidade to set
     */
    public void setVjrQuantidade(int VjrQuantidade) {
        this.VjrQuantidade = VjrQuantidade;
    }

    /**
     * @return the VjrPrecoUnitario
     */
    public int getVjrPrecoUnitario() {
        return VjrPrecoUnitario;
    }

    /**
     * @param VjrPrecoUnitario the VjrPrecoUnitario to set
     */
    public void setVjrPrecoUnitario(int VjrPrecoUnitario) {
        this.VjrPrecoUnitario = VjrPrecoUnitario;
    }

    /**
     * @return the VjrValorTotal
     */
    public int getVjrValorTotal() {
        return VjrValorTotal;
    }

    /**
     * @param VjrValorTotal the VjrValorTotal to set
     */
    public void setVjrValorTotal(int VjrValorTotal) {
        this.VjrValorTotal = VjrValorTotal;
    }

    /**
     * @return the VjrFormaPagamento
     */
    public String getVjrFormaPagamento() {
        return VjrFormaPagamento;
    }

    /**
     * @param VjrFormaPagamento the VjrFormaPagamento to set
     */
    public void setVjrFormaPagamento(String VjrFormaPagamento) {
        this.VjrFormaPagamento = VjrFormaPagamento;
    }
    private int VjrIdVenda;
    private Date VjrDataVenda;
    private String VjrClienteNome;
    private String VjrProdutoNome;
    private int VjrQuantidade;
    private int VjrPrecoUnitario;
    private int VjrValorTotal;
    private String VjrFormaPagamento;
}
