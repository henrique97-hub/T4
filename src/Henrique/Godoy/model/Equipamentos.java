package Henrique.Godoy.model;

/**
 * Classe Equipamentos, possui as caracteristicas de equipamentos que,
 * existem no jogo
 */
public class Equipamentos {
    private String nome;
    private String tipo;
    private int poderDeDefesa;
    private int defesaNecessaria;
    private String beneficio;

    /** Construtor da classe
     * @param nome - nome do equipamento
     * @param tipo - tipo de equipamento
     * @param poderDeDefesa - poder de defesa que o equipamento refletirá ao personagem
     * @param defesaNecessaria- defesa necessária para utilizar o equipamento
     * @param beneficio - benefício que o equipamento trará ao personagem
     */
    public Equipamentos(String nome, String tipo, int poderDeDefesa, int defesaNecessaria, String beneficio) {
        this.nome = nome;
        this.tipo = tipo;
        this.poderDeDefesa = poderDeDefesa;
        this.defesaNecessaria = defesaNecessaria;
        this.beneficio = beneficio;
    }

    /** Meio utilizado para executar o metodo de deletar personagens, da Classe EquipamentosDAO (delete)
     * @param nome - recebe um paramentro nome e passa-o ao contrutor
     */
    public Equipamentos(String nome){
        this(nome,null,0,0,null);
    }

    /**
     * @return função que exibe as caracteristicas provindas dos equipamentos, no
     * formato desta função
     */
    @Override
    public String toString() {
        return "Equipamentos{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", poderDeDefesa=" + poderDeDefesa +
                ", defesaNecessaria=" + defesaNecessaria +
                ", beneficio='" + beneficio + '\'' +
                '}';
    }

    /** Método que permite obter o nome do equipamento
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /** Método que permite obter o tipo do equipamento
     * @return tipo
     */
    public String getTipo() {
        return tipo;
    }

    /** Método que permite obter o poder de defesa do equipamento
     * @return poder de defesa
     */
    public int getPoderDeDefesa() {
        return poderDeDefesa;
    }

    /** Método que permite obter o valor da defesa necessaria para utilizar o equipamento
     * @return defesa necessaria
     */
    public int getDefesaNecessaria() {
        return defesaNecessaria;
    }

    /** Método que exibe ao personagem, o tipo de benefício que ele recebe ao
     * utilizar o equipamento
     * @return beneficio
     */
    public String getBeneficio() {
        return beneficio;
    }
}
