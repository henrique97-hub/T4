package Henrique.Godoy.testes;

import Henrique.Godoy.dao.ItensDAO;
import Henrique.Godoy.dao.PersonagemDAO;
import Henrique.Godoy.model.Itens;
import Henrique.Godoy.model.Personagem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *  Classe que contém todos os métodos de itens, necessários para
 *  executar o programa
 */
public class ControladorItens {

    private List<Itens> itens;
    private ItensDAO itensDAO;
    private Scanner scanner;

    /**
     * Construtor da classe
     */
    public ControladorItens() {
        itens = new ArrayList<>();
        itensDAO = new ItensDAO();
        scanner = new Scanner(System.in);

    }

    /**
     * Método que executa o programa, de acordo com as oções que o usuário
     * desejar realizar
     */
    public void run2() {
        boolean alive = true;
        do {
            menu2();
            int opcao = Integer.parseInt(scanner.next()); // transforma o que o usuario digitar em numero inteiro
            switch (opcao){
                case 0:
                    alive = false;
                    break;
                case 1:
                    consultarItens();
                    break;

                case 2:
                    deletarItens();
                    break;
                case 3:
                    atualizarItens();
                    break;
                case 4:
                    criarNovoItens();
                    break;
                default:
                    System.out.println("Opção invalida");
            }

        } while (alive); // while roda enquanto alive for true

    }

    /**
     * O menu oferece todos os tipos de interação que o usuario pode ter com o programa
     */
    private void menu2() {
        System.out.println("Bem vindo à lista de itens RPG!, escolha uma das opções abaixo: ");
        System.out.println("1 - Para ver os itens cadastrados");
        System.out.println("2 - Para deletar algum item cadastrado");
        System.out.println("3- Para Alterar algum dado de algum item ");
        System.out.println("4 - Para criar algum novo item");
        System.out.println("0 - Para sair");

    }

    /**
     * Método que permite atualizar os itens do banco de dados, de acordo
     * com o nome que o usuário digitar
     */
    private void atualizarItens() {
        itens = itensDAO.getAll();
        System.out.println("Digite o nome do item para alterar: ");
        String nome =scanner.next();
        String tipo;
        int poderDeAtaque,velocidadeDaArma,ataqueNecessario;
        double critico;
        String beneficio;

        System.out.println("Informe os novos dados: ");
        tipo = scanner.next();
        poderDeAtaque =Integer.parseInt(scanner.next());
        velocidadeDaArma =Integer.parseInt(scanner.next());
        ataqueNecessario =Integer.parseInt(scanner.next());
        critico =Double.parseDouble(scanner.next());
        beneficio = scanner.next();
        itensDAO.update(new Itens(
                nome,tipo,poderDeAtaque,velocidadeDaArma,ataqueNecessario,critico,beneficio
        ));

    }

    /**
     * Método que permite consultar todos os itens do banco de dados
     */
    private void consultarItens() {

        itens = itensDAO.getAll();
        System.out.println("Os itens cadastrados sao: ");
        itens.forEach(itens -> System.out.println(itens));

    }

    /**
     * Método que permite deletar itens, através de seu respectivo nome
     */
    private void deletarItens() {

        System.out.println("Digite o nome do item que você deseja deletar: ");
        String nome =scanner.next();
        Itens itens = new Itens(nome);
        itensDAO.delete(itens);

    }

    /**
     * Método que permite criar itens no banco de dados
     */
    private void criarNovoItens() {
        String nome ,tipo;
        int poderDeAtaque,velocidadeDaArma,ataqueNecessario;
        double critico;
        String beneficio;

        System.out.println("Informe os novos dados: ");
        nome = scanner.next();
        tipo = scanner.next();
        poderDeAtaque =Integer.parseInt(scanner.next());
        velocidadeDaArma =Integer.parseInt(scanner.next());
        ataqueNecessario =Integer.parseInt(scanner.next());
        critico = Double.parseDouble(scanner.next());
        beneficio = scanner.next();
        itensDAO.create(new Itens(
                nome,tipo,poderDeAtaque,velocidadeDaArma,ataqueNecessario,critico,beneficio

        ));
    }


    }




