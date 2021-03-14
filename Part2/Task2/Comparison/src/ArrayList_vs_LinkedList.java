import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;

public class ArrayList_vs_LinkedList {
    public static void main(String[] args) {
        final int SIZE = 15_000;

        NumberFormat nf = NumberFormat.getInstance(Locale.getDefault());

        System.out.println(
                "============================================================");
        System.out.print("Creating ArrayList with size " + nf.format(SIZE) + ": ");
        long startTime = System.nanoTime();
        ArrayList<Integer> arr = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            arr.add(i);
        }
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.print("Creating LinkedList with size " + nf.format(SIZE) + ": ");
        startTime = System.nanoTime();
        LinkedList<Integer> link = new LinkedList<>(arr);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.println(
                "============================================================");
        System.out.print("Find element at the beginning of ArrayList: ");
        startTime = System.nanoTime();
        int arrIndex = arr.indexOf(0);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.print("Find element at the beginning of LinkedList: ");
        startTime = System.nanoTime();
        int linkIndex = link.indexOf(0);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.println(
                "============================================================");
        System.out.print("Remove element at the beginning of ArrayList: ");
        startTime = System.nanoTime();
        arr.remove(arrIndex);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.print("Remove element at the beginning of LinkedList: ");
        startTime = System.nanoTime();
        link.remove(linkIndex);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.println(
                "============================================================");
        System.out.print("Find element at the middle of ArrayList: ");
        startTime = System.nanoTime();
        arrIndex = arr.indexOf(arr.size() / 2);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.print("Find element at the middle of LinkedList: ");
        startTime = System.nanoTime();
        linkIndex = link.indexOf(link.size() / 2);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.println(
                "============================================================");
        System.out.print("Remove element at the middle of ArrayList: ");
        startTime = System.nanoTime();
        arr.remove(arrIndex);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.print("Remove element at the middle of LinkedList: ");
        startTime = System.nanoTime();
        link.remove(linkIndex);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.println(
                "============================================================");
        System.out.print("Find element at the end of ArrayList: ");
        startTime = System.nanoTime();
        arrIndex = arr.indexOf(arr.size() - 1);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.print("Find element at the end of LinkedList: ");
        startTime = System.nanoTime();
        linkIndex = link.indexOf(link.size() - 1);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.println(
                "============================================================");
        System.out.print("Remove element at the end of ArrayList: ");
        startTime = System.nanoTime();
        arr.remove(arrIndex);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.print("Remove element at the end of LinkedList: ");
        startTime = System.nanoTime();
        link.remove(linkIndex);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));
        System.out.println(
                "============================================================");
    }
}
