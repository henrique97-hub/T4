package Henrique.Godoy.parser;

import Henrique.Godoy.model.Itens;
import org.json.JSONObject;


/**
 * Classe que possibilitará leitura/escrita de dados em json
 */
public class ItensParser {
    /** toJson - recebe um item e transforma-o em arquivo json
     * @param itens
     * @return - json
     */
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

    /** Recebe um arquivo json e transforma-o em lista de item
     * @param json
     * @return itens
     */
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
