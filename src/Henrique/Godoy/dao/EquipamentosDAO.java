package Henrique.Godoy.dao;

import Henrique.Godoy.model.Equipamentos;
import Henrique.Godoy.model.Itens;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EquipamentosDAO implements DAO<Equipamentos> {

    private Connection connection;
    private String myDBConnectionString = "jdbc:sqlite:rpg.db";

    public EquipamentosDAO(){
        try {
            connection = DriverManager.getConnection(myDBConnectionString);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


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


    @Override
    public void update(Equipamentos equipamentos) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE equipamento SET nome =?,tipo =?,poderDeDefesa =?,defesaNecessaria=?,beneficio=? WHERE nome =?;");
            preparedStatement.setString(1, equipamentos.getNome());
            preparedStatement.setString(2, equipamentos.getTipo());
            preparedStatement.setInt(3, equipamentos.getPoderDeDefesa());
            preparedStatement.setInt(4, equipamentos.getDefesaNecessaria());
            preparedStatement.setString(5, equipamentos.getNome());
            int retorno = preparedStatement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

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




