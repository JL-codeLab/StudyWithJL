package src;

public class Profile {

    String nome;
    int idade;
    int periodoFaculdade;
    int horasEstudo;

    public Profile() {
        this.nome = "";
        this.idade = 0;
        this.periodoFaculdade = 1;
        this.horasEstudo = 0;
    }

    public Profile(String nome, int idade, int periodo) {
        this.nome = nome;
        this.idade = idade;
        this.periodoFaculdade = periodo;
    }

    public Profile(String nome, int idade, int periodo, int horasEstudo) {
        this.nome = nome;
        this.idade = idade;
        this.periodoFaculdade = periodo;
        this.horasEstudo = horasEstudo;
    }

    public String getNome() {
        return nome;
    }
}
