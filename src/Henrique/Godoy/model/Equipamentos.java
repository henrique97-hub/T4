package Henrique.Godoy.model;

public class Equipamentos {
    private String nome;
    private String tipo;
    private int poderDeDefesa;
    private int defesaNecessaria;
    private String beneficio;

    public Equipamentos(String nome, String tipo, int poderDeDefesa, int defesaNecessaria, String beneficio) {
        this.nome = nome;
        this.tipo = tipo;
        this.poderDeDefesa = poderDeDefesa;
        this.defesaNecessaria = defesaNecessaria;
        this.beneficio = beneficio;
    }
    public Equipamentos(String nome){
        this(nome,null,0,0,null);
    }

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

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPoderDeDefesa() {
        return poderDeDefesa;
    }

    public int getDefesaNecessaria() {
        return defesaNecessaria;
    }

    public String getBeneficio() {
        return beneficio;
    }
}
