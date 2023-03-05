import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept (String s) {
                System.out.println(s + ", приветствую");
            }
        };
        consumer.accept("Марем");

        Consumer<String> consumer1 = x -> System.out.println(x + ", приветствую ");
        consumer1.accept("Мадина");
    }
}


