public class Cursos extends RecursoEducacional {
    private int duracao;

    public Cursos(String nome, int duracao) {
        super(nome);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do curso: " + getNome());
        System.out.println("Duração: " + duracao + " horas");
    }
}
