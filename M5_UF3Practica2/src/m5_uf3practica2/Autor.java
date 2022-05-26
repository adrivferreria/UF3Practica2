package m5_uf3practica2;

import java.time.LocalDate;

public class Autor {

    private String nom;

    private String nacionalitat;

    private LocalDate naixement;

    public Autor(String nom, String nacionalitat, LocalDate naixement) {
        this.nom = nom;
        this.nacionalitat = nacionalitat;
        this.naixement = naixement;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNacionalitat() {
        return nacionalitat;
    }

    public void setNacionalitat(String nacionalitat) {
        this.nacionalitat = nacionalitat;
    }

    public LocalDate getNaixement() {
        return naixement;
    }

    public void setNaixement(LocalDate naixement) {
        this.naixement = naixement;
    }
}
