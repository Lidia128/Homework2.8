package teacher;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Calculator {
    private final Set<Solution> solutions = new HashSet<>();
    public Calculator() {
        Random random = new Random();
        while (solutions.size() < 15) {
            solutions.add(new Solution(random.nextInt(2, 10),
                    random.nextInt(2, 10)));
        }
    }
    @Override
    public String toString() {
        return "Calculator{" +
                "solutions=" + solutions +
                '}';
    }
}
}
