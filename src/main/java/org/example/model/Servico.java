package org.example.model;



public class Servico extends Cliente {

    private String datHoraCotacao;
    private String dataHoraServico;
    private String dataHoraPagamento;
    private double valor;
    private String avaliacao;

    public Servico(String nome, String telefone, String email, int cpf) {
        super(nome, telefone, email, cpf);
    }

    public String getDatHoraCotacao() {
        return datHoraCotacao;
    }

    public void setDatHoraCotacao(String datHoraCotacao) {
        this.datHoraCotacao = datHoraCotacao;
    }

    public String getDataHoraServico() {
        return dataHoraServico;
    }

    public void setDataHoraServico(String dataHoraServico) {
        this.dataHoraServico = dataHoraServico;
    }

    public String getDataHoraPagamento() {
        return dataHoraPagamento;
    }

    public void setDataHoraPagamento(String dataHoraPagamento) {
        this.dataHoraPagamento = dataHoraPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }


    public static String solicServico() {
        return"Serviço solicitado com sucesso!";
    }
    public static String solicCotacao(Cliente dados) {
        return"Cotação solicitado com sucesso!";
    }



}
