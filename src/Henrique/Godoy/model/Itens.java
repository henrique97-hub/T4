package Henrique.Godoy.model;

public class Itens {
    private String nome;
    private String tipo;
    private int poderDeAtaque;
    private int velocidadeArma;
    private int ataqueNecessario;
    private double critico;
    private String beneficio;

    public Itens(String nome, String tipo, int poderDeAtaque, int velocidadeArma, int ataqueNecessario, double critico, String beneficio) {
        this.nome = nome;
        this.tipo = tipo;
        this.poderDeAtaque = poderDeAtaque;
        this.velocidadeArma = velocidadeArma;
        this.ataqueNecessario = ataqueNecessario;
        this.critico = critico;
        this.beneficio = beneficio;
    }
    public Itens(String nome){
        this(nome,null,0,0,0,0.0,null);

    }

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

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPoderDeAtaque() {
        return poderDeAtaque;
    }

    public int getVelocidadeArma() {
        return velocidadeArma;
    }

    public int getAtaqueNecessario() {
        return ataqueNecessario;
    }

    public double getCritico() {
        return critico;
    }

    public String getBeneficio() {
        return beneficio;
    }
}
