package ro.ase.cts;
//intrinseca (valori reutilizate)--instantiate prin clasa Fctory
   public class MasinaFlyweight implements DisplayMasinaCuloare {

       private String producator;
       private float dimensiune;
       private String forma;

    public MasinaFlyweight(String producator, float dimensiune, String forma) {
        this.producator=producator;
        this.dimensiune=dimensiune;
        this.forma=forma;
    }


    @Override
    public void displayMasina(String culoare) {
        System.out.println("Masina detalii{" +
                "producator='" + producator + '\'' +
                ", dimensiune=" + dimensiune +
                ", forma='" + forma + '\'' +
                "culoare=="+culoare+
                '}');
    }


}
