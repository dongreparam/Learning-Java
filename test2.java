public class test2 {
    static {
        System.out.println("hi from test2 class static block");
    }
    public static void main(String[] args) {
        System.out.println("hi from test  2 class");
        test t1, t2;
        t1 = new test();
        test.main();
        t2 = new test();
        test.main();

    }
}