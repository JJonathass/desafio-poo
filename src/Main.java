import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp();

        Cursos curso1 = new Cursos("Java Fundamentals", 40);
        Cursos curso2 = new Cursos("Python Basics", 30);

        Mentorias mentor1 = new Mentorias("Design Patterns", "John");
        Mentorias mentor2 = new Mentorias("Web Development", "Jane");

        Devs dev1 = new Devs("João", 25);
        Devs dev2 = new Devs("Maria", 30);

        bootcamp.adicionarRecurso(curso1);
        bootcamp.adicionarRecurso(curso2);
        bootcamp.adicionarRecurso(mentor1);
        bootcamp.adicionarRecurso(mentor2);
        bootcamp.adicionarRecurso(dev1);
        bootcamp.adicionarRecurso(dev2);

        List<RecursoEducacional> recursos = bootcamp.getRecursos();

        for (RecursoEducacional recurso : recursos) {
            recurso.exibirDetalhes();
        }
    }
}
