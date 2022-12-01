import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class BracketsCounter {
    /**
     * Обычная реализация
     */
    public String count(String str) {
        int countParam = 0;
        int countParamFin;
        char[] strToArr = str.toCharArray();
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        Deque<Character> stack = new ArrayDeque<>();
        for (char s : strToArr) {
            if (brackets.containsValue(s)) {
                stack.push(s);
            }
            if (brackets.containsKey(s) && !(stack.size() == 0)) {
                stack.pop();
                countParam++;
            }
        }
        countParamFin = countParam * 2;
        return String.valueOf(countParamFin);
    }

    /**
     * Реализация с помощью стрима
     */
    public String countWithStreams(String str) {
        final int[] countParam = {0};
        int countParamFin;

        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        Deque<Character> stack = new ArrayDeque<>();

        str.chars()
                .mapToObj(strToArr -> (char) strToArr)
                .forEach(s -> {
                    if (brackets.containsValue(s)) {
                        stack.push(s);
                    }
                    if (brackets.containsKey(s) && !(stack.size() == 0)) {
                        stack.pop();
                        countParam[0]++;
                    }
                });
        countParamFin = countParam[0] * 2;
        return String.valueOf(countParamFin);
    }
}
