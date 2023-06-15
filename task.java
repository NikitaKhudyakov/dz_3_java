import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




public class task {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(14, 5, 66, 43, 4, 6, 8, 25, 2, 16, 57, 83, 92, 610, 121, 112, 13, 94));
        Integer[] wordsArray = new Integer[array.size()];
        System.out.println("Наш список - " + array);

        for (int i = 0; i < array.size(); i++) {
            wordsArray[i] = array.get(i);
            if (wordsArray[i] % 2 == 0) {
                array.remove(i);
            }
        }
        System.out.println("Убрали четные - " + array);

        int max = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > max) {
                max = array.get(i);
            }
        }
        System.out.println("MAX = " + max);

        int min = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < min) {
                min = array.get(i);
            }
        }
        System.out.println("MIN = " + min);

        int count_1 = 0;
        int count_2 = 0;
        for (int i = 0; i < array.size(); i++) {
            count_1 = array.get(i) + count_1;
            count_2++;
        }
        System.out.println("Среднее арифметическое = " + count_1/count_2);

    }
}
