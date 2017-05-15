package br.com.landie.upnails.entidade;

/**
 * Created by GuidoS2Bina on 13/05/2017.
 */

public class Servico {

    private Integer codigo;

    private String nome;

    private Double valor;

    private Double tempoMedio;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getTempoMedio() {
        return tempoMedio;
    }

    public void setTempoMedio(Double tempoMedio) {
        this.tempoMedio = tempoMedio;
    }
}
