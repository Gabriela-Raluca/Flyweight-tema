package ro.ase.cts;

import java.util.HashMap;
import java.util.Map;

//instantiaza clasa intrinseca(reutiliz) MasinaFlyweight
public class FactoryMasina {

    private static Map<String,MasinaFlyweight> mapMasina= new HashMap<>();

    public static MasinaFlyweight getMasinaFlyweight(String producator,float dimensiune,String forma){
        if (mapMasina.get(producator)!=null){
            return mapMasina.get(producator);
        }
        else{
           // MasinaFlyweight masFlyweight= new MasinaFlyweight(producator,33,"alungita");
//            mapMasina.put(producator,masFlyweight);
//            return masFlyweight;
            mapMasina.put(producator,new MasinaFlyweight(producator, dimensiune,forma));
            return  mapMasina.get(producator);
        }
    }




}
