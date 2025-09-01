package com.school.sptech;

public class Biblioteca {
    private String nome;
    private double multaDiaria;
    private Integer qtdLivros = 0;
    private boolean ativa = true;

    public void nomeBlibioteca(){
       System.out.println("Nome biblioteca: ");
    }
    public  void multa(){
        System.out.println("Valor da multa diaria: ");
    }

    public  void  registrarLivros(Integer quantidade){
        if (quantidade>0 && quantidade!=null){
            System.out.println("Livro registrado");
        }
        else {
            System.out.println("Quantidade de livros invalida");
        }
    }

    public void emprestar(Integer quantidade){
        if(ativa==true && quantidade>0 && qtdLivros>=0 && qtdLivros!=null){
            System.out.println("Livro emprestado");
        }
        else {
            System.out.println(quantidade);
        }
    }
    public  void  devolver(Integer quantidade){
        if (quantidade>0 && quantidade!=null){
            System.out.println("Livro devolvido");
        }
        else {
            System.out.println(quantidade);
        }
    }
    public Integer desativar(){
        if (ativa=false){
            return null;
        }
        else {
            Integer quantidade_anterior= qtdLivros;
            qtdLivros=0;
            ativa=false;
            return quantidade_anterior;
        }
    }
    public void transferir (Biblioteca destino, Integer quantiadade){
        if (destino.ativa==true && ativa==true && quantiadade!=null && quantiadade<=qtdLivros){
            System.out.println("Livros transferidos com sucesso!");
        }
        else {
            System.out.println("Não foi possível transferir os livros");
        }
    }
    public  Boolean reajustarMulta(Double percentual){
        if (percentual>0 && percentual!=null){
            multaDiaria *= 1 +percentual;
            return true;
        }
        else {
            return false;
        }
    }
}
