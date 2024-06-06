import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        int counter = 0;
        try (var reader = new BufferedReader(new FileReader("numbers2.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                counter++;
                list.add(Long.valueOf(line));
            }
        } catch (IOException e) {
            System.err.println("Invalid file path");
        }

        final int TARGET_SUM = 500000;

        List<long[]> pairs = new ArrayList<>();
        Map<Long, Long> elements = new HashMap<>();

        for (long number : list) {
            long complement = TARGET_SUM - number;

            if (elements.getOrDefault(complement, 0L) > 0) {
                long[] pair = new long[]{Math.min(number, complement), Math.max(number, complement)};
                pairs.add(pair);
                elements.put(complement, elements.get(complement) - 1);
            } else {
                elements.put(number, elements.getOrDefault(number, 0L) + 1);
            }
        }

        pairs.sort((a, b) -> {
            if (a[0] != b[0]) return Long.compare(a[0], b[0]);
            return Long.compare(a[1], b[1]);
        });

        for (long[] pair : pairs) {
            System.out.println(pair[0] + " " + pair[1]);
        }
        System.out.println("Counter "  + counter);
    }
}
