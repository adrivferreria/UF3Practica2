package m5_uf3practica2;

public class Llibre {

    private String nom;

    private String tipus;

    private int editorial;

    private int any;

    private Autor autor;

    public Llibre(String nom, String tipus, int editorial, int any, Autor autor) {
        this.nom = nom;
        this.tipus = tipus;
        this.editorial = editorial;
        this.any = any;
        this.autor = autor;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public int getEditorial() {
        return editorial;
    }

    public void setEditorial(int editorial) {
        this.editorial = editorial;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
}
