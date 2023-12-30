class Pair<I, S>{
    I x;
    S y;

    Pair(I x, S y)
    {
        this.x = x;
        this.y = y;
    }
}

public class Generics {
    public static void main(String[] args) {
        Pair<Integer, String> p = new Pair<>(1, "Hello");
        System.out.println(p.x);
    }
}
