import javafx.util.converter.PercentageStringConverter;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.time.Year;

/**
 * Created by Yo on 23/3/2018.
 */
public class Main {

    public static void main(String[] args) throws Exception {
       PerecentageLevel p = new PerecentageLevel(20,100);
       Auto auto = new Auto("Fiat",Year.now(),"HGG 444",new PerecentageLevel(10,100), new PerecentageLevel(20,100),new PerecentageLevel(50,100));
       Auto auto2 = new Auto("Renault",Year.now(),"HGG 443",new PerecentageLevel(30,100), new PerecentageLevel(50,100),new PerecentageLevel(70,100));
       Mecanico m = new Mecanico("Ecgberto");
       auto.addObserver(m);
       auto2.addObserver(m);
       //AUTO 1
       p.setValue(40);
       auto.setNivelDeAceite(p);
       p.setValue(45);
       auto.setNivelDeAgua(p);
       p.setValue(90);
       auto.setPresionDeNeumaticos(p);
       //AUTO 2
       auto2.setNivelDeAceite(p);
       p.setValue(5);
       auto2.setNivelDeAgua(p);
       p.setValue(9);
       auto2.setPresionDeNeumaticos(p);
       p.setValue(1);
    }
}
