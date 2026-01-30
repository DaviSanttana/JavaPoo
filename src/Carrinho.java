public class Carrinho {
    private String cor;
    private String tamanho;
    private int numerosRodas;

    public Carrinho(String cor, String tamanho, int numerosRodas) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.numerosRodas = numerosRodas;
    }
    public  void exibirDados(){
        System.out.println("Cor do carrinho"+ cor);
        System.out.println("Tamanho do carrinho"+tamanho);
        System.out.println("Numero de rodas do carrinho"+numerosRodas);
    }

    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho("Azul", "Medio", 4);
        carrinho.exibirDados();

        Carrinho carrinhoDuasRodas = new Carrinho("Vermelho", "Pequeno", 2);
        carrinho.exibirDados();
    }
}
