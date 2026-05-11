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
public class VjrCompra {

    /**
     * @return the VjrIdCompra
     */
    public int getVjrIdCompra() {
        return VjrIdCompra;
    }

    /**
     * @param VjrIdCompra the VjrIdCompra to set
     */
    public void setVjrIdCompra(int VjrIdCompra) {
        this.VjrIdCompra = VjrIdCompra;
    }

    /**
     * @return the VjrDataCompra
     */
    public Date getVjrDataCompra() {
        return VjrDataCompra;
    }

    /**
     * @param VjrDataCompra the VjrDataCompra to set
     */
    public void setVjrDataCompra(Date VjrDataCompra) {
        this.VjrDataCompra = VjrDataCompra;
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

    /**
     * @return the VjrStatus
     */
    public String getVjrStatus() {
        return VjrStatus;
    }

    /**
     * @param VjrStatus the VjrStatus to set
     */
    public void setVjrStatus(String VjrStatus) {
        this.VjrStatus = VjrStatus;
    }

    /**
     * @return the VjrDesconto
     */
    public int getVjrDesconto() {
        return VjrDesconto;
    }

    /**
     * @param VjrDesconto the VjrDesconto to set
     */
    public void setVjrDesconto(int VjrDesconto) {
        this.VjrDesconto = VjrDesconto;
    }

    /**
     * @return the VjrObservacao
     */
    public String getVjrObservacao() {
        return VjrObservacao;
    }

    /**
     * @param VjrObservacao the VjrObservacao to set
     */
    public void setVjrObservacao(String VjrObservacao) {
        this.VjrObservacao = VjrObservacao;
    }
    private int VjrIdCompra;
    private Date VjrDataCompra;
    private int VjrValorTotal;
    private String VjrFormaPagamento;
    private String VjrStatus;
    private int VjrDesconto;
    private String VjrObservacao;
}
