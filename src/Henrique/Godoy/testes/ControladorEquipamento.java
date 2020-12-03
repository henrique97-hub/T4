package Henrique.Godoy.testes;

import Henrique.Godoy.dao.EquipamentosDAO;
import Henrique.Godoy.dao.ItensDAO;
import Henrique.Godoy.model.Equipamentos;
import Henrique.Godoy.model.Itens;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe que contém todos os métodos necessarios de Equipamentos, para
 * executar o programa
 */
public class ControladorEquipamento {

    private List<Equipamentos> equipamentos;
    private EquipamentosDAO equipamentosDAO;
    public Scanner scanner;

    public ControladorEquipamento() {
        equipamentos = new ArrayList<>();
        equipamentosDAO = new EquipamentosDAO();
        scanner = new Scanner(System.in);

    }

    public void run3() {
        boolean alive = true;
        do {
            menu3();
            int opcao = Integer.parseInt(scanner.next()); // transforma o que o usuario digitar em numero inteiro
            switch (opcao){
                case 0:
                    alive = false;
                    break;
                case 1:
                    consultarEquipamentos();
                    break;

                case 2:
                    deletarEquipamentos();
                    break;
                case 3:
                    atualizarEquipamentos();
                    break;
                case 4:
                    criarNovoEquipamento();
                    break;
                default:
                    System.out.println("Opção invalida");
            }

        } while (alive); // while roda enquanto alive for true

    }
    private void menu3() {
        System.out.println("Bem vindo à lista de equipamentos RPG!, escolha uma das opções abaixo: ");
        System.out.println("1 - Para ver os equipamentos cadastrados");
        System.out.println("2 - Para deletar algum equipamento cadastrado");
        System.out.println("3- Para Alterar algum dado de algum equipamento ");
        System.out.println("4 - Para criar algum novo equipamento");
        System.out.println("0 - Para sair");

    }

    private void atualizarEquipamentos() {
        equipamentos = equipamentosDAO.getAll();
        System.out.println("Digite o nome do equipamento para alterar: ");
        String nome =scanner.next();
        String tipo;
        int poderDeAtaque,poderDeDefesa,defesaNecessaria;
        String beneficio;

        System.out.println("Informe os novos dados: ");
        tipo = scanner.next();
        poderDeAtaque =Integer.parseInt(scanner.next());
        poderDeDefesa =Integer.parseInt(scanner.next());
        defesaNecessaria =Integer.parseInt(scanner.next());
        beneficio =scanner.next();
        equipamentosDAO.update(new Equipamentos(
                nome,tipo,poderDeAtaque,poderDeDefesa,beneficio
        ));

    }
    private void consultarEquipamentos() {

        equipamentos = equipamentosDAO.getAll();
        System.out.println("Os itens cadastrados sao: ");
        equipamentos.forEach(itens -> System.out.println(equipamentos));

    }

    private void deletarEquipamentos() {

        System.out.println("Digite o nome do equipamento que você deseja deletar: ");
        String nome =scanner.next();
        Equipamentos equipamentos = new Equipamentos(nome);
        equipamentosDAO.delete(equipamentos);

    }

    private void criarNovoEquipamento() {
        String nome ,tipo;
        int poderDeDefesa,defesaNecessaria;
        String beneficio;

        System.out.println("Informe os novos dados: ");
        nome = scanner.next();
        tipo = scanner.next();
        poderDeDefesa = Integer.parseInt(scanner.next());
        defesaNecessaria = Integer.parseInt(scanner.next());
        beneficio = scanner.next();
        equipamentosDAO.create(new Equipamentos(
                nome,tipo,poderDeDefesa,defesaNecessaria,beneficio

        ));
    }

}

