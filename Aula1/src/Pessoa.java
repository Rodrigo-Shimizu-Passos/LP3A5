public class Pessoa {
    protected String nome;
    protected Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar(){
        System.out.println("Olá, eu sou "+this.nome+" e tenho " + this.idade +" anos.");
    }
}