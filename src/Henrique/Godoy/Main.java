/**
 * @author Henrique Silva Godoy - RA: 16.01147-3
 * @author Lucas Menezes - RA: 16.00683-6
 * @since 03/12/2020
 * @version 1.0
 * */

package Henrique.Godoy;
import Henrique.Godoy.testes.ControladorEquipamento;
import Henrique.Godoy.testes.ControladorItens;
import Henrique.Godoy.testes.ControladorPersonagem;


public class Main {

    /** Classe principal do programa
     * @param args
     */
    public static void main(String[] args) {
        ControladorPersonagem controladorPersonagem = new ControladorPersonagem();
        controladorPersonagem.run();
        ControladorItens controladorItens = new ControladorItens();
        controladorItens.run2();
        ControladorEquipamento controladorEquipamento = new ControladorEquipamento();
        controladorEquipamento.run3();

    }
}
