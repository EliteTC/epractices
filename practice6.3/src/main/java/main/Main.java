package main;

import entity.UnaryOperation;
import reflect_util.ReflectionUtil;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String [] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        UnaryOperation reflectionObject = ReflectionUtil.createReflection();
        System.out.println(reflectionObject.toString());
        ReflectionUtil.dynamicInvokation(reflectionObject);
        System.out.println(reflectionObject.toString());
        System.out.println(ReflectionUtil.getObjectInfo(reflectionObject));

        UnaryOperation reflectionObjectWithParameters = ReflectionUtil.createReflection(3.4);
        System.out.println(reflectionObjectWithParameters.toString());
        ReflectionUtil.dynamicInvokation(reflectionObjectWithParameters);
        System.out.println(reflectionObjectWithParameters.toString());
        System.out.println(ReflectionUtil.getObjectInfo(reflectionObjectWithParameters));

    }
}
