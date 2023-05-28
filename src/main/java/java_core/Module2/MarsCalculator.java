package java_core.Module2;

public class MarsCalculator {
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public int sub(int a, int b, int c) {
        return a - b - c;
    }

    public int multiply(int a, int b, int c) {
        int d = sum(a, b, c);
        int e = sub(a, b, c);
        return d * e;
    }

    public float divide(int a, int b, int c) {
        float h = (float) (sum(a, b, c)) / 10;
        return h;
    }

    public static void main(String[] args) {
        MarsCalculator marsCalculator = new MarsCalculator();
        int g, h, j;
        float k;

        g = marsCalculator.sum(752, 541, 401);
        h = marsCalculator.sub(752, 541, 401);
        j = marsCalculator.multiply(752, 541, 401);
        k = marsCalculator.divide(752, 541, 401);
        System.out.println(g);
        System.out.println(h);
        System.out.println(j);
        System.out.println(k);
    }
}
