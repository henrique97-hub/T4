package Henrique.Godoy.testes;

import Henrique.Godoy.dao.DAO;
import Henrique.Godoy.dao.PersonagemDAO;
import Henrique.Godoy.model.Personagem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controlador {
    private List<Personagem> personagens;
    private PersonagemDAO personagemDAO;
    private Scanner scanner;

    public Controlador() {
        personagens = new ArrayList<>();
        personagemDAO = new PersonagemDAO();
        scanner = new Scanner(System.in);

    }
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
                    alterarPersonagem();
                    break;
                case 4:
                    criarNovoPersonagem();
                    break;
                default:
                    System.out.println("Opção invalida");
            }

        } while (alive); // while roda enquanto alive for true

    }

    private void menu() {
        System.out.println("Bem vindo ao RPG!, escolha uma das opções abaixo: ");
        System.out.println("1 - Para ver os personagens cadastrados");
        System.out.println("2 - Para deletar algum personagem cadastrado");
        System.out.println("3- Para Alterar algum dado de algum personagem ");
        System.out.println("4 - Para criar algum novo personagem");
        System.out.println("0 - Para sair");

    }

    private void criarNovoPersonagem() {
        String nome, raca, profissao;
        int mana,ataque,ataqueMagico, defesa, defesaMagica, velocidade, destreza;
        double experiencia;
        int nivel;
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
        experiencia = Double.parseDouble(scanner.next());
        nivel =Integer.parseInt(scanner.next());
        personagemDAO.create(new Personagem(
                nome,raca,profissao,mana,ataque,ataqueMagico,defesa,defesaMagica,velocidade,destreza,experiencia,nivel
        ));


    }

    private void alterarPersonagem() {
        personagens = personagemDAO.getAll();
        System.out.println("Digite o nome o personagem para alterar: ");
        String nome =scanner.next();
        System.out.println("Cadastre os novos dados: ");
        String raca;
        String profissao;
        int mana;
        int ataque;
        int ataqueMagico;
        int defesa;
        int defesaMagica;
        int velocidade;
        int destreza;
        double experiencia;
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
        experiencia = Double.parseDouble(scanner.next());
        nivel =Integer.parseInt(scanner.next());
        personagemDAO.update(new Personagem(
                nome,raca,profissao,mana,ataque,ataqueMagico,defesa,defesaMagica,velocidade,destreza,experiencia,nivel

        ));
    }

    private void deletarPersonagem() {
        System.out.println("Digite o nome do personagem que você deseja deletar: ");
        String nome =scanner.next();
        Personagem personagem = new Personagem(nome);
        personagemDAO.delete(personagem);



    }

    private void consultarPersonagens() {
        personagens = personagemDAO.getAll();
        System.out.println("Os personagens cadastrados sao: ");
        personagens.forEach(personagem -> System.out.println(personagem));

    }


}
