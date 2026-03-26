package src;

public class StudyWithJL {

    Profile p;
    HashMap<Disciplina> disciplinas;

    public StudyWithJL() {
        this.p = new Profile();
    }

    public setDisciplinas(String sigla, String disciplina, String livros, int periodoDisciplina) {
        Disciplina cadeira = new Disciplina(disciplina, livros, periodoDisciplina); 
        this.disciplinas.add(cadeira);
    }
}