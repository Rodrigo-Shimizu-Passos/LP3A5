package Empresa;

public class Funcionario {
    protected String nome;
    protected Double salario;
    protected String departamento;

    protected void mostrarInformacoes(){
        System.out.println("Nome: "+this.nome+", Salário: "+this.salario+", Departamento: "+this.departamento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Funcionario(String nome, Double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }
}
