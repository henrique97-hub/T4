package Henrique.Godoy.model;

/**
 * Classe referente ao Personagem do rpg,
 * nela, encontra-se todas as caracteristicas do personagem
 */
public class Personagem {
    private String nome;
    private String raca;
    private String profissao;
    private int mana;
    private int ataque;
    private int ataqueMagico;
    private int defesa;
    private int defesaMagica;
    private int velocidade;
    private int destreza;
    private int experiencia;
    private int nivel;

    /**
     * @param nome - referente ao nome do personagem
     * @param raca - refere-se a raça do personagem
     * @param profissao - refere-se a profissão do personagem
     * @param mana - referente a quantidade de mana que o personagem possuirá
     * @param ataque - referente ao valor do ataque do personagem
     * @param ataqueMagico - referente ao valor do ataque mágico do personagem
     * @param defesa - referente ao valor de defesa do personagem
     * @param defesaMagica - referente ao valor de defesa mágica do personagem
     * @param velocidade - referente ao valor da velocidade do personagem
     * @param destreza - refere-se a destreza que o personagem possuirá
     * @param experiencia - refere-se a quantidade de experiencia que o personagem possuirá
     * @param nivel - refere-se ao nivel do personagem
     */
    public Personagem(String nome, String raca, String profissao, int mana, int ataque, int ataqueMagico, int defesa, int defesaMagica, int velocidade, int destreza, int experiencia, int nivel) {
        this.nome = nome;
        this.raca = raca;
        this.profissao = profissao;
        this.mana = mana;
        this.ataque = ataque;
        this.ataqueMagico = ataqueMagico;
        this.defesa = defesa;
        this.defesaMagica = defesaMagica;
        this.velocidade = velocidade;
        this.destreza = destreza;
        this.experiencia = experiencia;
        this.nivel = nivel;
    }

    /**
     * Meio utilizado para deletar personagens, em PersonagemDAO
     * recebe apenas uma String de nome e retorna um construtor apenas com o nome que foi inserido
     * @param nome
     */
    public Personagem(String nome){
        this(nome,null,null,0,0,0,0,0,0,0,0,0);

    }

    /**
     * @return Exibe os valores no formato da função
     */
    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", profissao='" + profissao + '\'' +
                ", mana=" + mana +
                ", ataque=" + ataque +
                ", ataqueMagico=" + ataqueMagico +
                ", defesa=" + defesa +
                ", defesaMagica=" + defesaMagica +
                ", velocidade=" + velocidade +
                ", destreza=" + destreza +
                ", experiencia=" + experiencia +
                ", nivel=" + nivel +
                '}';
    }

    /** Método para obter o nome do personagem
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /** Método para obter a raça do personagem
     * @return raça
     */
    public String getRaca() {
        return raca;
    }

    /** Método para obter a profissão do personagem
     * @return profissão
     */
    public String getProfissao() {
        return profissao;
    }


    /** Método para obter a quantidade de mana do personagem
     * @return mana
     */
    public int getMana() {
        return mana;
    }

    /** Método para obter o valor de ataque do personagem
     * @return ataque
     */
    public int getAtaque() {
        return ataque;
    }

    /** Método para obter o valor do ataque mágico do personagem
     * @return ataque mágico
     */
    public int getAtaqueMagico() {
        return ataqueMagico;
    }

    /** Método para obter o valor de defesa do personagem
     * @return defesa
     */
    public int getDefesa() {
        return defesa;
    }

    /** Método para obter o valor de defesa magica do personagem
     * @return defesa mágica
     */
    public int getDefesaMagica() {
        return defesaMagica;
    }

    /** Método para obter o valor da velocidade do personagem
     * @return velocidade
     */
    public int getVelocidade() {
        return velocidade;
    }

    /** Método para obter o valor de destreza do personagem
     * @return destreza
     */
    public int getDestreza() {
        return destreza;
    }

    /** Método para obter o valor da experiencia do personagem
     * @return experiencia
     */
    public int getExperiencia() {
        return experiencia;
    }

    /** Método para obter o valor do nível do personagem
     * @return nével
     */
    public int getNivel() {
        return nivel;
    }
}