package ExerciciosPoo.Empresa;

public class Telefonista extends Funcionario{
    public Telefonista(Integer codigo, String nome) {
        super(codigo, nome);
    }
    @Override
    public double getSalario() {
        double salarioAtual = super.getSalario();
        salarioAtual = salarioAtual + (salarioAtual * 0.10);
        return salarioAtual;
    }
}
