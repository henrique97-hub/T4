package Henrique.Godoy.testes;

import Henrique.Godoy.dao.ItensDAO;
import Henrique.Godoy.dao.PersonagemDAO;
import Henrique.Godoy.model.Itens;
import Henrique.Godoy.model.Personagem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControladorItens {

    private List<Itens> itens;
    private ItensDAO itensDAO;
    private Scanner scanner;

    public ControladorItens() {
        itens = new ArrayList<>();
        itensDAO = new ItensDAO();
        scanner = new Scanner(System.in);

    }
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

    private void menu2() {
        System.out.println("Bem vindo à lista de itens RPG!, escolha uma das opções abaixo: ");
        System.out.println("1 - Para ver os itens cadastrados");
        System.out.println("2 - Para deletar algum item cadastrado");
        System.out.println("3- Para Alterar algum dado de algum item ");
        System.out.println("4 - Para criar algum novo item");
        System.out.println("0 - Para sair");

    }

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
        beneficio = scanner.nextLine();
        itensDAO.update(new Itens(
                nome,tipo,poderDeAtaque,velocidadeDaArma,ataqueNecessario,critico,beneficio
        ));

    }

    private void consultarItens() {

        itens = itensDAO.getAll();
        System.out.println("Os itens cadastrados sao: ");
        itens.forEach(itens -> System.out.println(itens));

    }

    private void deletarItens() {

        System.out.println("Digite o nome do item que você deseja deletar: ");
        String nome =scanner.next();
        Itens itens = new Itens(nome);
        itensDAO.delete(itens);

    }

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
        critico =Double.parseDouble(scanner.next());
        beneficio = scanner.nextLine();
        itensDAO.create(new Itens(
                nome,tipo,poderDeAtaque,velocidadeDaArma,ataqueNecessario,critico,beneficio

        ));
    }


    }




