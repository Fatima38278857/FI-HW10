import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
      Predicate<Integer> predicate = new Predicate<Integer>() { // Реализация  функционального интерфейса
          @Override
          public boolean test(Integer integer) {
              return integer > 0;
          }
      };
        System.out.println(predicate.test(4));

        Predicate<Integer> predicate1 = x -> x > 0; // Лябда вырожения
        System.out.println(predicate1.test(-2));

    }
}


