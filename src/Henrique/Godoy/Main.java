package Henrique.Godoy;

import Henrique.Godoy.testes.ControladorEquipamento;
import Henrique.Godoy.testes.ControladorItens;
import Henrique.Godoy.testes.ControladorPersonagem;

// passar as coisas da main para ControladorGeral e instanciar controladorGeral aqui
public class Main {

    public static void main(String[] args) {
        ControladorItens controladorItens = new ControladorItens();
        controladorItens.run2();
        ControladorPersonagem controladorPersonagem = new ControladorPersonagem();
        controladorPersonagem.run();
        ControladorEquipamento controladorEquipamento = new ControladorEquipamento();
        controladorEquipamento.run3();

    }
}
