class Laptop {
    public void code(){
        System.out.println("Code,Compile,Run");
    }
}

class Developer{
    public void devApp(Laptop lap){
        lap.code();
    }
}

public class company {
    public static void main(String[] args) {
        Laptop lap = new Laptop();
        Developer param = new Developer();
        param.devApp(lap);
    }
}