public class Mentorias extends RecursoEducacional {
    private String mentor; // Novo atributo

    public Mentorias(String nome, String mentor) {
        super(nome);
        this.mentor = mentor;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes da mentoria: " + getNome());
        System.out.println("Mentor: " + mentor);
    }
}
