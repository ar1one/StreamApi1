import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveList = new ArrayList<>();
        for(Integer number : list) {
            if(number > 0 && (number % 2 == 0)) {
                positiveList.add(number);
            }
        }
        positiveList.sort(Comparator.naturalOrder());
        positiveList.forEach(System.out::println);
    }
}
