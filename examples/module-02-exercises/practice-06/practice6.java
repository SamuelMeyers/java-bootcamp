public class practice6 {

    public static void main(String[] args) {


        // 1. ASSIGNMENT OPERATORS


        int a = 10;

        System.out.println("Starting a: " + a);

        a += 5;
        System.out.println("After a += 5: " + a);

        a *= 2;
        System.out.println("After a *= 2: " + a);

        a -= 8;
        System.out.println("After a -= 8: " + a);

        a /= 2;
        System.out.println("After a /= 2: " + a);

        a %= 5;
        System.out.println("After a %= 5: " + a);



        // 2. PREFIX INCREMENT


        int x = 5;
        int y = ++x;

        System.out.println("Prefix Increment:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);



        // 3. POSTFIX INCREMENT


        int c = 5;
        int d = c++;

        System.out.println("Postfix Increment:");
        System.out.println("c = " + c);
        System.out.println("d = " + d);



        // 4. PREFIX DECREMENT


        int e = 5;
        int f = --e;

        System.out.println("Prefix Decrement:");
        System.out.println("e = " + e);
        System.out.println("f = " + f);


        // 5. POSTFIX DECREMENT

        int g = 5;
        int h = g--;

        System.out.println("Postfix Decrement:");
        System.out.println("g = " + g);
        System.out.println("h = " + h);
    }
}