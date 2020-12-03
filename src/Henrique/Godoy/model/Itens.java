package Henrique.Godoy.model;

/**
 * Classe Itens possui os itens que o persongagem possui, nela
 * é possivel verificar todos os atributos que existe em cada item
 */
public class Itens {
    private String nome;
    private String tipo;
    private int poderDeAtaque;
    private int velocidadeArma;
    private int ataqueNecessario;
    private double critico;
    private String beneficio;

    /** Contrutor da classe
     * @param nome - nome do item
     * @param tipo - tipo do item
     * @param poderDeAtaque - poder de ataque do item
     * @param velocidadeArma - velocidade de ataque do item que o personagem possuirá
     * @param ataqueNecessario - ataque necessario para utilizar o item
     * @param critico - ataque crítico que o personagem poderá atingir utilizando o item
     * @param beneficio - beneficio que o item trará ao jogador que estiver utilizando-o
     */
    public Itens(String nome, String tipo, int poderDeAtaque, int velocidadeArma, int ataqueNecessario, double critico, String beneficio) {
        this.nome = nome;
        this.tipo = tipo;
        this.poderDeAtaque = poderDeAtaque;
        this.velocidadeArma = velocidadeArma;
        this.ataqueNecessario = ataqueNecessario;
        this.critico = critico;
        this.beneficio = beneficio;
    }

    /**
     * Meio utilizado para deletar itens, em ItensDAO
     * recebe apenas uma String do nome e retorna um construtor apenas com o nome que foi inserido
     * @param nome
     */
    public Itens(String nome){
        this(nome,null,0,0,0,0.0,null);

    }

    /**
     * @return exibe os valores dos atributos no formato da função
     */
    @Override
    public String toString() {
        return "Itens{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", poderDeAtaque=" + poderDeAtaque +
                ", velocidadeArma=" + velocidadeArma +
                ", ataqueNecessario=" + ataqueNecessario +
                ", critico=" + critico +
                ", beneficio='" + beneficio + '\'' +
                '}';
    }

    /** Método para obter o nome do item
     * @return item
     */
    public String getNome() {
        return nome;
    }

    /** Método para obter o tipo do item
     * @return item
     */
    public String getTipo() {
        return tipo;
    }

    /** Método para obter o poder de atque do item
     * @return poder de ataque
     */
    public int getPoderDeAtaque() {
        return poderDeAtaque;
    }

    /** Método para obter a velocidade da arma que será utilizada
     * @return velocidade da arma
     */
    public int getVelocidadeArma() {
        return velocidadeArma;
    }

    /** Método para obter o ataque necessário para utilizar o item
     * @return ataque necessario
     */
    public int getAtaqueNecessario() {
        return ataqueNecessario;
    }

    /** Método utilizado para obter o valor maximo de dano que o personagem
     * conseguirá executar, utilizando um determinado item
     * @return critico
     */
    public double getCritico() {
        return critico;
    }

    /** Método utilizado para visualizar o tipo de beneficio que trará para o personagem, ao
     * utilizar o item
     * @return beneficio
     */
    public String getBeneficio() {
        return beneficio;
    }
}
