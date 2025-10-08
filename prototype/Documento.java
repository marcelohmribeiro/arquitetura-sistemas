public class Documento implements Cloneable{
    private String titulo;
    private String texto;

    public Documento(String titulo, String texto) {
        this.titulo = titulo;
        this.texto = texto;
    }

    @Override
    public Documento clone() {
        try {
            return (Documento) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Documento [titulo=" + titulo + ", texto=" + texto + "]";
    }
}
