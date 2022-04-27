package ro.ase.cts;

public class Main {
    public static void main(String[] args) {
        FactoryMasina masinaFactory= new FactoryMasina();

        DisplayMasinaCuloare masinaGalbena= masinaFactory.getMasinaFlyweight("Renault",400,"alungita");
        masinaGalbena.displayMasina("galbena");

        DisplayMasinaCuloare masinaVerde=masinaFactory.getMasinaFlyweight("Renault",500,"ascutita");
        masinaVerde.displayMasina("verde");

        DisplayMasinaCuloare masinaRosie=masinaFactory.getMasinaFlyweight("BMW",600,"ovala");
        masinaVerde.displayMasina("rosie");

    }
}
