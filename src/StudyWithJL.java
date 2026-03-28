package src;

import java.util.ArrayList;

public class StudyWithJL {

    Profile me;
    ArrayList<Disciplina> disciplinas;

    public StudyWithJL() {
        disciplinas = new ArrayList<Disciplina>();
    }

    public void cadastraPerfil(String nome, int idade, int periodoFaculdade, int horasEstudo) {
        me = new Profile(nome, idade, periodoFaculdade, horasEstudo);
    }

    public void setDisciplinas(String sigla, String disciplina, String livros, int periodoDisciplina) {
        Disciplina cadeira = new Disciplina(disciplina);
        this.disciplinas.add(cadeira);
    }
}