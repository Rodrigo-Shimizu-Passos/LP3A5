package Empresa;

public class Gerente extends Funcionario{
    private String senha;

    public Gerente(String nome, Double salario, String departamento, String senha) {
        super(nome, salario, departamento);
        this.senha = senha;
    }

    @Override
    protected void mostrarInformacoes(){
        System.out.println("Nome: "+this.nome+", Salário: "+this.salario+", Departamento: "+this.departamento+", Senha: "+this.senha);
    }
}
