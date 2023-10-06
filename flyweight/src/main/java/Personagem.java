public class Personagem {
    private String nome;
    private Tipo tipo;

    public Personagem(String nome, Tipo tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    public String toString(){
        return "nome: " + nome +
                " TipoNome: " + tipo.getNome() +
                " TipoHabilidade: " + tipo.getHabilidade();

    }
}
