
/**
 * Created by Yo on 23/3/2018.
 */
public class New extends KnowAboutCars{

    private String old;
    private String neu;
    private String type;


    public New(String old, String neu, String type) {
        this.old = old;
        this.neu = neu;
        this.type = type;
     //   System.out.println(old.getClass().getDeclaredFields());
    }

    public String getOld() {
        return old;
    }

    public String getNeu() {
        return neu;
    }

    public String getType() {
        return type;
    }

}
