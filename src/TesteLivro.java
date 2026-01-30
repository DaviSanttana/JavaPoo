public class TesteLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("Bleach");
        livro.setDescricaoLivro("Livro sobre shinigamis");
        livro.setIsbn("34343-9897");
        livro.setCapaDura(true);

        System.out.println(livro);
    }
}
