package reflect_util;

import entity.UnaryOperation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtil {
    private static Class<?> clazz = UnaryOperation.class;

    public static UnaryOperation createReflection() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<?> defConstr = clazz.getConstructor();
        return (UnaryOperation) defConstr.newInstance();
    }

    public static UnaryOperation createReflection(double value) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> [] paramType = new Class<?> []{double.class};
        Constructor<?> parConstr = clazz.getConstructor(paramType);
        return (UnaryOperation) parConstr.newInstance(value);
    }

    public static UnaryOperation dynamicInvokation(UnaryOperation base) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //Class<?> paramTypes [] = new Class<?>[]{double.class};
        Method method = clazz.getMethod("increment");
        method.invoke(base);
        return base;
    }

    public static String getObjectInfo(UnaryOperation base) throws IllegalAccessException {
        StringBuilder sb = new StringBuilder();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Class<?> fieldType = field.getType();
            sb.append("\tName: " + field.getName());
            sb.append("\tType: " + fieldType.getName());
            field.setAccessible(true);
            sb.append("\tValue: "+ field.getDouble(base));
        }
        return sb.toString();
    }
}
