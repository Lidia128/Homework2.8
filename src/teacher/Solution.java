package teacher;

import java.util.Objects;

public class Solution {
    private final int number1;
    private final int number2;

    public Solution(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Solution solution = (Solution) o;
        return number1 == solution.number1 && number2 == solution.number2 && number1 == solution.number2 &&
                number2 == solution.number1;
    }
    @Override
    public int hashCode() {
        return Objects.hash(number1 * number2, number1 + number2);
    }

    @Override
    public String toString() {
        return String.format("%s * %s = ?",this.number1,this.number2);
    }
}
