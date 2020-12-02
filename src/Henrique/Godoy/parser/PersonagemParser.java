package Henrique.Godoy.parser;
import org.json.JSONObject;

import Henrique.Godoy.model.Personagem;

public class PersonagemParser {
    public static JSONObject toJson(Personagem personagem){
        JSONObject json = new JSONObject();
        json.put("nome",personagem.getNome());
        json.put("raca",personagem.getRaca());
        json.put("profissao",personagem.getProfissao());
        json.put("mana",personagem.getMana());
        json.put("ataque",personagem.getAtaque());
        json.put("ataqueMagico",personagem.getAtaqueMagico());
        json.put("defesa",personagem.getDefesa());
        json.put("defesaMagica",personagem.getDefesaMagica());
        json.put("velocidade",personagem.getVelocidade());
        json.put("destreza",personagem.getDestreza());
        json.put("experiencia",personagem.getExperiencia());
        json.put("nivel",personagem.getNivel());
        return json;
    }
    public static Personagem fromJson(JSONObject json){
        Personagem personagem = new Personagem(
                json.getString("nome"),
                json.getString("raca"),
                json.getString("profissao"),
                json.getInt("mana"),
                json.getInt("ataque"),
                json.getInt("ataqueMagico"),
                json.getInt("defesa"),
                json.getInt("defesaMagica"),
                json.getInt("velocidade"),
                json.getInt("destreza"),
                json.getInt("experiencia"),
                json.getInt("nivel")

        );
        return personagem;
    }

}
