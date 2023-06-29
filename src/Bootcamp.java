import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private List<RecursoEducacional> recursos;

    public Bootcamp() {
        recursos = new ArrayList<>();
    }

    public void adicionarRecurso(RecursoEducacional recurso) {
        recursos.add(recurso);
    }

    public List<RecursoEducacional> getRecursos() {
        return recursos;
    }
}
