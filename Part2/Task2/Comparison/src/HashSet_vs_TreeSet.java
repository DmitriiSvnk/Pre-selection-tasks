import java.text.NumberFormat;
import java.util.*;

public class HashSet_vs_TreeSet {
    public static void main(String[] args) {
        final int SIZE = 15_000;

        NumberFormat nf = NumberFormat.getInstance(Locale.getDefault());

        System.out.println(
                "============================================================");
        System.out.print("Creating HashSet with size " + nf.format(SIZE) + ": ");
        long startTime = System.nanoTime();
        HashSet<Integer> hashSet = new HashSet<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            hashSet.add(i);
        }
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.print("Creating TreeSet with size " + nf.format(SIZE) + ": ");
        startTime = System.nanoTime();
        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.println(
                "============================================================");
        System.out.print("Find element at the beginning of HashSet: ");
        startTime = System.nanoTime();
        boolean hashSetContein = hashSet.contains(0);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.print("Find element at the beginning of TreeSet: ");
        startTime = System.nanoTime();
        boolean treeSetContain = treeSet.contains(0);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.println(
                "============================================================");
        System.out.print("Remove element at the beginning of HashSet: ");
        startTime = System.nanoTime();
        hashSet.remove(0);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.print("Remove element at the beginning of TreeSet: ");
        startTime = System.nanoTime();
        treeSet.remove(0);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.println(
                "============================================================");
        System.out.print("Find element at the middle of HashSet: ");
        startTime = System.nanoTime();
        hashSetContein = hashSet.contains(hashSet.size() / 2);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.print("Find element at the middle of TreeSet: ");
        startTime = System.nanoTime();
        treeSetContain = treeSet.contains(treeSet.size() / 2);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.println(
                "============================================================");
        System.out.print("Remove element at the middle of HashSet: ");
        startTime = System.nanoTime();
        hashSet.remove(hashSet.size() / 2);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.print("Remove element at the middle of TreeSet: ");
        startTime = System.nanoTime();
        treeSet.remove(treeSet.size() / 2);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.println(
                "============================================================");
        System.out.print("Find element at the end of HashSet: ");
        startTime = System.nanoTime();
        hashSetContein = hashSet.contains(hashSet.size() - 1);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.print("Find element at the end of TreeSet: ");
        startTime = System.nanoTime();
        treeSetContain = treeSet.contains(treeSet.size() - 1);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.println(
                "============================================================");
        System.out.print("Remove element at the end of HashSet: ");
        startTime = System.nanoTime();
        hashSet.remove(hashSet.size() - 1);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));

        System.out.print("Remove element at the end of TreeSet: ");
        startTime = System.nanoTime();
        treeSet.remove(treeSet.size() - 1);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(nf.format(totalTime));
        System.out.println(
                "============================================================");
    }
}

