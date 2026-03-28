package src;

import java.util.ArrayList;

public class Disciplina {

    String nome;
    ArrayList<String> livros;

    public Disciplina(String nomeDisciplina) {
        nome = nomeDisciplina;
        livros = new ArrayList<>();
    }

    public void addLivro(String nomeLivro) {
        livros.add(nomeLivro);
    }

    public String getLivros() {
        return livros.toString();
    }

}
