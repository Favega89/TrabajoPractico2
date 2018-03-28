import java.lang.reflect.Method;

/**
 * Created by Yo on 27/3/2018.
 */
public abstract class KnowAboutCars implements IKnowAboutCars {

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
