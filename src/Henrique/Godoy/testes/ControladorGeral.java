package Henrique.Godoy.testes;


// Classe que chama os controladores e "junta-os" em um unico menu
public class ControladorGeral{


    public static void main(String[] args){

        ControladorEquipamento controladorEquipamento = new ControladorEquipamento();
        ControladorPersonagem controladorPersonagem = new ControladorPersonagem();
        ControladorItens controladorItens = new ControladorItens();

//        public void run4(){
//
//            boolean alive = true;
//            do {
//                menu4();
//                int opcao = Integer.parseInt(scanner.next()); // transforma o que o usuario digitar em numero inteiro
//                switch (opcao) {
//                    case 0:
//                        alive = false;
//                        break;
//                    case 1:
//                        controladorEquipamento.run3();
//                        break;
//
//                    case 2:
//                        controladorItens.run2();
//                        break;
//                    case 3:
//                        controladorPersonagem.run();
//                        break;
//
//                    default:
//                        System.out.println("Opção invalida");
//                }
//
//            } while (alive); // while roda enquanto alive for true
//        }
//
//
//
//    }

//    private static void menu4() {
//        System.out.println("Bem vindo à lista de itens RPG!, escolha uma das opções abaixo: ");
//        System.out.println("1 - Para ver os equipamentos");
//        System.out.println("2 - Para ver os itens");
//        System.out.println("3- Para ver os personagens ");
//        System.out.println("0 - Para sair");
//    }
//
}}
