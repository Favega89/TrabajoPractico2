import java.lang.reflect.Method;
import java.time.Year;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Yo on 23/3/2018.
 */
public class Auto extends Observable implements IKnowAboutCars{

    private String marca;
    private Year modelo;
    private String patente;

    private PerecentageLevel nivelDeAceite;
    private PerecentageLevel presionDeNeumaticos;
    private PerecentageLevel nivelDeAgua;

    public Auto(String marca, Year modelo, String patente, PerecentageLevel nivelDeAceite, PerecentageLevel presionDeNeumaticos, PerecentageLevel nivelDeAgua) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.nivelDeAceite = nivelDeAceite;
        this.presionDeNeumaticos = presionDeNeumaticos;
        this.nivelDeAgua = nivelDeAgua;
    }

    public void addO(Observer o){
        this.addObserver(o);
    }

    public void deleteO(Observer o){
        this.deleteObserver(o);
    }

    private New newBuilder(String old , String neu, String mensage){
        return new New(old,neu,mensage);
    }

    public void notifyer(String old,String neu,String mensage){
        setChanged();
        notifyObservers(this.newBuilder(old,neu,mensage));
    }



    public void setNivelDeAceite(PerecentageLevel nivelDeAceite) {
        //this.notifyer(this.nivelDeAceite,nivelDeAceite,"porcentaje del nivel de aceite");
        this.notifyer(this.checkearNiveles(this.nivelDeAceite,"defaultvalue").toString(),
                this.checkearNiveles(nivelDeAceite,"defaultvalue").toString()
                ,"porcentaje del nivel del aceite");

        this.nivelDeAceite = nivelDeAceite;
    }

    public void setPresionDeNeumaticos(PerecentageLevel presionDeNeumaticos) {
        //this.notifyer(this.presionDeNeumaticos,presionDeNeumaticos,"El porcentaje del nivel de la presion de neumaticos");
        this.notifyer(this.checkearNiveles(this.presionDeNeumaticos,"defaultvalue").toString(),
                this.checkearNiveles(presionDeNeumaticos,"defaultvalue").toString()
                ,"porcentaje del nivel de la presion de neumaticos");

        this.presionDeNeumaticos = presionDeNeumaticos;
    }

    public void setNivelDeAgua(PerecentageLevel nivelDeAgua) {
       // this.notifyer(this.nivelDeAgua,nivelDeAgua,"porcentaje del nivel del agua");
        this.notifyer(this.checkearNiveles(this.nivelDeAgua,"defaultvalue").toString(),
                this.checkearNiveles(nivelDeAgua,"defaultvalue").toString()
                ,"porcentaje del nivel del agua");
        this.nivelDeAgua = nivelDeAgua;
    }

    public String getPatente() {
        return patente;
    }

    public Object checkearNiveles(Object obj, String property) {
        Object returnValue = null;
        try {
            String methodName = "get" + property.substring(0, 1).toUpperCase() + property.substring(1, property.length());
            Class clazz = obj.getClass();
            Method method = clazz.getMethod(methodName, null);
            returnValue = method.invoke(obj, null);
        }
        catch (Exception e) {
            // Do nothing, we'll return the default value
        }
        return returnValue;
    }
}
