package org.example.controller;
import com.google.gson.Gson;
import repository.ServicoRepository;
import org.example.model.Servico;
import spark.Request;
import spark.Response;
import java.util.ArrayList;

public class ServicoController {
    ServicoRepository servicoRepository = new ServicoRepository();

    Gson gson =new Gson();

    //Listar
    public String getAll(Response res, Request req){
        var servicoList = servicoRepository.list();
        var servicoListStr = gson.toJson(servicoList);
        return servicoListStr;
    }

    //Inserir
    public Servico insert(String nome, String telefone, String email, String cpf ){
        Servico servico = new Servico( nome,  telefone,  email, cpf);
        servicoRepository.create(servico);
    }

    public String insert( Request req, Response res ) {
        String body = req.body();
        Servico servicoObj = gson.fromJson(body, Servico.class);
        Servico servico =servicoRepository.create(servicoObj);
        res.status(201);
        var servicoStr = gson.toJson(servico);
        return servicoStr;
    }

}
