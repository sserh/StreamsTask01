import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4); //создаём список

        Stream<Integer> stream = intList.stream();
        stream
                .filter(x -> x > 0) //поток с положительными числами
                .filter(x -> x % 2 == 0) //поток с положительными чётными числами
                .sorted(Comparator.naturalOrder()) //отсортированный поток с положительными чётными числами
                .forEach(System.out::println); //выводим результат

    }
}