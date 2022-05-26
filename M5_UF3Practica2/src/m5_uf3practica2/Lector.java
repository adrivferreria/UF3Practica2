package m5_uf3practica2;

public class Lector {

    private final int maxLlibres;

    private String[] llibresPrestec;

    public Lector() {
        this.maxLlibres = 3;
        this.llibresPrestec = new String[maxLlibres];
    }

    public String[] getLlibresPrestec() {
        return llibresPrestec;
    }

    public void setLlibresPrestec(String[] llibresPrestec) {
        this.llibresPrestec = llibresPrestec;
    }
}
