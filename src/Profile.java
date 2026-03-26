package src;

public class Profile {

    String nome;
    int idade;
    int periodoFaculdade;

    public Profile() {
        this.nome = "";
        this.idade = 0;
        this.periodoFaculdade = 1;
    }

    public Profile(String nome, int idade, int periodo) {
        this.nome = nome;
        this.idade = idade;
        this.periodoFaculdade = periodo;
    }

    public String getNome() {
        return nome;
    }
}
