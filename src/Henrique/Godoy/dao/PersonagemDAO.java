package Henrique.Godoy.dao;

import Henrique.Godoy.model.Personagem;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * A classe PersonagemDAO possui a implementação da interdace DAO,
 * juntamente da sua implementação de métodos.
 */
public class PersonagemDAO implements DAO<Personagem> {

    private Connection connection;
    private String myDBConnectionString ="jdbc:sqlite:rpg.db";

    /**
     * Construtor que cria a conexão com o banco de dados
     */
    public PersonagemDAO(){
        try {
            connection = DriverManager.getConnection(myDBConnectionString);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    /** Método getAll
     * @return exibe todos os parametros referentes a tabela dos personagens
     */
    @Override
    public List<Personagem> getAll() {
        List<Personagem> personagems = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM rpg");
            while(result.next()){
                Personagem personagem = new Personagem(
                        result.getString("nome"),
                        result.getString("raca"),
                        result.getString("profissao"),
                        result.getInt("mana"),
                        result.getInt("ataque"),
                        result.getInt("ataqueMagico"),
                        result.getInt("defesa"),
                        result.getInt("defesaMagica"),
                        result.getInt("velocidade"),
                        result.getInt("destreza"),
                        result.getInt("experiencia"),
                        result.getInt("nivel")
                );
                personagems.add(personagem);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return personagems;
    }


    /** Método update
     * @param personagem - atualiza a tabela com nova implementação de dados de personagem,
     * para isso, é preciso informar o nome do personagem no qual as implementações serão realizadas.
     */
    @Override
    public void update(Personagem personagem) {
        try {
            PreparedStatement preparedStatement =connection.prepareStatement("UPDATE rpg SET nome =?, raca =?,profissao =?,mana=?,ataque=?,ataqueMagico=?,defesa=?,defesaMagica=?,velocidade=?,destreza=?,experiencia=?,nivel=? WHERE nome =?;");
            preparedStatement.setString(1,personagem.getNome());
            preparedStatement.setString(2,personagem.getRaca());
            preparedStatement.setString(3,personagem.getProfissao());
            preparedStatement.setInt(4,personagem.getMana());
            preparedStatement.setInt(5,personagem.getAtaque());
            preparedStatement.setInt(6,personagem.getAtaqueMagico());
            preparedStatement.setInt(7,personagem.getDefesa());
            preparedStatement.setInt(8,personagem.getDefesaMagica());
            preparedStatement.setInt(9,personagem.getVelocidade());
            preparedStatement.setInt(10,personagem.getDestreza());
            preparedStatement.setInt(11,personagem.getExperiencia());
            preparedStatement.setInt(12,personagem.getNivel());
            preparedStatement.setString(13,personagem.getNome());

            int retorno = preparedStatement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    /** Método criar
     * @param personagem permite criar um novo personagem no banco de dados
     */
    @Override
    public void create(Personagem personagem) {

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO rpg (nome,raca,profissao,mana,ataque,ataqueMagico,defesa,defesaMagica,velocidade,destreza,experiencia,nivel) VALUES(?,?,?,?,?,?,?,?,?,?,?,?);");
            preparedStatement.setString(1,personagem.getNome());
            preparedStatement.setString(2,personagem.getRaca());
            preparedStatement.setString(3,personagem.getProfissao());
            preparedStatement.setInt(4,personagem.getMana());
            preparedStatement.setInt(5,personagem.getAtaque());
            preparedStatement.setInt(6,personagem.getAtaqueMagico());
            preparedStatement.setInt(7,personagem.getDefesa());
            preparedStatement.setInt(8,personagem.getDefesaMagica());
            preparedStatement.setInt(9,personagem.getVelocidade());
            preparedStatement.setInt(10,personagem.getDestreza());
            preparedStatement.setInt(11,personagem.getExperiencia());
            preparedStatement.setInt(12,personagem.getNivel());

            int retorno = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /** Método delete
     * @param personagem - método que permite deletar algum personagem de acordo com seu nome
     */
    @Override
    public void delete(Personagem personagem) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM rpg WHERE nome =?");
            preparedStatement.setString(1,personagem.getNome());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
