import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {
    @Test
    void mustReturnGroup(){
        Grupo grupo = new Grupo();
        grupo.join("joao", "Rei", "nenhuma");
        grupo.join("marco", "Mago", "magia");
        grupo.join("alvaro", "NetBeansMan", "codar no papel");

        List<String> output = Arrays.asList(
                "nome: joao TipoNome: Rei TipoHabilidade: nenhuma",
                "nome: marco TipoNome: Mago TipoHabilidade: magia",
                "nome: alvaro TipoNome: NetBeansMan TipoHabilidade: codar no papel"
        );
        assertEquals(output, grupo.getMembros());
    }

    @Test
    void mustReturnGroupLength(){
        Grupo grupo = new Grupo();
        grupo.join("joao", "Rei", "nenhuma");
        grupo.join("marco", "Mago", "magia");
        grupo.join("alvaro", "NetBeansMan", "codar no papel");

        assertEquals(3, TipoFactory.getTiposLength());
    }
}