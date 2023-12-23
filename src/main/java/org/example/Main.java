package org.example;

import org.example.controller.ServicoController;

import java.util.ArrayList;


import static spark.Spark.*;

public class Main {

    static ServicoController servicoController = new ServicoController();

    public static void main(String[] args) {

        port(8080);

        path("/servico", ()-> {
            post("/gerarServico", (request, response) -> {
                return "Serviço solicitado com sucesso!!!!";
            });

            post("/cotacao", (request, response) -> {
                return "Serviço solicitado com sucesso!!!";
            });
            get("/emitirFatura/:servico", ((request, response) -> {
                return "Fatura processada com sucesso!!!!!";
            }));
        });

        path("/cadastrarCliente", ()->{
            post("/cadastrarCliente", (request, response) -> {
                return "Cliente cadastrado com sucesso!!!!";
            });
        });

        //SERVICO
        path("/servico", ()-> {
            get("/getAll", (req, res) -> servicoController.getAll(req,res));
            post("/insert", (req, res) -> servicoController.insert(req,res));
        });
        //SERVICO

        path("/verImovel", ()->{
            post("/imovel", (request, response) -> {
                return "Imovel cadastrado com sucesso!!!!";
            });
        });

        path("/agenda", ()-> {
            get("/verificarDiasUteis", (request, response) -> {
                return "Dias uteis:";
            });
            get("/diasDisponiveis", ((request, response) -> {
                return "Dias que o FUNCIONARIO esta disponivel";
            }));
            get("/Funcionarios", ((request, response) -> {
                return "Funcionaros disponiveis:";
            }));
        }
    }
}