import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNegativeAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }

        int a = 0;

        while (a < numbers.size()){
            if (numbers.get(a) < 0) {
                numbers.remove(a);
            } else {
                a++;
            }
        }
        Collections.reverse(numbers);
        if (numbers.isEmpty()) {
            System.out.println("empty");
        } else {
            for (Integer number : numbers) {
                System.out.print(number + " ");
            }

        }
    }
}
