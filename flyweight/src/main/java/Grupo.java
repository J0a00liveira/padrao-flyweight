import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private List<Personagem> grupo = new ArrayList<>();

    public void join(String nome, String tipoNome, String tipoHabiliadde){
        Tipo tipo = TipoFactory.getOrigin(tipoNome, tipoHabiliadde);
        Personagem personagem = new Personagem(nome, tipo);
        grupo.add(personagem);
    }

    public List<String> getMembros(){
        List<String> output = new ArrayList<String>();
        for (Personagem personagem : this.grupo){
            output.add(personagem.toString());
        }
        return output;
    }
}
