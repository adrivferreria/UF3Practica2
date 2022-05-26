package m5_uf3practica2;

public class Copia extends Llibre {

    private int identificador;

    private String estat;

    public Copia(int identificador, String estat, String nom, String tipus, int editorial, int any, Autor autor) {
        super(nom, tipus, editorial, any, autor);
        this.identificador = identificador;
        this.estat = estat;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getEstat() {
        return estat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }
}
