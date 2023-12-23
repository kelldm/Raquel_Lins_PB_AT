package repository;

import org.example.model.Servico;
import java.util.ArrayList;

//Fiz olhando os casos de uso e suas aulas

public class ServicoRepository {
    String data;
    private ArrayList<Servico> servicos = new ArrayList<>();
    private long lastID=1;

//Lista
    private ArrayList<Servico> list(){
        return servicos;
    }

//Criar
    public static Servico create(Servico servico){
        servico.setId(lastId++);
        servicos.add(servico);
        return servico;
    }

    public void faturamento(){
    }

    public void avaliacaoCliente(){
    }

    public void confirmacaoPagamento(){
    }

}
