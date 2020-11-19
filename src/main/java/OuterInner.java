class Outer {
    int a = 150;
    String b = "I am from Outer Class";

    class Inner {
        int c = 10;
        String d = "I am from private Inner Class";
    }
}

public class OuterInner {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        System.out.println(outer.b + "\n" + inner.d);
        System.out.printf("Result of adding ints from Outer and Inner: %d", outer.a + inner.c);
    }
}
