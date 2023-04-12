import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int numbers[] = {2, 5, 4, 10, 7};
        int sum = 0;

        for (int i : numbers) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of even elements: " + sum);
        System.out.println();
        System.out.println("Task #2:");
        a();
    }


    public static void a () {
        String al = "Alexx9800";

        char[] chars = al.toCharArray ();

        ArrayList<Character> list = new ArrayList<Character>();
        for (int i = 0; i < chars.length; i++) {
            if(!list.contains(chars[i])) {
                list.add(chars[i]);
            }
        }
       for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}