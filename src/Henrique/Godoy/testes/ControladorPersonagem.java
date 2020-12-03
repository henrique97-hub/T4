package Henrique.Godoy.testes;

import Henrique.Godoy.dao.DAO;
import Henrique.Godoy.dao.PersonagemDAO;
import Henrique.Godoy.model.Personagem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe que contém os metodos de Personagem, necessarios para executar o programa
 */
public class ControladorPersonagem {
    private List<Personagem> personagems;
    private PersonagemDAO personagemDAO;
    private Scanner scanner;

    /**
     * Contrutor da classe
     */
    public ControladorPersonagem() {
        personagems = new ArrayList<>();
        personagemDAO = new PersonagemDAO();
        scanner = new Scanner(System.in);

    }

    /**
     * Método principal que executa as funções que o usuario desejar, de acordo com as
     * opções do menu
     */
    public void run() {
        boolean alive = true;
        do {
            menu();
            int opcao = Integer.parseInt(scanner.next()); // transforma o que o usuario digitar em numero inteiro
            switch (opcao){
                case 0:
                    alive = false;
                    break;
                case 1:
                    consultarPersonagens();
                    break;

                case 2:
                    deletarPersonagem();
                    break;
                case 3:
                    atualizarPersonagem();
                    break;
                case 4:
                    criarNovoPersonagem();
                    break;
                default:
                    System.out.println("Opção invalida");
            }

        } while (alive); // while roda enquanto alive for true

    }

    /**
     * Atuaiza o personagem de acordo com o nome que o usuário degitar
     */
    private void atualizarPersonagem() {
        personagems = personagemDAO.getAll();
        System.out.println("Digite o nome o personagem para alterar: ");
        String nome =scanner.next();
//        System.out.println("Cadastre os novos dados: ");
        String raca;
        String profissao;
        int mana;
        int ataque;
        int ataqueMagico;
        int defesa;
        int defesaMagica;
        int velocidade;
        int destreza;
        int experiencia;
        int nivel;
        System.out.println("Informe os novos dados: ");
        raca = scanner.next();
        profissao = scanner.next();
        mana =Integer.parseInt(scanner.next());
        ataque =Integer.parseInt(scanner.next());
        ataqueMagico =Integer.parseInt(scanner.next());
        defesa =Integer.parseInt(scanner.next());
        defesaMagica =Integer.parseInt(scanner.next());
        velocidade=Integer.parseInt(scanner.next());
        destreza=Integer.parseInt(scanner.next());
        experiencia = Integer.parseInt(scanner.next());
        nivel =Integer.parseInt(scanner.next());
        personagemDAO.update(new Personagem(
                nome,raca,profissao,mana,ataque,ataqueMagico,defesa,defesaMagica,velocidade,destreza,experiencia,nivel

        ));
    }

    /**
     * Método que permite cirar um ou mais personagens
     */
    private void criarNovoPersonagem() {
        String nome, raca, profissao;
        int mana,ataque,ataqueMagico, defesa, defesaMagica, velocidade, destreza, experiencia, nivel;

        System.out.println("Informe os novos dados: ");
        nome = scanner.next();
        raca = scanner.next();
        profissao = scanner.next();
        mana =Integer.parseInt(scanner.next());
        ataque =Integer.parseInt(scanner.next());
        ataqueMagico =Integer.parseInt(scanner.next());
        defesa =Integer.parseInt(scanner.next());
        defesaMagica =Integer.parseInt(scanner.next());
        velocidade=Integer.parseInt(scanner.next());
        destreza=Integer.parseInt(scanner.next());
        experiencia = Integer.parseInt(scanner.next());
        nivel =Integer.parseInt(scanner.next());
        personagemDAO.create(new Personagem(
                nome,raca,profissao,mana,ataque,ataqueMagico,defesa,defesaMagica,velocidade,destreza,experiencia,nivel
        ));


    }

    /**
     * Método que permite criar personagens de acordo com o nome que o uruário
     * digitar
     */
    private void deletarPersonagem() {
        System.out.println("Digite o nome do personagem que você deseja deletar: ");
        String nome =scanner.next();
        Personagem personagem = new Personagem(nome);
        personagemDAO.delete(personagem);

    }

    /**
     * Método que exibe todos os personagens já cadastrados
     */
    private void consultarPersonagens() {
        personagems = personagemDAO.getAll();
        System.out.println("Os personagens cadastrados sao: ");
        personagems.forEach(personagem -> System.out.println(personagem));

    }

    /**
     * Esse é o menu, que oferece as possiveis ações que o usuário pode ter
     * com o programa
     */
    private void menu() {
        System.out.println("Bem vindo ao RPG! ");
        System.out.println("-----------------------------------");
        System.out.println("Essa é a tela dos Personagens, escolha uma opção abaixo: ");
        System.out.println("1 - Para ver os personagens cadastrados");
        System.out.println("2 - Para deletar algum personagem cadastrado");
        System.out.println("3- Para Alterar algum dado de algum personagem ");
        System.out.println("4 - Para criar algum novo personagem");
        System.out.println("0 - Para sair");

    }


}
