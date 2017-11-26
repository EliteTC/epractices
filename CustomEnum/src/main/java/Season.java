import java.util.ArrayList;

public class Season extends CustomEnum<Season> {

    public final static Season WINTER = new Season("WINTER",0);
    public final static Season SPRING= new Season("SPRING",1);
    public final static Season SUMMER = new Season("SUMMER",2);
    public final static Season FALL = new Season("FALL",3);

    private final static Season[] values = new Season []{WINTER,SPRING,SUMMER,FALL};
    private Season(String name,int ordinal) {
        super(name,ordinal);
    }

   public static Season[] values(){
        return values;
   }

   public static Season valueOf(String name) {
        for (Season e : values) {
            if (e.name().equals(name)) return e;
        }
        return null;
    }

}
