package ro.ase.cts;
//extrinseca (modif de catre client)-unica
public class MasinaCuloare {

    private String culoare;


    public MasinaCuloare(String culoare) {
        this.culoare = culoare;

    }

    //metode de acces
    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
}