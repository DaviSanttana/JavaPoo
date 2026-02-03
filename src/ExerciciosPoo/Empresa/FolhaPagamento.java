package ExerciciosPoo.Empresa;

public class FolhaPagamento {
    public static void main(String[] args) {
        Gerente gerente = new Gerente(001, "Davi Gabriel");
        System.out.println(gerente.imprimirFolhaPagamento());

        Vendedor vendedor = new Vendedor(002, "Fernanda Freittas");
        System.out.println(vendedor.imprimirFolhaPagamento());

        Telefonista telefonista = new Telefonista(003, "Caiquqe Oliveira");
        System.out.println(telefonista.imprimirFolhaPagamento());
    }
}
