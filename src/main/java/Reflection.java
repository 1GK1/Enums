import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Reflection {
    public static void main(String[] args) {

        String userInput = "java.util.Date";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter class name (i.e: java.awt.event.ActionEvent): ");
        userInput = scanner.next();

        try {
            Class class1 = Class.forName(userInput);
            Class superclass = class1.getSuperclass();
            System.out.println();
            String modifiers = Modifier.toString(class1.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print("class " + userInput);
            if (superclass != null && superclass != Object.class) System.out.print(" extends "
                    + superclass.getName());

            printConstructors(class1);
            printMethods(class1);
            printFields(class1);

        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        }
        System.exit(0);
    }

    public static void printConstructors(Class class1) {
        Constructor[] constructors = class1.getDeclaredConstructors();

        System.out.println("\n\nConstructors:");

        for (Constructor constructor : constructors) {
            String name = constructor.getName();
            System.out.print(" ");
            String modifiers = Modifier.toString(constructor.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print(name + "(");

            Class[] paramTypes = constructor.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    public static void printMethods(Class class1) {
        Method[] methods = class1.getDeclaredMethods();

        System.out.println("\nMethods:");

        for (Method method : methods) {
            Class retType = method.getReturnType();
            String name = method.getName();
            System.out.print(" ");
            String modifiers = Modifier.toString(method.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print(retType.getName() + " " + name + "(");

            Class[] paramTypes = method.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    public static void printFields(Class class1) {
        Field[] fields = class1.getDeclaredFields();

        System.out.println("\nFields:");

        for (Field field : fields) {
            Class type = field.getType();
            String name = field.getName();
            System.out.print(" ");
            String modifiers = Modifier.toString(field.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.println(type.getName() + " " + name + ";");
        }
    }
}

