import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Yo on 23/3/2018.
 */
public class Mecanico extends KnowAboutCars implements Observer{

    private String name;

    public Mecanico(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {

        String oldValue = super.checkearNiveles(arg,"old").toString();
        String newValue = super.checkearNiveles(arg,"neu").toString();
        String tipo = super.checkearNiveles(arg,"type").toString();
        String patente = super.checkearNiveles(o,"patente").toString();
        Print.msg("");
        Print.msg("*********************************************************************************************");
        Print.msg("El mecanico " + this.name + " ha observado una falla en el " + tipo + " del auto patente: "
                + patente + ".");
        Print.msg("El mecanico " + this.name + " modifico los valores del " + tipo + " de "
                + oldValue + " a " + newValue + ".");
        Print.msg("*********************************************************************************************");
        Print.msg("");
    }
}
