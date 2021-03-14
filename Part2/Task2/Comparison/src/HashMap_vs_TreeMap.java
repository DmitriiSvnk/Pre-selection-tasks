import java.text.NumberFormat;
import java.util.*;

public class HashMap_vs_TreeMap {
    public static void main(String[] args) {
        final int SIZE = 15_000;

        NumberFormat nf = NumberFormat.getInstance(Locale.getDefault());

        System.out.println(
                "============================================================");
        System.out.print("Creating HashMap with size " + nf.format(SIZE) + ": ");
        long startTime = System.nanoTime();
        HashMap<Integer, Integer> hashMap = new HashMap<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            hashMap.put(i, i);
        }
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.print("Creating TreeMap with size " + nf.format(SIZE) + ": ");
        startTime = System.nanoTime();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>(hashMap);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.println(
                "============================================================");
        System.out.print("Find element at the beginning of HashMap: ");
        startTime = System.nanoTime();
        int hashMapGet = hashMap.get(0);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.print("Find element at the beginning of TreeMap: ");
        startTime = System.nanoTime();
        int treeMapGet = treeMap.get(0);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.println(
                "============================================================");
        System.out.print("Remove element at the beginning of HashMap: ");
        startTime = System.nanoTime();
        hashMap.remove(0);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.print("Remove element at the beginning of TreeMap: ");
        startTime = System.nanoTime();
        treeMap.remove(0);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.println(
                "============================================================");
        System.out.print("Find element at the middle of HashMap: ");
        startTime = System.nanoTime();
        hashMapGet = hashMap.get(hashMap.size() / 2);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.print("Find element at the middle of TreeMap: ");
        startTime = System.nanoTime();
        treeMapGet = treeMap.get(treeMap.size() / 2);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.println(
                "============================================================");
        System.out.print("Remove element at the middle of HashMap: ");
        startTime = System.nanoTime();
        hashMap.remove(hashMap.size() / 2);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.print("Remove element at the middle of TreeMap: ");
        startTime = System.nanoTime();
        treeMap.remove(treeMap.size() / 2);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.println(
                "============================================================");
        System.out.print("Find element at the end of HashMap: ");
        startTime = System.nanoTime();
        hashMapGet = hashMap.get(hashMap.size() - 1);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.print("Find element at the end of TreeMap: ");
        startTime = System.nanoTime();
        treeMapGet = treeMap.get(treeMap.size() - 1);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.println(
                "============================================================");
        System.out.print("Remove element at the end of HashMap: ");
        startTime = System.nanoTime();
        hashMap.remove(hashMap.size() - 1);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.print("Remove element at the end of TreeMap: ");
        startTime = System.nanoTime();
        treeMap.remove(treeMap.size() - 1);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));
        System.out.println(
                "============================================================");
    }
}

