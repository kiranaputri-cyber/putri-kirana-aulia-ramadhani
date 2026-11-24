public class FactorialDemo {
    public int num;

    public FactorialDemo(int num) {
        this.num = num;
    }

    int getFactorial() {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factorial: ").append(num).append("! = ");
        for (int i = 1; i <= num; i++) {
            sb.append(i);
            if (i < num) {
                sb.append(" * ");
            }
        }
        sb.append(" = ").append(getFactorial());
        return sb.toString();
    }

    public static void main(String[] args) {
        FactorialDemo demo = new FactorialDemo(10);
        System.out.println(demo.toString());
    }
}