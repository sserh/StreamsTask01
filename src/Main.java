import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4); //создаём список

        intList.sort(Comparator.naturalOrder()); //сразу отсортируем

        for (int value : intList
             ) {
            //если положительное и чётное - выводим
            if ((value > 0) && (value % 2 == 0)) {
                System.out.println(value);
            }
        }
    }
}