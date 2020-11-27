package Henrique.Godoy.model;

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
    public Personagem(String nome){
        this(nome,null,null,0,0,0,0,0,0,0,0,0);

    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getProfissao() {
        return profissao;
    }

    public int getMana() {
        return mana;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getAtaqueMagico() {
        return ataqueMagico;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getDefesaMagica() {
        return defesaMagica;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getDestreza() {
        return destreza;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int getNivel() {
        return nivel;
    }
}