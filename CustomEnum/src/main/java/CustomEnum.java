import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class CustomEnum<E extends CustomEnum<E>> implements Comparable<E>, Serializable {

    private final String name;

    private final int ordinal;


    protected CustomEnum(String name,int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }


    public final String name() {
        return name;
    }

    public final int ordinal() {
        return ordinal;
    }

    public final boolean equals(Object other) {
        return this==other;
    }

    public final int hashCode() {
        return super.hashCode();
    }


    protected final Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }


    public final int compareTo(E o) {
        CustomEnum other = (CustomEnum)o;
        CustomEnum self = this;
        if (self.getClass() != other.getClass() && // optimization
                self.getDeclaringClass() != other.getDeclaringClass())
            throw new ClassCastException();
        return self.ordinal - other.ordinal;
    }

    public final Class<E> getDeclaringClass() {
        Class clazz = getClass();
        Class zuper = clazz.getSuperclass();
        return (zuper == CustomEnum.class) ? clazz : zuper;
    }

    private void readObject(ObjectInputStream in) throws IOException,
            ClassNotFoundException {
        throw new InvalidObjectException("can't deserialize enum");
    }

    private void readObjectNoData() throws ObjectStreamException {
        throw new InvalidObjectException("can't deserialize enum");
    }

    protected final void finalize() { }

    @Override
    public String toString() {
        return name;
    }
}