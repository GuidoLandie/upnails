package br.com.landie.upnails.entidade;

import java.util.Calendar;

/**
 * Created by GuidoS2Bina on 13/05/2017.
 */

public class PrestacaoServico {

    private Integer codPrestacaoServico;

    private Servico servico;

    private String nomeCliente;

    private  String obsercacao;

    private Calendar dataAgendamento;

    private double valorCobrado;

    private boolean servicoRealizado;

    public Integer getCodPrestacaoServico() {
        return codPrestacaoServico;
    }

    public void setCodPrestacaoServico(Integer codPrestacaoServico) {
        this.codPrestacaoServico = codPrestacaoServico;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getObsercacao() {
        return obsercacao;
    }

    public void setObsercacao(String obsercacao) {
        this.obsercacao = obsercacao;
    }

    public Calendar getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(Calendar dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public double getValorCobrado() {
        return valorCobrado;
    }

    public void setValorCobrado(double valorCobrado) {
        this.valorCobrado = valorCobrado;
    }

    public boolean isServicoRealizado() {
        return servicoRealizado;
    }

    public void setServicoRealizado(boolean servicoRealizado) {
        this.servicoRealizado = servicoRealizado;
    }
}
