import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Stream-dən istifadə edib tək ədədlərin kvadratlarını tapan program yazın
        List<Integer> ededler = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            ededler.add(i);
        }
        List<Integer> tekEdedler = ededler.stream().filter(eded -> eded % 2 == 1).toList();
       List<Integer>kvadrat= tekEdedler.stream().map(kvadratEdedler -> kvadratEdedler * kvadratEdedler).toList();
        System.out.println(kvadrat);

    }
}