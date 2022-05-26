package m5_uf3practica2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Copia> copiaLlibres;

    public Biblioteca(List<Copia> copiaLlibres) {
        this.copiaLlibres = new ArrayList();
    }

    public List<Copia> getCopiaLlibres() {
        return copiaLlibres;
    }

    public void setCopiaLlibres(List<Copia> copiaLlibres) {
        this.copiaLlibres = copiaLlibres;
    }
}
