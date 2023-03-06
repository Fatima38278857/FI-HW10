
import java.util.function.Function;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {
        String string = "Я люблю програмировать";

        Function<String, String> function1 = s -> string.substring(0, 5) + " " + string.substring(19);

        Function<String, String> function2 = s -> string.substring(1, 19) +  string.substring(19);

        System.out.println(ternaryOperator(containsS("програмировать "), function1, function2).apply(string));
    }

    public static Predicate<String> containsS(String substrin) {
        return s -> s.contains(substrin);
    }
    public static < function1, function2> Function<String, String> ternaryOperator(Predicate<String> condition, Function<String, String> function1, Function<String, String> function2){
        return x -> (condition.test(x)) ? function1.apply(x) : function2.apply(x);
    }
}
