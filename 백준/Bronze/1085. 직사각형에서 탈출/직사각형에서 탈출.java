import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        arrayList.add(x);
        arrayList.add(y);
        arrayList.add(h-y);
        arrayList.add(w-x);

        System.out.println(Collections.min(arrayList));
    }
}
