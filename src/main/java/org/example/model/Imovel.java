package org.example.model;

public class Imovel {
    private String logadouro;
    private String numero;
    private String cep;
    private String estado;
    private String cidade;
    private String bairro;
    private String complemento;


    public Imovel(String logadouro, String numero, String complemento, String bairro, String cidade, String estado, String cep) {
        this.logadouro = logadouro;
        this.numero = numero;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.complemento = complemento;
    }

    public Imovel(){}

    public static Imovel setDadosImovel(Imovel dados) {
        return(dados);
    }



}
