package Henrique.Godoy.parser;

import Henrique.Godoy.model.Equipamentos;
import org.json.JSONObject;


/**
 * Classe que faz a leitura e a escrita de arquivos json
 */
public class EquipamentosParser {
    /** Recebe um equipamento e transforma-o em arquivo json
     * @param equipamentos
     * @return json
     */
    public static JSONObject toJson(Equipamentos equipamentos){
        JSONObject json = new JSONObject();
        json.put("nome",equipamentos.getNome());
        json.put("tipo",equipamentos.getTipo());
        json.put("poderDeDefesa",equipamentos.getPoderDeDefesa());
        json.put("defesaNecessaria",equipamentos.getDefesaNecessaria());
        json.put("beneficio",equipamentos.getBeneficio());
        return json;

    }

    /** Recebe um arquivo json e tranforma-o em equipamento
     * @param json
     * @return equipamentos
     */
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
