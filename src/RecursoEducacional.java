public abstract class RecursoEducacional {
    private String nome;

    public RecursoEducacional(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos comuns a serem implementados nas classes derivadas
    public abstract void exibirDetalhes();
}