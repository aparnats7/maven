package calciPkg;

public class myCalci {
    int sum(int a, int b) {
        return a + b;
    }

    int diff(int a, int b) {
        return a - b;
    }

    int mul(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        myCalci calci = new myCalci();
        System.out.println("Sum is : " + calci.sum(20, 10));
        System.out.println("Diff is : " + calci.diff(20, 10));
    }
}
