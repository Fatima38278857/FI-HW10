import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double dDouble) {
                long l;
                return l = Math.round(dDouble);
            }
        };
        System.out.println(function.apply(25.890));

        Function<Double, Long> function1 = Math::round;
        System.out.println(function1.apply(24.786));
    }
}


