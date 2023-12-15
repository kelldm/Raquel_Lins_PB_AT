package org.example.model;
import java.util.List;

public class Agenda {
    private static List<String> diasUteis;
    private String dataDisponivel;
    //arraydiasUteis

    public static String diasDisponiveis(Funcionario funcionario) {
        return("Está disponível 10/10/2024");
    }

    public List<String> getDiasUteis() {
        return diasUteis;
    }

    public void setDiasUteis() {
        this.diasUteis = diasUteis;
    }

    public static String verificaDiasUteis() {
        return("10/10/2024");
    }



}
