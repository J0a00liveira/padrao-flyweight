import java.util.HashMap;
import java.util.Map;

public class TipoFactory {
    private static final Map<String, Tipo> tipos = new HashMap<>();

    public static Tipo getOrigin(String nome, String habilidade){
        Tipo tipo = tipos.get(nome);
        if (tipo == null){
            tipo = new Tipo(nome, habilidade);
            tipos.put(nome, tipo);
        }
        return tipo;
    }

    public static int getTiposLength(){
        return tipos.size();
    }
}
