package src;

import java.util.Arrays;

public class Dia {

    String dia;
    Disciplina[] disciplinas;

    public Dia(String dia, Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Dia" + dia + ";\nDisciplinas:" + Arrays.toString(disciplinas) + ", toString()=" + super.toString()
                + "]";
    }

}
