package Henrique.Godoy.parser;

import Henrique.Godoy.model.Equipamentos;
import org.json.JSONObject;

//(s) nome, (s) tipo, (i) poderDeDefesa, (i) defesaNecessaria, (s)beneficio

public class EquipamentosParser {
    public static JSONObject toJson(Equipamentos equipamentos){
        JSONObject json = new JSONObject();
        json.put("nome",equipamentos.getNome());
        json.put("tipo",equipamentos.getTipo());
        json.put("poderDeDefesa",equipamentos.getPoderDeDefesa());
        json.put("defesaNecessaria",equipamentos.getDefesaNecessaria());
        json.put("beneficio",equipamentos.getBeneficio());
        return json;

    }
    public static Equipamentos fromJson(JSONObject json){
        Equipamentos equipamentos = new Equipamentos(
                json.getString("nome"),
                json.getString("tipo"),
                json.getInt("poderDeDefesa"),
                json.getInt("defesaNecessaria"),
                json.getString("beneficio")

        );
        return equipamentos;
    }
}
