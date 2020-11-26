package Henrique.Godoy.dao;

import Henrique.Godoy.model.Personagem;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonagemDAO implements DAO<Personagem> {

    private Connection connection;
    private String myDBConnection = "jbdc:sqlite:JogoRPG.db";

    // Contrutor que faz a concexão
    public PersonagemDAO() {
        try {
            connection = DriverManager.getConnection(myDBConnection);
        } catch (SQLException e){
            e.printStackTrace();

        }
    }

    @Override
    public List<Personagem> getAll() {
        List<Personagem> personagens = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM personagem");
            while(resultSet.next()){
                Personagem personagem = new Personagem(
                        resultSet.getString("nome"),
                        resultSet.getString("raca"),
                        resultSet.getString("profissao"),
                        resultSet.getInt("mana"),
                        resultSet.getInt("ataque"),
                        resultSet.getInt("ataqueMagico"),
                        resultSet.getInt("defesa"),
                        resultSet.getInt("defesaMagica"),
                        resultSet.getInt("velocidade"),
                        resultSet.getInt("destreza"),
                        resultSet.getDouble("experiencia"),
                        resultSet.getInt("nivel")

                );
                personagens.add(personagem);
            }
            resultSet.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return personagens;

    }

    @Override
    public void update(Personagem personagem) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE personagem SET nome=?,raca=?,profissao=?,mana=?,ataque=?,ataqueMagico=?,defesa=?,defesaMagica=?,velocidade = ?,destreza = ?,experiencia =?, nivel = ?;");
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
            preparedStatement.setDouble(11,personagem.getExperiencia());
            preparedStatement.setInt(12,personagem.getNivel());

            int retorno = preparedStatement.executeUpdate();}

        catch (Exception e){
            e.printStackTrace();
        }


    }

    @Override
    public void create(Personagem personagem) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO personagem (nome,raca,profissao,mana,ataque,ataqueMagico,defesa,defesaMagica,velocidade,destreza,experiencia,nivel) VALUES(?,?,?,?,?,?,?,?,?,?,?,?);");
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
            preparedStatement.setDouble(11,personagem.getExperiencia());
            preparedStatement.setInt(12,personagem.getNivel());

            int retorno = preparedStatement.executeUpdate();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    // deleta pelo nome, em vez de usar id
    @Override
    public void delete(Personagem personagem) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM personagem WHERE nome = ?");
            preparedStatement.setString(1,personagem.getNome());
            preparedStatement.executeUpdate();

        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
