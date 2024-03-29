public class Gerente extends Funcionario {
    protected String departamento;
    public void setDepartamento(){
        this.departamento = departamento;
    }
    public String getDepartamento(){
        return departamento;
    }
    public double calcularBonus(){
        return salario * 0.10;
    }
    public void exibirGerente(){
        super.exibirDados();
        System.out.println("Departamento: " + departamento);
        System.out.println("Bônus: " + calcularBonus());
    }
}
