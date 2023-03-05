import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        double a = (int) (Math.random() * 100);
        Supplier<Double> supplier = new Supplier<Double>() {
            public Double get() {
                Double double1 = null;
                return a;
            }
        };
        System.out.println(supplier.get());

        Supplier<Integer> supplier1 = () -> (int) (Math.random() * 100);
        System.out.println(supplier1.get());
}

}
