package src;

import java.util.Arrays;

public class Dia {

    private String dia;
    private Disciplina[] disciplinas;

    public Dia(String dia, int quantDisciplinas) {
        this.dia = dia;
        disciplinas = new Disciplina[quantDisciplinas];
    }

    public void setDisciplina(int index, Disciplina disc) {
        if (index < 0 || index >= disciplinas.length) {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }
        disciplinas[index] = disc;
    }

    @Override
    public String toString() {
        return "Dia" + dia + ";\nDisciplinas:" + Arrays.toString(disciplinas) + ", toString()=" + super.toString()
                + "]";
    }

}
