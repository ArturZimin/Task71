package by.minsk.itakademy.arturzimin;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    private static java.lang.Object Object;

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {


        Print print=new Print();
        Class myClass = print.getClass();
        Method[] method=myClass.getMethods();
     Method method1=myClass.getDeclaredMethod("printHelloWorld",null);
             method1.invoke(Object ,null);


    }
}
