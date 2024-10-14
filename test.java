public class test {

    static {
        System.out.println("Hi from static block");
    }
    public static void main() {
        int v = 1;
        System.out.println("hi" + (v = v + 1));
        System.out.println(v);

    }
}
