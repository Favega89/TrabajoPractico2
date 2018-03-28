import java.util.EventObject;

/**
 * Created by Yo on 23/3/2018.
 */
public class PerecentageLevel {

    private final int min;

    private final int max;

    private int defaultValue;

    public PerecentageLevel(int value, int max) throws Exception {
        this.min = -1;
        this.max = max;
        this.defaultValue = this.setValueDefault(value);
    }


    public void setValue(int value) throws Exception{
        if(this.percentajeSizeChecker(min,value,max))
            this.defaultValue = value;
        else
            throw new Exception("El valor de procentaje debe ser menor a " + this.max  + " y mayor a -1");
    }

    private int setValueDefault(int value) throws Exception{
        if(this.percentajeSizeChecker(min,value,max))
            return value;
        else
            throw new Exception("El valor de procentaje debe ser menor a " + this.max  + " y mayor a -1");
    }



    public boolean percentajeSizeChecker(int a, int b, int c) {
        return a<=b && b<=c;
    }

    public void setDefaultValue(int defaultValue) {
        this.defaultValue = defaultValue;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getDefaultvalue(){
        return defaultValue;
    }

}
