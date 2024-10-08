public class Adder {
    public int add (int a, int b){
        return a+ b;
    }
}

public class Substructor {
    publiv int substract (int a, int b){
        retutn a-b;
    }
}

public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(1, 2));

        Substructor substructor = new Substructor();

        System.out.println(substructor.substruct(6, 3));
    }
}
