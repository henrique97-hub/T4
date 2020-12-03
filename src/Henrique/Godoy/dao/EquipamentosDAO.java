package Henrique.Godoy.dao;

import Henrique.Godoy.model.Equipamentos;
import Henrique.Godoy.model.Itens;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe EquipamentosDAO implementa a iterface DAO e sobrescreve seus métodos
 */
public class EquipamentosDAO implements DAO<Equipamentos> {

    private Connection connection;
    private String myDBConnectionString = "jdbc:sqlite:rpg.db";

    /**
     * Construtor que possibilita a conexão com o banco de dados
     */
    public EquipamentosDAO(){
        try {
            connection = DriverManager.getConnection(myDBConnectionString);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    /** Método que retorna todos os equipamentos que pertencem à tabela
     * @return lista de equipamentos
     */
    @Override
    public List<Equipamentos> getAll() {

        List<Equipamentos> equipamentos= new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM equipamento");
            while (result.next()) {
                Equipamentos equipamentos1 = new Equipamentos(
                        result.getString("nome"),
                        result.getString("tipo"),
                        result.getInt("poderDeDefesa"),
                        result.getInt("defesaNecessaria"),
                        result.getString("beneficio")
                );
                equipamentos.add(equipamentos1);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return equipamentos;
    }


    /** Método que permite atualizar valores de atributos referentes a equipamentos, perante ao
     * nome digitado
     * @param equipamentos
     */
    @Override
    public void update(Equipamentos equipamentos) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE equipamento SET nome =?,tipo =?,poderDeDefesa =?,defesaNecessaria=?,beneficio=? WHERE nome =?;");
            preparedStatement.setString(1, equipamentos.getNome());
            preparedStatement.setString(2, equipamentos.getTipo());
            preparedStatement.setInt(3, equipamentos.getPoderDeDefesa());
            preparedStatement.setInt(4, equipamentos.getDefesaNecessaria());
            preparedStatement.setString(5, equipamentos.getBeneficio());
            preparedStatement.setString(6, equipamentos.getNome());
            int retorno = preparedStatement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    /** Método create, permite cirar novos equipamentos para serem adicionados à tabela
     * @param equipamentos
     */
    @Override
    public void create(Equipamentos equipamentos) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO equipamento (nome,tipo,poderDeDefesa,defesaNecessaria,beneficio) VALUES(?,?,?,?,?);");
            preparedStatement.setString(1, equipamentos.getNome());
            preparedStatement.setString(2, equipamentos.getTipo());
            preparedStatement.setInt(3, equipamentos.getPoderDeDefesa());
            preparedStatement.setInt(4, equipamentos.getDefesaNecessaria());
            preparedStatement.setString(5, equipamentos.getBeneficio());

            int retorno = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    /** Método que permite deletar equipamentos da tabela
     * @param equipamentos
     */
    @Override
    public void delete(Equipamentos equipamentos) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM equipamento WHERE nome =?");
            preparedStatement.setString(1,equipamentos.getNome());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    }




