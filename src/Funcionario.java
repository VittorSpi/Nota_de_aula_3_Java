public class Funcionario{
    protected String nome;
    protected double salario;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public String getNome(){
        return nome;
    }
    public double getSalario(){
        return salario;
    }
    public void exibirDados(){
        System.out.println("Dados:");
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + getSalario());
    }
}