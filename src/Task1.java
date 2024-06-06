import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {

        TreeSet<Long> tree = new TreeSet<>();
        int counter = 0;

        try (var reader = new BufferedReader(new FileReader("numbers2.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                counter++;
                tree.add(Long.valueOf(line));
            }
        } catch (IOException e) {
            System.err.println("Invalid file path");
        }


        System.out.println();

        tree.forEach(element -> System.out.print(element + " "));
        System.out.println();
        System.out.println("count: " + counter);
        System.out.println("distinct: " + tree.size());
        System.out.println("min: " + tree.first());
        System.out.println("max: " + tree.last());
    }
}