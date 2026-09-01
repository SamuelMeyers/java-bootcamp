public class practice3 {

    public static void main(String[] args) {

        int i = 100;
        long l = i;
        float f = l;
        double d = f;

        System.out.println("Widening:");
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);


        double d2 = 123.456;
        int i2 = (int) d2;

        long l2 = 1000L;
        short s = (short) l2;

        System.out.println("Narrowing:");
        System.out.println(d2);
        System.out.println(i2);
        System.out.println(l2);
        System.out.println(s);



        double d3 = 9.78;
        int n = (int) d3;

        System.out.println("Decimal Data Loss:");
        System.out.println(d3);
        System.out.println(n);



        char c = 65;

        System.out.println("Char:");
        System.out.println(c);



        int x = 1000;
        byte b = (byte) x;

        System.out.println("Byte Data Loss:");
        System.out.println(x);
        System.out.println(b);
    }
}