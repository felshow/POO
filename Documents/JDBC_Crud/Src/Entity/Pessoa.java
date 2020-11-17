public class Pessoa {

    private int cpf;
    private int rg;
    private int idade;
    private String nome;

    public Pessoa() {
    }

    public Pessoa(int cpf, int rg, int idade, String nome) {
        this.cpf = cpf;
        this.rg = rg;
        this.idade = idade;
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "cpf=" + cpf + ", rg=" + rg + ", idade=" + idade + ", nome=" + nome + '}';
    }

}