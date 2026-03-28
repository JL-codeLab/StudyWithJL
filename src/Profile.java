package src;

public class Profile {

    private String nome;
    private int idade;
    private int periodoFaculdade;
    private int horasEstudo;

    private String modo;
    private String aura;
    private int valorAura;

    public Profile(String nome, int idade, int periodo, int horasEstudo) {
        this.nome = nome;
        this.idade = idade;
        this.periodoFaculdade = periodo;
        this.horasEstudo = horasEstudo;

        this.modo = "Sem modo escolhido";
        aura = "";
        valorAura = 0;
    }

    public Profile(String nome, int idade, int periodo, int horasEstudo, String modo) {
        this.nome = nome;
        this.idade = idade;
        this.periodoFaculdade = periodo;
        this.horasEstudo = horasEstudo;

        this.modo = modo;
        aura = "";
        valorAura = 0;
    }

    private void calculaAura() {
        switch (modo) {
            case "Dragon Ball Z":
                aura = "ki";
                valorAura = (int) (horasEstudo * 45) + 8000;
            case "Naruto":
                aura = "chakra";
                valorAura = (int) (horasEstudo * 7) + 550;
            case "Hunter x Hunter":
                aura = "nen";
                valorAura = (int) (horasEstudo * 2);
            default:
                return;
        }
    }

    public String aura() {
        calculaAura();
        switch (aura) {
            case "ki":
                return "ki: " + valorAura;
            case "chakra":
                return "chakra: " + valorAura;
            case "nen":
                return "nen: " + valorAura;
            default:
                return modo + " aura: " + valorAura;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPeriodoFaculdade() {
        return periodoFaculdade;
    }

    public void setPeriodoFaculdade(int periodoFaculdade) {
        this.periodoFaculdade = periodoFaculdade;
    }

    public int getHorasEstudo() {
        return horasEstudo;
    }

    public void setHorasEstudo(int horasEstudo) {
        this.horasEstudo = horasEstudo;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public int getValorAura() {
        return valorAura;
    }

    public void setValorAura(int valorAura) {
        this.valorAura = valorAura;
    }

    public String perfil() {
        return "=====PERFIL=====\n\n" + nome + "\n" + idade + " anos" + "\nPeríodo da faculdade:" + periodoFaculdade
                + "\nHoras de estudo: " + horasEstudo +
                "\nAnime: " + modo + "\n" + aura();
    }

}
