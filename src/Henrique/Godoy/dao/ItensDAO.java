package Henrique.Godoy.dao;

import Henrique.Godoy.model.Itens;
import Henrique.Godoy.model.Personagem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItensDAO implements DAO<Itens> {

    private Connection connection;
    private String myDBConnectionString = "jdbc:sqlite:rpg.db";

    public ItensDAO() {
        try {
            connection = DriverManager.getConnection(myDBConnectionString);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Itens> getAll() {

        List<Itens> itens = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM itens");
            while (result.next()) {
                Itens itens1 = new Itens(
                        result.getString("nome"),
                        result.getString("tipo"),
                        result.getInt("poderDeAtaque"),
                        result.getInt("velocidadeDaArma"),
                        result.getInt("ataqueNecessario"),
                        result.getDouble("critico"),
                        result.getString("beneficio")
                );
                itens.add(itens1);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return itens;
    }


    @Override
    public void update(Itens itens) {

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE itens SET nome =?,tipo =?,poderDeAtaque =?,velocidadeDaArma=?,ataqueNecessario=?,critico=?,beneficio=? WHERE nome =?;");
            preparedStatement.setString(1, itens.getNome());
            preparedStatement.setString(2, itens.getTipo());
            preparedStatement.setInt(3, itens.getPoderDeAtaque());
            preparedStatement.setInt(5, itens.getVelocidadeArma());
            preparedStatement.setInt(6, itens.getAtaqueNecessario());
            preparedStatement.setDouble(7, itens.getCritico());
            preparedStatement.setString(8, itens.getBeneficio());
            preparedStatement.setString(9, itens.getNome());
            int retorno = preparedStatement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void create(Itens itens) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO itens (nome,tipo,poderDeAtaque,velocidadeDaArma,ataqueNecessario,critico,beneficio) VALUES(?,?,?,?,?,?,?);");
            preparedStatement.setString(1, itens.getNome());
            preparedStatement.setString(2, itens.getTipo());
            preparedStatement.setInt(3, itens.getPoderDeAtaque());
            preparedStatement.setInt(5, itens.getVelocidadeArma());
            preparedStatement.setInt(6, itens.getAtaqueNecessario());
            preparedStatement.setDouble(7, itens.getCritico());
            preparedStatement.setString(8, itens.getBeneficio());
            preparedStatement.setString(9, itens.getNome());
            int retorno = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    @Override
    public void delete(Itens itens) {

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM itens WHERE nome =?");
            preparedStatement.setString(1,itens.getNome());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}