public class Aluno extends Pessoa{

    protected String matricula;

    public Aluno(String nome, Integer idade, String matricula) {
        super(nome, idade);
        this.matricula =  matricula;
    }

    @Override
    public void apresentar(){
        System.out.println("Olá, eu sou o aluno "+this.nome+" com matrícula "+this.matricula+" e tenho " + this.idade +" anos.");
    }
}