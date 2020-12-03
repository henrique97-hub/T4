package Henrique.Godoy.parser;

import Henrique.Godoy.model.Itens;
import org.json.JSONObject;

// (s)nome,(s)tipo,(i)poderDeAtaque, (i)velocidadeArma, (i)ataqueNecessario, (d)critico e (s)beneficio

public class ItensParser {
    public static JSONObject toJson(Itens itens){
        JSONObject json = new JSONObject();
        json.put("nome",itens.getNome());
        json.put("tipo",itens.getTipo());
        json.put("poderDeAtaque",itens.getPoderDeAtaque());
        json.put("velocidadedeArma",itens.getVelocidadeArma());
        json.put("ataqueNecessario",itens.getAtaqueNecessario());
        json.put("critico",itens.getCritico());
        json.put("beneficio",itens.getBeneficio());
        return json;

    }
    public static Itens fromJson(JSONObject json){
        Itens itens = new Itens(
                json.getString("nome"),
                json.getString("tipo"),
                json.getInt("poderDeAtaque"),
                json.getInt("velocidadedeArma"),
                json.getInt("ataqueNecessario"),
                json.getDouble("critico"),
                json.getString("beneficio")
        );
        return itens;
    }
}
