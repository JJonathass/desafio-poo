public class Devs extends RecursoEducacional {
    private int idade; // Novo atributo

    public Devs(String nome, int idade) {
        super(nome);
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do dev: " + getNome());
        System.out.println("Idade: " + idade);
    }
}
