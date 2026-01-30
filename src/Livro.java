public class Livro {
    private String titulo;
    private String descricaoLivro;
    private String isbn;
    private boolean capaDura;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getDescricaoLivro() {
        return descricaoLivro;
    }

    public void setDescricaoLivro(String descricaoLivro) {
        this.descricaoLivro = descricaoLivro;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isCapaDura() {
        return capaDura;
    }

    public void setCapaDura(boolean capaDura) {
        this.capaDura = capaDura;
    }

    @Override
    public String toString() {
        return "Livro: "+ titulo + '\'' +
                ", descricaoLivro='" + descricaoLivro + '\'' +
                ", isbn='" + isbn + '\'' +
                ", capaDura=" + capaDura +
                '}';
    }
}
